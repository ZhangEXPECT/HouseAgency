package com.example.groupproject.service;
import com.example.groupproject.entity.Order;

import java.util.*;


public interface OrderService {

   void add(Order order);

   void delete(Integer orderId);

   void update(Order order);

   Order queryId(Integer orderId);

   List<Order> queryCondition(Order order);

   List<Order> queryByBuildTime(Date buildTime);

   List<Order> queryBySalePrice(Double salePrice);

   List<Order> queryByOrderStatus(String orderStatus);

}