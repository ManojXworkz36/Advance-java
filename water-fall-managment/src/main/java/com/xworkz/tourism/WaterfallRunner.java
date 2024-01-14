package com.xworkz.tourism;

import com.xworkz.tourism.dto.WaterFall;
import com.xworkz.tourism.repository.WaterFallRepository;
import com.xworkz.tourism.repository.WaterFallRepositoryImpl;
import com.xworkz.tourism.service.WaterFallServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class WaterfallRunner {
    public static void main(String[] args) {
      //  WaterFallRepository waterFallRepository = new WaterFallRepositoryImpl();
        WaterFallServiceImpl waterFallService = new WaterFallServiceImpl();

       WaterFall waterFall = new WaterFall("Jog Falls","Sharavati","Shivmogga","Karnataka");
        WaterFall waterFall1 = new WaterFall("Abbe falls","chambal","DudhSagar","Goa");

      //  waterFallRepository.saveWaterFall(waterFall1);

        List<WaterFall>waterFalls=new ArrayList<>();
        waterFalls.add(waterFall1);

       // waterFallService.validateAndSaveWaterfall(waterFalls);

        //waterFallService.validateAndUpdateRiverByName("krishna","jog falls");
      //  waterFallService.validateAndDeleteWaterFallByName("jog falls");
        waterFallService.validateAndGetWaterFallByName("abbe falls");
    }


}
