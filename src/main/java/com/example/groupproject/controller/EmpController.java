package com.example.groupproject.controller;


import com.example.groupproject.entity.Emp;
import com.example.groupproject.service.EmpService;
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
    public List<Emp> getEmp(){
        List<Emp> list = this.empService.queryCondition(new Emp());
        return list;
    }

    @PostMapping("/addEmp")
    @ApiOperation("添加员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emp", value = "员工对象", dataType = "Emp"),
    })
    public String addEmp(@RequestBody Emp emp){
        this.empService.add(emp);
        return "添加成功";
    }

    @GetMapping("/deleteEmp/{empId}")
    @ApiOperation("删除员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empId", value = "员工Id", dataType = "int"),
    })
    public String deleteEmp(@PathVariable Integer empId){
        this.empService.delete(empId);
        return "删除成功";
    }

    @PostMapping("/updateEmp")
    @ApiOperation("修改员工信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "emp", value = "员工对象", dataType = "Emp"),
    })
    public String updateEmp(@RequestBody Emp emp){
        this.empService.update(emp);
        return "修改成功";
    }

    @PostMapping("/empLogin")
    @ApiOperation("员工登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "empAccount", value = "员工账号(例 喜洋洋)", dataType = "String"),
            @ApiImplicitParam(name = "empPassword", value = "密码(例 123)", dataType = "String"),
    })
    public Object login(@RequestBody Emp emp){
        return this.empService.login(emp);
    }

}
