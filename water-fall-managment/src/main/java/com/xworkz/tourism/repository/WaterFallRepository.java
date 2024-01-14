package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFall;

import java.util.List;

public interface WaterFallRepository {
    public void saveWaterFall(WaterFall waterFall);

    public void saveWaterFall(List<WaterFall>waterFalls);
    public  void updateRiverByName(String waterFallName,String river);

    public boolean deleteWaterFallByName(String waterFallName);

    public WaterFall getWaterFallByName(String WaterFallName);
}
