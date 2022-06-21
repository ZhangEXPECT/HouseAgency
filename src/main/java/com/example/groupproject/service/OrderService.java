package com.example.groupproject.service;
import com.example.groupproject.entity.Order;
import com.example.groupproject.utils.Result;

import java.util.*;


public interface OrderService {

   Result add(Order order);

   Result delete(Integer orderId);

   Result update(Order order);

   Order queryId(Integer orderId);

   List<Order> queryCondition(Order order);

   List<Order> queryByBuildTime(Date minDate,Date maxDate);

   List<Order> queryByOrderStatus(String orderStatus);

   List<Order> queryBySalePrice(Double minPrice, Double maxPrice);

}