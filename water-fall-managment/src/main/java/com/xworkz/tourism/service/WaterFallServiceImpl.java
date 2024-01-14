package com.xworkz.tourism.service;

import com.xworkz.tourism.dto.WaterFall;
import com.xworkz.tourism.repository.WaterFallRepository;
import com.xworkz.tourism.repository.WaterFallRepositoryImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class WaterFallServiceImpl implements WaterFallService {
    WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();

    @Override
    public void validateAndSaveWaterfall(WaterFall waterFall) {
        // WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();
        if (waterFall.getName() != null && waterFall.getRiverName() != null) {
            waterFallRepository.saveWaterFall(waterFall);
        } else {
            System.out.println("Invalid names please provide correct details");
        }
    }

    @Override
    public void validateAndSaveWaterfall(List<WaterFall> waterFalls) {
//        if(waterFalls.getName()!=null && waterFalls.getRiverName()!=null){
//            waterFallRepository.saveWaterFall(waterFalls);
//        }else{
//            System.out.println("Invalid names please provide correct details");
//        }
//    }
        waterFallRepository.saveWaterFall(waterFalls);
    }

    @Override
    public void validateAndUpdateRiverByName(String waterFallName,String river) {
//        if (waterFallName != null && river != null) {
//            waterFallRepository.saveWaterFall(waterFall);
//        } else {
//            System.out.println("Invalid names please provide correct details");
//        }
  }

    @Override
    public void validateAndDeleteWaterFallByName(String waterFallName) {
        if(waterFallName!=null && !waterFallName.isEmpty()){
            boolean deleted = waterFallRepository.deleteWaterFallByName(waterFallName);
            if (deleted){
                System.out.println("Waterfall is deleted");
            }
        }else {
            System.out.println("Please provide valid name");
        }
    }

    @Override
    public WaterFall validateAndGetWaterFallByName(String WaterFallName) {
        if (WaterFallName!=null && !WaterFallName.isEmpty()){
            WaterFall waterFall=waterFallRepository.getWaterFallByName(WaterFallName);
            System.out.println(waterFall.getState()+ ","+ waterFall.getRiverName() +" "  +waterFall.getPlace()+" "+waterFall.getName() );
            return  waterFall;
        }else {
            System.out.println("Please provide correct water fall name");
        }
        return  null;
    }


}
