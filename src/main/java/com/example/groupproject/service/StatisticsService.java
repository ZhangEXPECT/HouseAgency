package com.example.groupproject.service;



public interface StatisticsService {

    Integer queryByPrice(Double minPrice, Double maxPrice);

    Integer queryCount();
}
