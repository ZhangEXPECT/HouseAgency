package com.example.groupproject.controller;
import com.example.groupproject.entity.Admin;

import com.example.groupproject.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description: 管理员前端控制器
 * @author: 张振彬
 * @create: 2022-06-13
 * @version: 1.0
 */
@Controller
@Api(tags = "管理员控制器")
@RequestMapping("/admin")
public class AdminController {

    @Autowired(required = false)
    private AdminService adminService;

    //查询管理员信息
    @GetMapping("/queryAdmin")
    @ApiOperation("查询管理员信息")
    @ResponseBody
    public List<Admin> queryOrder(@RequestBody Admin admin){
        List<Admin> list =this.adminService.queryCondition(admin);
        return list;
    }
}
