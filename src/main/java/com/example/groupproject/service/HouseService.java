package com.example.groupproject.service;
import com.example.groupproject.entity.House;

import java.util.*;

/** @pdOid 3a71317e-5625-4c61-ac5b-715ee4fdbf49 */
public interface HouseService {
   /** @param house
    * @pdOid 32e93ca8-028e-448c-ba6b-c44e8bc236e4 */
   void add(House house);
   /** @param house
    * @pdOid 83e145e8-0bba-4b76-935a-37b6cddddfdc */
   void update(House house);
   /** @param houseId
    * @pdOid 15038516-ae76-452b-938b-7ca8d4c68acd */
   void delete(Integer houseId);
   /** @param houseId
    * @pdOid f3ae3b72-3e15-4be3-96a7-d1f58b56c069 */
   House queryById(Integer houseId);
   /** @param house
    * @pdOid b974a216-4b61-4744-abde-9d294b734277 */
   List<House> queryCondition(House house);
   /** @param houseType
    * @pdOid ebe2ae7e-e957-4382-a1df-8f046b98dce9 */
   List<House> queryByType(String houseType);
   /** @param houseArea
    * @pdOid 8fa5722f-0e01-4216-9721-f803895a2ed1 */
   List<House> queryByArea(String houseArea);
   /** @param minPrice 
    * @param maxPrice
    * @pdOid 1a5bfc5e-e3a2-46e1-a832-641f26e564c9 */
   List<House> queryByPrice(double minPrice, double maxPrice);
   /** @param city
    * @pdOid 1c9433f1-bd7f-4ba0-9ad7-d0c7b82210cf */
   List<House> queryByCity(String city);
   /** @param houseId
    * @pdOid 33a34834-7f14-4ae6-abce-20f1d881c79d */
   House updatePrice(Integer houseId);

}