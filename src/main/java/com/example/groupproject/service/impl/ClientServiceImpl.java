package com.example.groupproject.service.impl;
import com.example.groupproject.dao.ClientDao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.ClientService;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

   @Autowired
   private ClientDao clientDao;

   /**
    * 用户添加
    * @param client
    */
   public Result add(Client client) {
      Client client1 = new Client();
      client1.setClientAccount(client.getClientAccount());
      if(this.clientDao.queryCondition(client1) == null || this.clientDao.queryCondition(client1).isEmpty()){
         this.clientDao.add(client);
         return new Result(ResultCodeEnum.ADD_SUCCESS);
      }else {
         return new Result(ResultCodeEnum.ADD_FAIL,"该用户名已存在");
      }
   }

   /**
    * 用户修改
    * @param client
    */
   public Result update(Client client) {
      Client client1 = new Client();
      client1.setClientAccount(client.getClientAccount());
      if(this.clientDao.queryCondition(client1) == null || this.clientDao.queryCondition(client1).isEmpty()){
         return new Result(ResultCodeEnum.UPDATE_FAIL,"用户名不存在，请更换");
      }else {
         this.clientDao.update(client);
         return new Result(ResultCodeEnum.UPDATE_SUCCESS);
      }
   }

   /**
    * 用户删除
    * @param clientId
    */
   public Result delete(Integer clientId) {
      Client client = new Client();
      client.setClientId(clientId);
      if(this.clientDao.queryCondition(client) == null || this.clientDao.queryCondition(client).isEmpty()){
         return new Result(ResultCodeEnum.DELETE_FAIL,"该用户不存在");
      }else {
         this.clientDao.delete(clientId);
         return new Result(ResultCodeEnum.DELETE_SUCCESS);

      }
   }

   /**
    * 通过Id查询
    * @param clientId
    * @return
    */
   @Transactional(readOnly = true)
   public Client queryId(Integer clientId) {
      // TODO: implement
      return this.clientDao.queryId(clientId);
   }

   /**
    * 动态查询用户
    * @param client
    * @return
    */
   @Transactional(readOnly = true)
   public List<Client> queryCondition(Client client) {

      return this.clientDao.queryCondition(client);
   }

   /**
    * 注册
    * @param client
    */
   public Result register(Client client) {
      Client client1 = new Client();
      client1.setClientAccount(client.getClientAccount());
      if(this.clientDao.queryCondition(client).isEmpty()){
         this.clientDao.add(client);
         List<Client> list = this.clientDao.queryCondition(client);
         return new Result(200,"注册成功",list);
      }else {
         return new Result(201,"该用户名已存在");
      }
   }

   /**
    * 修改密码
    */
   public Result updatePwd(String oldPassword, String accPassword, Integer clientId) {
      Client client = this.clientDao.queryId(clientId);
      if(client == null){
         System.out.println(client);
         return new Result(203,"该用户未找到");
      }else {
         if(client.getClientPassword().equals(oldPassword)){
            client.setClientPassword(accPassword);
            this.clientDao.update(client);
            return new Result(ResultCodeEnum.SUCCESS);
         }else {
            return new Result(ResultCodeEnum.FAIL,"密码错误");
         }
      }
   }

   public Result updatePhone(Integer clientId, String clientPhone) {
      Client client = this.clientDao.queryId(clientId);
      if(client == null){
         System.out.println(client);
         return new Result(203,"该用户未找到");
      }else {
         client.setClientPhone(clientPhone);
         return new Result(ResultCodeEnum.SUCCESS);
      }
   }

   /**
    * 查询自己发布的房子
    * @param clientId
    * @return
    */
   @Transactional(readOnly = true)
   public List<House> queryMyHouse(Integer clientId) {
      return this.clientDao.getHouseByClientId(clientId);
   }

   /**
    * 查询自己购买房子的订单
    * @param clientId
    * @return
    */
   @Transactional(readOnly = true)
   public List<Order> queryPurchase(Integer clientId) {
      return this.clientDao.getOrderByClientId(clientId);
   }

   /**
    * 登录
    * @param client
    * @return
    */
   public Result login(Client client) {
      Client obj = new Client();
      obj.setClientAccount(client.getClientAccount());
      List<Client> list = this.clientDao.queryCondition(obj);
      if(list == null || list.isEmpty()){
         return new Result(201,"用户不存在");
      }else if(list.get(0).getClientPassword().equals(client.getClientPassword())){
         return new Result(200,"登录成功",list.get(0));
      }else {
         return new Result(201,"密码错误");
      }
   }

//   public page findByPage(Integer currentPage, Integer rows) {
//      // TODO: implement
//      return null;
//   }

}