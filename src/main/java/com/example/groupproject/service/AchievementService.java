package com.example.groupproject.service;

import com.example.groupproject.entity.Order;
import com.example.groupproject.utils.Achievement;

import java.util.List;
import java.util.stream.Stream;

/**
 * Author:甘舟
 * Data:2022/6/21
 */
public interface AchievementService {

    List<Order> getMyManageOrder(Integer empId);
    Achievement getMyAchievement(Integer empId,Integer quarter);
    Stream<Achievement> achievementRankList(Integer type,Integer quarter);
}
