package com.example.groupproject.dao;
import com.example.groupproject.entity.House;

import java.util.*;

/** @pdOid 6ecb7046-e251-4d2b-802b-77934a8954a6 */
public interface HouseDao {
   /** @param house
    * @pdOid 32d62d5a-737e-4a31-9da8-b74a52cc86cf */
   void add(House house);
   /** @param house
    * @pdOid f6a6a778-a735-43a7-8b2e-c06b44e6aba3 */
   void update(House house);
   /** @param houseId
    * @pdOid 491f0a84-b9e4-4d8f-8bc9-6f9758d41dab */
   void delete(Integer houseId);
   /** @param houseId
    * @pdOid 8008870c-d38f-49ff-8661-e9def2a7bf2b */
   House queryById(Integer houseId);
   /** @param house
    * @pdOid d27f0a4e-b910-4251-b9bb-1e1f522fc748 */
   List<House> queryCondition(House house);

}