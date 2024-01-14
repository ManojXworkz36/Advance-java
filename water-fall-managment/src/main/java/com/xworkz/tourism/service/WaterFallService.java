package com.xworkz.tourism.service;

import com.xworkz.tourism.dto.WaterFall;

import java.util.List;

public interface WaterFallService {
    public  void validateAndSaveWaterfall(WaterFall waterFall);
    public  void validateAndSaveWaterfall(List<WaterFall>waterFalls);

public void validateAndUpdateRiverByName(String waterFallName,String river);

public  void validateAndDeleteWaterFallByName(String waterFallName);

public WaterFall validateAndGetWaterFallByName(String WaterFallName);
}
