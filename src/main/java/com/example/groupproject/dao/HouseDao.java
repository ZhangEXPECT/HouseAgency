package com.example.groupproject.dao;
import com.example.groupproject.entity.House;
import com.example.groupproject.utils.PageBeans;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.*;

@Mapper
public interface HouseDao {
   /** @param house* */
   void add(House house);
   /** @param house*/
   void update(House house);
   /** @param houseId*/
   void delete(Integer houseId);
   /** @param houseId*/
   House queryById(Integer houseId);
   /** @param house*/
   List<House> queryCondition(House house);

   List<House> queryByArea(Integer minHouseArea,Integer maxHouseArea );

   List<House> queryByPrice(Double minPrice, Double maxPrice);

   Integer queryCount();

   List<House> queryByPage(@Param("house") House house ,@Param("pageStart") Integer pageStart,@Param("pageSize") Integer pageSize);
//   List<House> queryByPage(Integer pageStart, Integer pageSize);

   House getImgByHouseId(Integer houseId);
}