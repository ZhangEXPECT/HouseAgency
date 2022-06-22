package com.example.groupproject.dao;

import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface StatisticDao {

    Integer queryByPrice(Double minPrice, Double maxPrice);

    Integer queryCount();

    Integer querySeller();

    Integer queryBuyer();

    Integer queryClientCount();

    Integer queryOrderCount();

    Integer queryDoneOrder();

    Order queryBySeason();






}
