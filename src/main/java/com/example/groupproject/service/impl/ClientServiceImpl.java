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

   /**
    * 注册
    * @param client
    */
   public Client register(Client client) {
      this.clientDao.add(client);
      List<Client> list = this.clientDao.queryCondition(client);
      return list.get(0);
   }

   /**
    * 修改密码
    *
    */
   public void updatePwd(String oldPassword, String accPassword, Integer clientId) {
      // TODO: implement
   }

   public void updatePhone(Integer clientId, Integer clientPhone) {

   }

   /**
    * 查询自己发布的房子
    * @param clientId
    * @return
    */
   public List<House> queryMyHouse(Integer clientId) {
      return this.clientDao.getHouseByClientId(clientId);
   }

   /**
    * 查询自己购买房子的订单
    * @param clientId
    * @return
    */
   public List<Order> queryPurchase(Integer clientId) {
      return this.clientDao.getOrderByClientId(clientId);
   }

   /**
    * 登录
    * @param client
    * @return
    */
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