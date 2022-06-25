package com.example.groupproject.controller;


import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.ClientService;
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

    @GetMapping("/getClientById")
    @ApiOperation("根据Id获取客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "Integer"),
    })
    public Result getClientById(Integer clientId){
        Client client = this.clientService.queryId(clientId);
        return new Result(200,"成功",client);
    }
    @PostMapping("/addClient")
    @ApiOperation("添加客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client"),
    })
    public Result addClient(@RequestBody Client client){

        return this.clientService.add(client);
    }

    @GetMapping("/deleteClient/{clientId}")
    @ApiOperation("删除客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "int"),
    })
    public Result deleteClient(@PathVariable Integer clientId){

        return this.clientService.delete(clientId);
    }

    @PostMapping("/updateClient")
    @ApiOperation("修改客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client"),
    })
    public Result updateClient(@RequestBody Client client){
        return this.clientService.update(client);
    }

    @PostMapping("/updatePwd")
    @ApiOperation("用户修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldPassword", value = "原密码", dataType = "String"),
            @ApiImplicitParam(name = "accPassword", value = "新密码", dataType = "String"),
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "String"),
    })
    public Result updatePwd(String oldPassword, String accPassword, Integer clientId){
        return this.clientService.updatePwd(oldPassword,accPassword,clientId);
    }

    @PostMapping("/updatePhone")
    @ApiOperation("用户修改电话")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldPassword", value = "原密码", dataType = "String"),
            @ApiImplicitParam(name = "accPassword", value = "新密码", dataType = "String"),
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "String"),
    })
    public Result updatePhone(Integer clientId, String clientPhone){
        return this.clientService.updatePhone(clientId,clientPhone);
    }

    @PostMapping("/clientLogin")
    @ApiOperation("客户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientAccount", value = "客户账号(例 熊大)", dataType = "String"),
            @ApiImplicitParam(name = "clientPassword", value = "密码(例 123)", dataType = "String"),
    })
    public Result login(@RequestBody Client client){
        return this.clientService.login(client);
    }

    @PostMapping ("/register")
    @ApiOperation("客户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client")
    })
    public Result register(@RequestBody Client client){
        return this.clientService.register(client);
    }

    @GetMapping ("/queryMyHouse")
    @ApiOperation("查询客户自己房子")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "Integer")
    })
    public Result queryMyHouse(Integer clientId){
        List<House> list = this.clientService.queryMyHouse(clientId);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }

    @GetMapping ("/queryPurchase")
    @ApiOperation("查询客户买的房子订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "Integer")
    })
    public Result queryPurchase(Integer clientId){
        List<Order> list = this.clientService.queryPurchase(clientId);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }
}
