package com.example.groupproject.dao;

import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface OrderDao {
    /**
     * @param order
     */
    void add(Order order);

    /**
     * @param orderId
     */
    void delete(Integer orderId);

    /**
     * @param order
     */
    void update(Order order);

    /**
     * @param orderId
     */
    Order queryId(Integer orderId);

    /**
     * @param order
     */
    List<Order> queryCondition(Order order);

    /**
     * @param minPrice
     * @param maxPrice
     */
    List<Order> queryBySalePrice(Double minPrice, Double maxPrice);

    List<Order> queryByBuildTime(Date minDate, Date maxDate);




}