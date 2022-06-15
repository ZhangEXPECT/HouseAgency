package com.example.groupproject.dao.impl;
import com.example.groupproject.dao.ClientDao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;

import java.util.*;

/** @pdOid da987fbf-0fc0-4074-9a93-cb5b62361dbd */
public class ClientDaoImpl implements ClientDao {
   /** @param client
    * @pdOid 7a24fc4b-a769-49e5-b07b-5fdac82a594f */
   public void add(Client client) {
      // TODO: implement
   }

   public void update(Client client) {
      // TODO: implement
   }

   public void delete(Integer clientId) {
      // TODO: implement
   }

   public Client queryId(Integer clientId) {
      // TODO: implement
      return null;
   }
   
   /** @param client
    * @pdOid f59a58ec-e7f4-402c-bb85-ea053ea6c5c1 */
   public List<Client> queryCondition(Client client) {
      // TODO: implement
      return null;
   }
   public List<House> getHouseByClientId(Integer clientId){
      return null;
   }
}