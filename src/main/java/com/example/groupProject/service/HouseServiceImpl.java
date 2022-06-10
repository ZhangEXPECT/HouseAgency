package com.example.groupProject.service;
import com.example.groupProject.dao.HouseDao;
import com.example.groupProject.entity.House;

import java.util.*;

/** @pdOid 8dd856a8-31b3-4df6-8c0b-777bd19d30ea */
public class HouseServiceImpl implements HouseService {
   /** @pdOid 19f4c034-9a71-4b14-a805-474515f45738 */
   private HouseDao HouseDao;
   
   /** @param houseType
    * @pdOid 521b09bf-76a9-46de-bbee-ca8bc6f4a819 */
   public List<House> queryByType(String houseType) {
      // TODO: implement
      return null;
   }
   
   /** @param houseArea
    * @pdOid a9a9b4cd-38d8-4b82-bf91-d6344b8ca595 */
   public List<House> queryByArea(String houseArea) {
      // TODO: implement
      return null;
   }
   
   /** @param minPrice 
    * @param maxPrice
    * @pdOid 26cbbd83-d2b8-4020-82d3-8e85730100d4 */
   public List<House> queryByPrice(double minPrice, double maxPrice) {
      // TODO: implement
      return null;
   }
   
   /** @param city
    * @pdOid 5ed33559-1c67-49e8-8872-1b5f5500fa18 */
   public List<House> queryByCity(String city) {
      // TODO: implement
      return null;
   }
   
   /** @param houseId
    * @pdOid 0bc63815-1be2-4f49-8555-213253e5d720 */
   public House updatePrice(Integer houseId) {
      // TODO: implement
      return null;
   }
   
   /** @param house
    * @pdOid 56786666-1683-4e83-9fc1-93e0c5b0907b */
   public void add(House house) {
      // TODO: implement
   }
   
   /** @param house
    * @pdOid 3dd41d15-5ced-4676-bd79-275e002d94ec */
   public void update(House house) {
      // TODO: implement
   }
   
   /** @param houseId
    * @pdOid 73a07a9d-6d67-42cd-adeb-20b042331375 */
   public void delete(Integer houseId) {
      // TODO: implement
   }
   
   /** @param houseId
    * @pdOid bdecbb37-2b87-4496-8aab-d932270b1786 */
   public House queryById(Integer houseId) {
      // TODO: implement
      return null;
   }
   
   /** @param house
    * @pdOid 1b74cb42-bdd5-4809-a079-4812e5aeefce */
   public List<House> queryCondition(House house) {
      // TODO: implement
      return null;
   }

}