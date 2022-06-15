package com.example.groupproject.service.impl;

import com.example.groupproject.dao.OrderDao;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional   //在代码执行出错的时候能够进行事务的回滚。
public class OrderServiceImpl implements OrderService {

   @Autowired
   private OrderDao orderDao;

   /** @param order
    **/
   public void add(Order order) {
       this.orderDao.add(order);
   }
   
   /** @param orderId
    **/
   public void delete(Integer orderId) {
      this.orderDao.delete(orderId);
   }
   
   /** @param order
    **/
   public void update(Order order) {
      this.orderDao.update(order);
   }
   
   /** @param orderId
    **/
   public Order queryId(Integer orderId) {
      Order order = new Order();
      order.setOrderId(orderId);
      List<Order> list = this.orderDao.queryCondition(order);
      return list.get(0);
   }
   
   /** @param order
    **/
   public List<Order> queryCondition(Order order) {
      return this.orderDao.queryCondition(order);
   }
   
   /** @param buildTime
    **/
   public List<Order> queryByBuildTime(Date buildTime) {
      Order order = new Order();
      order.setBuildTime(buildTime);
      List<Order> list = this.orderDao.queryCondition(order);
      return list;
   }


   /** @param salePrice
    **/
   public List<Order> queryBySalePrice(Double salePrice) {
      Order order = new Order();
      order.setSalePrice(salePrice);
      List<Order> list = this.orderDao.queryCondition(order);
      return list;

   }

   /** @param orderStatus
    **/
   public List<Order> queryByOrderStatus(String orderStatus) {
      Order order = new Order();
      order.setOrderStatus(orderStatus);
      List<Order> list = this.orderDao.queryCondition(order);
      return list;
   }

}