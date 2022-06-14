package com.example.groupproject.service;
import com.example.groupproject.entity.Order;

import java.util.*;


public interface OrderService {

   void add(Order order);

   void delete(Integer orderId);

   void update(Order order);

   Order queryId(Integer orderId);

   List<Order> queryCondition(Order order);

   List<Order> queryByBuildTime(Date startTime, Date endTime);

   List<Order> queryBySalePrice(double lowestPrice, double highestPrice);

   List<Order> queryByOrderStatus(String orderStatus);

}