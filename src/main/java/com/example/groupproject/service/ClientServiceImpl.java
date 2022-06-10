package com.example.groupproject.service;
import com.example.groupproject.dao.ClientDao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;

import java.util.*;


public class ClientServiceImpl implements ClientService {

   private ClientDao ClientDao;
   
   /** @param client
    * @pdOid b86c9f6b-b121-4f7f-b35c-8cc60fb5d2ac */
   public void add(Client client) {
      // TODO: implement
   }
   
   /** @param client
    * @pdOid 69599fdc-8d0e-49c1-9de3-8b5a0cc303a0 */
   public void update(Client client) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid e693e832-e5b6-4728-9575-66e00dc25ff4 */
   public void delete(Integer id) {
      // TODO: implement
   }
   
   /** @param id
    * @pdOid 8495f9f5-092f-4fef-9301-16c33873e940 */
   public List<Client> queryId(Integer id) {
      // TODO: implement
      return null;
   }
   
   /** @param client
    * @pdOid 9089dbba-bb4b-494c-9a77-f0093771fdcf */
   public List<Client> queryCondition(Client client) {
      // TODO: implement
      return null;
   }
   
   /** @param client
    * @pdOid 9fb30a9c-f709-4aad-8402-31231f264417 */
   public void register(Client client) {
      // TODO: implement
   }
   
   /** @param oldPassword 
    * @param accPassword 
    * @param client
    * @pdOid f8a944d8-a51d-44ee-931e-5297757bd7df */
   public boolean updatePwd(String oldPassword, String accPassword, Client client) {
      // TODO: implement
      return false;
   }
   
   /** @param clientId 
    * @param clientPhone
    * @pdOid 8a9e2b6f-778e-4bcc-8fd3-4610e5608f91 */
   public boolean updatePhone(Integer clientId, Integer clientPhone) {
      // TODO: implement
      return false;
   }
   
   /** @param clientId
    * @pdOid 78e3d87f-8863-45f6-9321-f969373c1625 */
   public List<House> queryMyHouse(Integer clientId) {
      // TODO: implement
      return null;
   }
   
   /** @param clientId
    * @pdOid 8befac83-25bf-47c4-96e4-ffca781646cf */
   public List<Order> queryPurchase(Integer clientId) {
      // TODO: implement
      return null;
   }
   
   /** @param accName 
    * @param accPassword
    * @pdOid 9c767c02-30ee-47f1-a3fa-623ef4e66604 */
   public List<Client> login(String accName, String accPassword) {
      // TODO: implement
      return null;
   }
   
   /** @param currentPage 
    * @param rows
    * @pdOid 2bdc32ec-62ff-4a6f-a245-820d94b17fb4 */
//   public page findByPage(Integer currentPage, Integer rows) {
//      // TODO: implement
//      return null;
//   }

}