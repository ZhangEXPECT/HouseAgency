package com.example.groupproject.service;

import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.utils.Result;

import java.util.*;

public interface ClientService {

   Result add(Client client);

   Result update(Client client);

   Result delete(Integer clientId);

   Client queryId(Integer clientId);

   List<Client> queryCondition(Client client);

   Result login(Client client);

   Result register(Client client);

   Result updatePwd(String oldPassword, String accPassword, Integer clientId);

   Result updatePhone(Integer clientId, String clientPhone);

   List<House> queryMyHouse(Integer clientId);

   List<Order> queryPurchase(Integer clientId);

//   page findByPage(Integer currentPage, Integer rows);

}