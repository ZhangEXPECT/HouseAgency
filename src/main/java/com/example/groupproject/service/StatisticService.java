package com.example.groupproject.service;


import java.util.Date;
import java.util.List;

public interface StatisticService {

    Integer queryByPrice(Double minPrice, Double maxPrice);

    Integer queryCount();

    //房源统计
    List houseStatistic();

    Integer querySeller();

    Integer queryBuyer();

    Integer queryClientCount();

    //客源统计
    List clientStatistic();

    Integer queryOrderCount();

    Integer queryDoneOrder();

    //营业额统计
    List turnoverStatistic(Date startTime,Date endTime);


}
