package com.example.groupproject.service;
import com.example.groupproject.dao.HouseDao;
import com.example.groupproject.entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional   //在代码执行出错的时候能够进行事务的回滚。
public class HouseServiceImpl implements HouseService {

   @Autowired
   private HouseDao houseDao;

   
   /** @param houseType
    **/
   @Override
   @Transactional(readOnly = true)
   public List<House> queryByType(String houseType) {
      // TODO: implement
      return null;
   }
   
   /** @param houseArea
    **/
   @Override
   public List<House> queryByArea(String houseArea) {
      // TODO: implement
      return null;
   }
   
   /** @param minPrice
    * @param maxPrice
    **/
   @Override
   public List<House> queryByPrice(double minPrice, double maxPrice) {
      // TODO: implement
      return null;
   }
   
   /** @param city
    **/
   @Override
   public List<House> queryByCity(String city) {
      // TODO: implement
      return null;
   }
   
   /** @param houseId
    **/
   @Override
   public House updatePrice(Integer houseId) {
      // TODO: implement
      return null;
   }
   
   /** @param house
    **/
   @Override
   public void add(House house) {
      this.houseDao.add(house);
   }
   
   /** @param house
    **/
   @Override
   public void update(House house) {
      this.houseDao.update(house);
   }
   
   /** @param houseId
    **/
   @Override
   public void delete(Integer houseId) {
      this.houseDao.delete(houseId);
   }
   
   /** @param houseId
    **/
   @Override
   public House queryById(Integer houseId) {
      // TODO: implement
      return null;
   }
   
   /** @param house
    **/
   @Override
   public List<House> queryCondition(House house) {
      return this.houseDao.queryCondition(house);
   }

}