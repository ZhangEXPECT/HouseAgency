package com.example.groupproject.service;
import com.example.groupproject.entity.House;

import java.util.*;

public interface HouseService {


   void add(House house);

   void update(House house);

   void delete(Integer houseId);

   House queryById(Integer houseId);

   List<House> queryCondition(House house);

   List<House> queryByType(String houseType);

   List<House> queryByArea(Integer minHouseArea,Integer maxHouseArea );

   List<House> queryByPrice(double minPrice, double maxPrice);

   List<House> queryByCity(String city);
   House updatePrice(Integer houseId);

}