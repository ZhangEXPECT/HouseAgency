package com.example.groupproject.service.impl;

import com.example.groupproject.dao.HouseDao;
import com.example.groupproject.dao.StatisticsDao;
import com.example.groupproject.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
 * @author: EXPECT
 * @create: 2022-06-21
 * @version: 1.0
 */
@Service
@Transactional
public class StatisticsImpl implements StatisticsService {

    @Autowired
    private StatisticsDao statisticsDao;


    @Override
    public Integer queryByPrice(Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }
}
