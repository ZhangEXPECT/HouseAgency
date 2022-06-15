package com.example.groupproject.service;
import com.example.groupproject.dao.ClientDao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
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
      // TODO: implement
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
      // TODO: implement
      return null;
   }

   public List<Order> queryPurchase(Integer clientId) {
      // TODO: implement
      return null;
   }

   public List<Client> login(String accName, String accPassword) {
      // TODO: implement
      return null;
   }

//   public page findByPage(Integer currentPage, Integer rows) {
//      // TODO: implement
//      return null;
//   }

}