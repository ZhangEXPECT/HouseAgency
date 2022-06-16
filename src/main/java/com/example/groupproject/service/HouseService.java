package com.example.groupproject.service;
import com.example.groupproject.entity.House;
import com.example.groupproject.utils.PageBeans;


import java.util.*;

public interface HouseService {


   void add(House house);

   void update(House house);

   void delete(Integer houseId);

   House queryById(Integer houseId);

   List<House> queryCondition(House house);

   List<House> queryByType(String houseType);

   List<House> queryByCity(String city);

   List<House> queryByArea(Integer minHouseArea,Integer maxHouseArea );

   List<House> queryByPrice(Double minPrice, Double maxPrice);

   Integer queryCount();

   PageBeans<House> queryByPage(House house,Integer pageStart, Integer pageSize);
//
//   Page<Job> selectPage(Page page, JobVO jobVO) throws Exception;
   House updatePrice(Integer houseId);

}