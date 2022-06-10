package com.example.groupproject.service;

import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;

import java.util.*;

/** @pdOid 04c76a7a-83e6-4dbf-ae32-6b4a8393f485 */
public interface ClientService {
   /** @param client
    * @pdOid 6dd0f230-aeb0-470e-b18e-f51785bf7e94 */
   void add(Client client);
   /** @param client
    * @pdOid d9a7a9d9-0433-46ce-8a2e-e2331324464b */
   void update(Client client);
   /** @param id
    * @pdOid 43688bd1-c1f1-4850-9bd8-ed09aea8bff7 */
   void delete(Integer id);
   /** @param id
    * @pdOid 3968536e-9dfb-4e18-bee8-677840300225 */
   List<Client> queryId(Integer id);
   /** @param client
    * @pdOid a76750db-7144-41b8-8a4c-3b32e1868d3f */
   List<Client> queryCondition(Client client);
   /** @param accName 
    * @param accPassword
    * @pdOid 3f90008a-908c-4def-9324-8e0149a75c32 */
   List<Client> login(String accName, String accPassword);
   /** @param client
    * @pdOid 58b9af3d-6a03-4f07-bb33-b65028a447b4 */
   void register(Client client);
   /** @param oldPassword 
    * @param accPassword 
    * @param client
    * @pdOid 45c608c1-b239-48cf-a529-603465ae67b5 */
   boolean updatePwd(String oldPassword, String accPassword, Client client);
   /** @param clientId 
    * @param clientPhone
    * @pdOid bc9eb4cd-0ae5-43ae-aec8-6679e8673de7 */
   boolean updatePhone(Integer clientId, Integer clientPhone);
   /** @param clientId
    * @pdOid c08e8f24-38cb-4920-b171-e3a37f35e1aa */
   List<House> queryMyHouse(Integer clientId);
   /** @param clientId
    * @pdOid 421ed32c-25bd-4670-8096-a44bfa8be3b9 */
   List<Order> queryPurchase(Integer clientId);
   /** @param currentPage 
    * @param rows
    * @pdOid 3ba3fd2e-be4a-4ea6-aef8-d4c28aa38281 */
//   page findByPage(Integer currentPage, Integer rows);

}