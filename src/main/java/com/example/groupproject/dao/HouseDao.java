package com.example.groupproject.dao;
import com.example.groupproject.entity.House;
import org.apache.ibatis.annotations.Mapper;

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
}