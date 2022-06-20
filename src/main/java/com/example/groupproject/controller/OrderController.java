package com.example.groupproject.controller;

import com.example.groupproject.dao.OrderDao;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.OrderService;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
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

    //获取所有订单
    @GetMapping("/getAllOrder")
    @ApiOperation("获取所有信息")

    @ResponseBody
    public Result getAllOrder(){
        List<Order> list =this.orderService.queryCondition(new Order());
        return new Result(ResultCodeEnum.SUCCESS,list);
    }

    //查询订单
    @GetMapping("/queryOrder")
    @ApiOperation("查询订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "order", value = "订单对象", dataType = "Order"),
    })
    @ResponseBody
    public Result queryOrder(@RequestBody Order order){
        List<Order> list =this.orderService.queryCondition(order);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }

    //添加订单
    @PostMapping("/add")
    @ApiOperation("添加/创建订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "order", value = "订单对象", dataType = "Order"),
    })
    @ResponseBody
    public String addOrder(@RequestBody Order order) {
        this.orderService.add(order);
        return "订单创建成功！！";
    }

    //删除订单
    @GetMapping("/delete/{orderId}")
    @ApiOperation("删除订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单编号", dataType = "String"),
    })
    @ResponseBody
    public String deleteOrder(@PathVariable String orderId) {
        this.orderService.delete(Integer.valueOf(orderId));
        return "订单删除成功！！";
    }

    //修改订单
    @PostMapping("/update")
    @ApiOperation("修改订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "order", value = "订单对象", dataType = "Order"),
    })
    @ResponseBody
    public String updateOrder(@RequestBody Order order) {
        this.orderService.update(order);
        return "订单修改成功！！";
    }

    //ID查询订单
    @GetMapping("/queryById/{orderId}")
    @ApiOperation("ID索引")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单编号", dataType = "String"),
    })
    @ResponseBody
    public Result queryId(@PathVariable String orderId) {
        Order order = this.orderService.queryId(Integer.valueOf(orderId));
        return new Result(ResultCodeEnum.SUCCESS,order);
    }

    //创建时间查询
    @GetMapping("/queryByBuildTime/{buildTime}")
    @ApiOperation("创建时间索引")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "buildTime", value = "订单创建时间", dataType = "Date"),
    })
    @ResponseBody
    public Result queryByBuildTim(@PathVariable Date buildTime) {
        List<Order> list = this.orderService.queryByBuildTime(buildTime);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }

    //成交价查询
    @GetMapping("/queryBySalePrice/{salePrice}")
    @ApiOperation("成交价格索引")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "salePrice", value = "订单成交价格", dataType = "String"),
    })
    @ResponseBody
    public Result queryBySalePrice(@PathVariable String salePrice) {
        List<Order> list = this.orderService.queryBySalePrice(Double.valueOf(salePrice));
        return new Result(ResultCodeEnum.SUCCESS,list);
    }

    //订单状态查询
    @GetMapping("/queryByOrderStatus/{orderStatus}")
    @ApiOperation("订单状态索引")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderStatus", value = "订单状态", dataType = "String"),
    })
    @ResponseBody
    public Result queryByOrderStatus(@PathVariable String orderStatus) {
        List<Order> list = this.orderService.queryByOrderStatus(orderStatus);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }
}
