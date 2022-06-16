package com.example.groupproject.controller;


import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.ClientService;
import com.example.groupproject.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/6/13
 */
@RestController
@Api(tags = "客户管理控制器")
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/getClient")
    @ApiOperation("动态获取客户信息")
    public Result getClient(){
        List<Client> list = this.clientService.queryCondition(new Client());
        return new Result(200,"成功",list);
    }

    @PostMapping("/addClient")
    @ApiOperation("添加客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client"),
    })
    public String addClient(@RequestBody Client client){
        this.clientService.add(client);
        return "添加成功";
    }

    @GetMapping("/deleteClient/{clientId}")
    @ApiOperation("删除客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "int"),
    })
    public String deleteClient(@PathVariable Integer clientId){
        this.clientService.delete(clientId);
        return "删除成功";
    }

    @PostMapping("/updateClient")
    @ApiOperation("修改客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client"),
    })
    public String updateClient(@RequestBody Client client){
        this.clientService.update(client);
        return "修改成功";
    }

    @PostMapping("/clientLogin")
    @ApiOperation("客户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientAccount", value = "客户账号(例 熊大)", dataType = "String"),
            @ApiImplicitParam(name = "clientPassword", value = "密码(例 123)", dataType = "String"),
    })
    public Object login(@RequestBody Client client){
        return this.clientService.login(client);
    }

    @PostMapping ("/register")
    @ApiOperation("客户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client")
    })
    public Client register(@RequestBody Client client){
        return this.clientService.register(client);
    }

    @GetMapping ("/queryMyHouse")
    @ApiOperation("查询客户自己房子")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "Integer")
    })
    public List<House> queryMyHouse(Integer clientId){
        return this.clientService.queryMyHouse(clientId);
    }

    @GetMapping ("/queryPurchase")
    @ApiOperation("查询客户买的房子订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "Integer")
    })
    public List<Order> queryPurchase(Integer clientId){
        return this.clientService.queryPurchase(clientId);
    }
}
