package com.example.groupproject.service.impl;
import com.example.groupproject.dao.ClientDao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

   @Autowired
   private ClientDao clientDao;

   public void add(Client client) {
      this.clientDao.add(client);
   }

   public void update(Client client) {
      // TODO: implement
      this.clientDao.update(client);
   }

   public void delete(Integer clientId) {
      // TODO: implement
      this.clientDao.delete(clientId);
   }

   public List<Client> queryId(Integer id) {
      // TODO: implement
      return null;
   }

   public List<Client> queryCondition(Client client) {
      return this.clientDao.queryCondition(client);
   }

   public void register(Client client) {
      System.out.println(client);
      this.clientDao.add(client);
      List<Client> list = this.clientDao.queryCondition(client);
      System.out.println(list.get(0));

   }

   public void updatePwd(String oldPassword, String accPassword, Client client) {
      // TODO: implement
   }

   public void updatePhone(Integer clientId, Integer clientPhone) {

   }

   public List<House> queryMyHouse(Integer clientId) {

      return this.clientDao.getHouseByClientId(clientId);
   }

   public List<Order> queryPurchase(Integer clientId) {
      // TODO: implement
      return null;
   }

   public Object login(Client client) {
      Client obj = new Client();
      obj.setClientAccount(client.getClientAccount());
      List<Client> list = this.clientDao.queryCondition(obj);
      if(list == null || list.isEmpty()){
         return "用户不存在";
      }else if(list.get(0).getClientPassword().equals(client.getClientPassword())){
         return list.get(0);
      }else {
         return "密码错误";
      }
   }

//   public page findByPage(Integer currentPage, Integer rows) {
//      // TODO: implement
//      return null;
//   }

}