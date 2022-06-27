package com.example.groupproject.controller;


import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.EmpService;
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
@Api(tags = "员工管理控制器")
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/getEmp")
    @ApiOperation("动态获取员工信息")
    public Result getEmp(){
        List<Emp> list = this.empService.queryCondition(new Emp());
        return new Result(ResultCodeEnum.SUCCESS,list);
    }
    @GetMapping("/queryCondition")
    @ApiOperation("动态获取员工信息")
    public Result queryCondition(Emp emp){
        if(emp.getEmpName() != null){
            emp.setEmpName("%"+emp.getEmpName()+"%");
        }
        List<Emp> list = this.empService.queryCondition(emp);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }
    @GetMapping("/getEmpById")
    @ApiOperation("动态获取员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "员工Id", dataType = "Integer"),
    })
    public Result getEmpById(Integer empId){
        Emp emp = this.empService.queryId(empId);
        return new Result(ResultCodeEnum.SUCCESS,emp);
    }
    @PostMapping("/addEmp")
    @ApiOperation("添加员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emp", value = "员工对象", dataType = "Emp"),
    })
    public Result addEmp(@RequestBody Emp emp){
        return this.empService.add(emp);
    }

    @GetMapping("/deleteEmp/{empId}")
    @ApiOperation("删除员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "员工Id", dataType = "int"),
    })
    public Result deleteEmp(@PathVariable Integer empId){
        return this.empService.delete(empId);
    }

    @PostMapping("/updateEmp")
    @ApiOperation("修改员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emp", value = "员工对象", dataType = "Emp"),
    })
    public Result updateEmp(@RequestBody Emp emp){
        return this.empService.update(emp);
    }

    @PostMapping("/updatePwd")
    @ApiOperation("用户修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldPassword", value = "原密码", dataType = "String"),
            @ApiImplicitParam(name = "accPassword", value = "新密码", dataType = "String"),
            @ApiImplicitParam(name = "clientId", value = "客户Id", dataType = "String"),
    })
    public Result updatePwd( Integer clientId, String oldPassword, String accPassword){
        return this.empService.updatePwd(clientId,oldPassword,accPassword);
    }

    @PostMapping("/empLogin")
    @ApiOperation("员工登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empAccount", value = "员工账号(例 喜洋洋)", dataType = "String"),
            @ApiImplicitParam(name = "empPassword", value = "密码(例 123)", dataType = "String"),
    })
    public Result login(@RequestBody Emp emp){
        return this.empService.login(emp);
    }

    @GetMapping ("/queryMyManageHouse")
    @ApiOperation("查询员工负责销售的房子")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "员工Id", dataType = "Integer")
    })
    public Result queryMyManageHouse(Integer empId){
        List<House> list = this.empService.queryMyManageHouse(empId);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }

    @GetMapping ("/queryMyManageOrder")
    @ApiOperation("查询员工达成的房子订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "员工Id", dataType = "Integer")
    })
    public Result queryMyManageOrder(Integer empId){
        List<Order> list = this.empService.queryMyManageOrder(empId);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }
}
