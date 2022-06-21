package com.example.groupproject.dao;

import com.example.groupproject.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface StatisticsDao {

    Integer queryByPrice(Double minPrice, Double maxPrice);

    Integer queryCount();
}
