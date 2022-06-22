package com.example.groupproject.controller;

import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.AchievementService;
import com.example.groupproject.utils.Achievement;
import com.example.groupproject.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

/**
 * Author:甘舟
 * Data:2022/6/22
 */
@RestController
@Api(tags = "绩效管理控制器")
@RequestMapping
public class AchievementController {
    @Autowired
    private AchievementService achievementService;

    @GetMapping("/getOrderByEmpId")
    @ApiOperation("获取员工达成的订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "客户Id", dataType = "int"),
    })
    public Result getMyManageOrder(Integer empId){
        List<Order> list = this.achievementService.getMyManageOrder(empId);
        return new Result(200,"成功",list);
    }
    @GetMapping("/getMyAchievement")
    @ApiOperation("获取员工的提成")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "客户Id", dataType = "int"),
            @ApiImplicitParam(name = "quarter", value = "季度(0:全部;1:一季度;2:二季度;3:三季度;4:四季度;)", dataType = "int"),
    })
    public Result getMyAchievement(Integer empId,Integer quarter){
        Achievement achievement = this.achievementService.getMyAchievement(empId,quarter);
        return new Result(200,"成功",achievement);
    }
    @GetMapping("/achievementRankList")
    @ApiOperation("员工排行榜")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "榜单类型(1:提成金额;2:订单数量;)", dataType = "int"),
            @ApiImplicitParam(name = "quarter", value = "季度(0:全部;1:一季度;2:二季度;3:三季度;4:四季度;)", dataType = "int"),
    })
    public Result achievementRankList(Integer type,Integer quarter){
        Stream<Achievement> list = this.achievementService.achievementRankList(type,quarter);
        return new Result(200,"成功",list);
    }
}
