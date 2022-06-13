package com.example.groupproject.controller;

import com.example.groupproject.entity.House;
import com.example.groupproject.service.HouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @description: 房源前端控制器
 * @author: EXPECT
 * @create: 2022-06-13
 * @version: 1.0
 */
@Controller
@Api(tags = "房源管理控制器")
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    //查询房源
    @GetMapping("/queryHouse")
    @ApiOperation("查询房源")
    @ResponseBody
    public List<House> queryHouse(@RequestBody House house){
        List<House> list =this.houseService.queryCondition(house);
        return list;
    }

    //添加房源
    @PostMapping("/add")
    @ApiOperation("添加房源")
    @ResponseBody
    public String addHouse(@RequestBody House house) {
        this.houseService.add(house);
        return "房源添加成功！！";
    }

    // 删除房源
    @GetMapping("/delete/{houseId}")
    @ApiOperation("删除房源")
    @ResponseBody
    public String deleteHouse(@PathVariable String houseId) {
        this.houseService.delete(Integer.valueOf(houseId));
        return "房源删除成功！！";
    }

    //修改房源
    @PostMapping("/update")
    @ApiOperation("修改房源信息")
    @ResponseBody
    public String updateHouse(@RequestBody House house) {
        this.houseService.update(house);
        return "信息修改成功！！";
    }

}
