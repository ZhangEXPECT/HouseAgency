package com.example.groupproject.controller;
/**
 * @description: 统计模块控制器
 * @author: EXPECT
 * @create: 2022-06-21
 * @version: 1.0
 */

import com.example.groupproject.entity.House;
import com.example.groupproject.service.StatisticService;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "统计管理控制器")
@RequestMapping("/static")
public class StatisticsController {
    @Autowired
    private StatisticService statisticsService;

    //房源发布总数
    @GetMapping("/queryCount")
    @ApiOperation("房源总数")
    @ResponseBody
    public Result queryCount() {
        Integer i = this.statisticsService.queryCount();
        return new Result(ResultCodeEnum.SUCCESS,i);
    }

    //价格比例
    @GetMapping("/houseStatistic")
    @ApiOperation("房源价格比例统计")
    @ResponseBody
    public Result houseStatistic() {
        List list =  this.statisticsService.houseStatistic();
        return new Result(ResultCodeEnum.SUCCESS,list);
    }


}



