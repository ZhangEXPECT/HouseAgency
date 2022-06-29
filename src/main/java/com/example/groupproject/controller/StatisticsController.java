package com.example.groupproject.controller;
/**
 * @description: 统计模块控制器
 * @author: 张振彬
 * @create: 2022-06-21
 * @version: 1.0
 */

import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.StatisticService;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import com.example.groupproject.utils.Statistic;
import com.example.groupproject.utils.Turnover;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "统计管理控制器")
@RequestMapping("/statistic")
public class StatisticsController {
    @Autowired
    private StatisticService statisticsService;

    //客源总数
    @GetMapping("/queryClientCount")
    @ApiOperation("房源总数")
    @ResponseBody
    public Result queryClientCount() {
        Integer i = this.statisticsService.queryClientCount();
        return new Result(ResultCodeEnum.SUCCESS, i);
    }

    //房源发布总数
    @GetMapping("/queryCount")
    @ApiOperation("房源总数")
    @ResponseBody
    public Result queryCount() {
        Integer i = this.statisticsService.queryCount();
        return new Result(ResultCodeEnum.SUCCESS, i);
    }

    //价格比例
    @GetMapping("/houseStatistic")
    @ApiOperation("房源价格比例统计")
    @ResponseBody
    public Result houseStatistic() {
        List<Statistic> list = this.statisticsService.houseStatistic();
        return new Result(ResultCodeEnum.SUCCESS, list);
    }

    //客源统计
    @GetMapping("/clientStatistic")
    @ApiOperation("客源统计")
    @ResponseBody
    public Result clientStatistic() {
        List<Statistic> list = this.statisticsService.clientStatistic();
        return new Result(ResultCodeEnum.SUCCESS, list);
    }

    //系统达成订单总数
    @GetMapping("/queryDoneOrder")
    @ApiOperation("统计所有达成的订单数")
    @ResponseBody
    public Result queryDoneOrder() {
        Integer i = this.statisticsService.queryDoneOrder();
        return new Result(ResultCodeEnum.SUCCESS,i);
    }

    //季度营业额
    @GetMapping("/turnoverStatistic/{quarter}")
    @ApiOperation("季度营业额统计")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "quarter", value = "季度", dataType = "String"),

    })
    @ResponseBody
    public Result queryBySeason(@PathVariable String quarter) {
        List<Order> list = this.statisticsService.turnoverStatistic(Integer.valueOf(quarter));
        return new Result(ResultCodeEnum.SUCCESS, list);
    }

    //柱状图数据
    @GetMapping("/lineChartDate")
    @ApiOperation("营业额柱状图")
    @ResponseBody
    public Result lastTurnoverStatistic() {
        Turnover turnover = this.statisticsService.lineChartDate();
        return new Result(ResultCodeEnum.SUCCESS, turnover);
    }
    //柱状图数据
    @GetMapping("/getOrderTotal")
    @ApiOperation("订单")
    @ResponseBody
    public Result getOrderTotal() {
        List list= this.statisticsService.getOrderTotal();
        return new Result(ResultCodeEnum.SUCCESS, list);
    }
}



