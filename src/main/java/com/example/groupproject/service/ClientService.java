package com.example.groupproject.service;

import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;

import java.util.*;

public interface ClientService {

   void add(Client client);

   void update(Client client);

   void delete(Integer clientId);

   List<Client> queryId(Integer id);

   List<Client> queryCondition(Client client);

   List<Client> login(String accName, String accPassword);

   void register(Client client);

   void updatePwd(String oldPassword, String accPassword, Client client);

   void updatePhone(Integer clientId, Integer clientPhone);

   List<House> queryMyHouse(Integer clientId);

   List<Order> queryPurchase(Integer clientId);

//   page findByPage(Integer currentPage, Integer rows);

}