package com.example.groupproject.service;

import com.example.groupproject.entity.Order;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/6/21
 */
public interface AchievementService {

    List<Order> getMyManageOrder(Integer empId);
    Double getMyAchievement(Integer empId);
    List achievementRankList();
}
