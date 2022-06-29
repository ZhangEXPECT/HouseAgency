package com.example.groupproject.service;
import com.example.groupproject.entity.House;
import com.example.groupproject.utils.PageBeans;
import com.example.groupproject.utils.Result;


import java.util.*;

public interface HouseService {


   Result add(House house);

   Result update(House house);

   Result delete(Integer houseId);

   House queryById(Integer houseId);

   House getImgByHouseId(Integer houseId);

   List<House> queryCondition(House house);

   List<House> queryByType(String houseType);

   List<House> queryByCity(String city);

   List<House> queryByArea(Integer minHouseArea,Integer maxHouseArea );

   List<House> queryByPrice(Double minPrice, Double maxPrice);

   Integer queryCount();

   PageBeans<House> queryByPage(House house, Integer pageStart, Integer pageSize);

   List<House> changeHouseStatus();

   List<House> queryByStatus(String houseStatus);

   List<House> queryAll();

   Result changeStatusById(Integer houseId);
}