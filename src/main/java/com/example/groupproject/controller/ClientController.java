package com.example.groupproject.controller;


import com.example.groupproject.entity.Client;
import com.example.groupproject.service.ClientService;
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
@Controller
@Api(tags = "客户管理控制器")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/getClient")
    @ApiOperation("动态获取客户信息")
    @ResponseBody
    public List<Client> getClient(){
        List<Client> list = this.clientService.queryCondition(new Client());
        return list;
    }

    @PostMapping("/addClient")
    @ApiOperation("添加客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client"),
    })
    @ResponseBody
    public String addClient(@RequestBody Client client){
        this.clientService.add(client);
        return "添加成功";
    }

    @GetMapping("/deleteClient/{clientId}")
    @ApiOperation("删除客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "int"),
    })
    @ResponseBody
    public String deleteClient(@PathVariable Integer clientId){
        this.clientService.delete(clientId);
        return "删除成功";
    }

    @PostMapping("/updateClient")
    @ApiOperation("修改客户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client", value = "客户对象", dataType = "Client"),
    })
    @ResponseBody
    public String updateClient(@RequestBody Client client){
        this.clientService.update(client);
        return "修改成功";
    }

    @GetMapping("/clientLogin")
    @ApiOperation("客户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "clientAccount", value = "客户账号", dataType = "String"),
            @ApiImplicitParam(name = "clientPassword", value = "密码", dataType = "String"),
    })
    @ResponseBody
    public Object login(String clientAccount, String clientPassword){
        Client obj = new Client();
        obj.setClientAccount(clientAccount);

        List<Client> list = this.clientService.queryCondition(obj);
        if(list.get(0) == null){
            return "用户不存在";
        }else if(list.get(0).getClientPassword() == clientPassword){
            return list.get(0);
        }else {
            return "密码错误";
        }
    }

}
