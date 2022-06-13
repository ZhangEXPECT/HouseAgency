package com.example.groupproject.controller;

import com.example.groupproject.dao.OrderDao;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @description: 订单前端控制器
 * @author: EXPECT
 * @create: 2022-06-13
 * @version: 1.0
 */
@Controller
@Api(tags = "订单管理控制器")
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //查询订单
    @GetMapping("/queryOrder")
    @ApiOperation("查询订单")
    @ResponseBody
    public List<Order> queryOrder(@RequestBody Order order){
        List<Order> list =this.orderService.queryCondition(order);
        return list;
    }

    //添加订单
    @PostMapping("/add")
    @ApiOperation("添加/创建订单")
    @ResponseBody
    public String addOrder(@RequestBody Order order) {
        this.orderService.add(order);
        return "订单创建成功！！";
    }

    //删除订单
    @GetMapping("/delete/{orderId}")
    @ApiOperation("删除订单")
    @ResponseBody
    public String deleteOrder(@PathVariable String orderId) {
        this.orderService.delete(Integer.valueOf(orderId));
        return "订单删除成功！！";
    }

    //修改订单
    @PostMapping("/update")
    @ApiOperation("修改订单信息")
    @ResponseBody
    public String updateOrder(@RequestBody Order order) {
        this.orderService.update(order);
        return "订单修改成功！！";
    }



}
