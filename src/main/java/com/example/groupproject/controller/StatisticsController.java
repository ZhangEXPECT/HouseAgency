package com.example.groupproject.controller;/*
 * @description: 统计模块控制器
 * @author: EXPECT
 * @create: 2022-06-21
 * @version: 1.0
 */

import com.example.groupproject.entity.House;
import com.example.groupproject.service.HouseService;
import com.example.groupproject.service.StatisticsService;
import com.example.groupproject.utils.PageBeans;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "统计管理控制器")
@RequestMapping("/static")
public class StatisticsController {
    @Autowired
    private StatisticsService statisticsService;



}
