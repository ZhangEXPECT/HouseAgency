package com.example.groupproject.service;

import com.example.groupproject.dao.OrderDao;
import com.example.groupproject.entity.Order;
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
      // TODO: implement
      return null;
   }
   
   /** @param order
    **/
   public List<Order> queryCondition(Order order) {
      return this.orderDao.queryCondition(order);
   }
   
   /** @param startTime 
    * @param endTime
    **/
   public List<Order> queryByBuildTime(Date startTime, Date endTime) {
      // TODO: implement
      return null;
   }
   
   /** @param lowestPrice 
    * @param highestPrice
    **/
   public List<Order> queryBySalePrice(double lowestPrice, double highestPrice) {
      // TODO: implement
      return null;
   }
    
   /** @param orderStatus
    **/
   public List<Order> queryByOrderStatus(String orderStatus) {
      // TODO: implement
      return null;
   }

}