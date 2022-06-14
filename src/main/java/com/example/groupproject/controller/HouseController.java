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
    @ApiImplicitParams({
            @ApiImplicitParam(name = "house", value = "房源对象", dataType = "House"),
    })
    @ResponseBody
    public List<House> queryHouse(@RequestBody House house) {
        List<House> list = this.houseService.queryCondition(house);
        return list;
    }

    //添加房源
    @PostMapping("/add")
    @ApiOperation("添加房源")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "house", value = "房源对象", dataType = "House"),
    })
    @ResponseBody
    public String addHouse(@RequestBody House house) {
        this.houseService.add(house);
        return "房源添加成功！！";
    }

    // 删除房源
    @GetMapping("/delete/{houseId}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "houseId", value = "房源编号", dataType = "String"),
    })
    @ApiOperation("删除房源")
    @ResponseBody
    public String deleteHouse(@PathVariable String houseId) {
        this.houseService.delete(Integer.valueOf(houseId));
        return "房源删除成功！！";
    }

    //修改房源
    @PostMapping("/update")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "house", value = "房源对象", dataType = "House"),
    })
    @ApiOperation("修改房源信息")
    @ResponseBody
    public String updateHouse(@RequestBody House house) {
        this.houseService.update(house);
        return "信息修改成功！！";
    }

    //类型查询
    @GetMapping("/queryByType/{houseType}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "houseType", value = "房源类型", dataType = "String"),
    })
    @ApiOperation("类型索引")
    @ResponseBody
    public List<House> queryHouseByType(@PathVariable String houseType) {
        List<House> list =  this.houseService.queryByType(houseType);
        return list;
    }

    //房源面积区间查询
    @GetMapping("/queryByArea/{minHouseArea}{maxHouseArea}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "minHouseArea", value = "最小面积", dataType = "String"),
            @ApiImplicitParam(name = "maxHouseArea", value = "最大面积", dataType = "String"),
    })
    @ApiOperation("面积区间索引")
    @ResponseBody
    public List<House> queryByArea(@PathVariable String minHouseArea,@PathVariable String maxHouseArea ) {
        List<House> list =  this.houseService.queryByArea(Integer.valueOf(minHouseArea),Integer.valueOf(maxHouseArea));
        return list;
    }

    //房源价格区间查询
    @GetMapping("/queryByPrice/{minPrice}{maxPrice}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "minHouseArea", value = "最低价格", dataType = "String"),
            @ApiImplicitParam(name = "maxHouseArea", value = "最高价格", dataType = "String"),
    })
    @ApiOperation("价格区间索引")
    @ResponseBody
    public List<House> queryByPrice(@PathVariable String minPrice,@PathVariable String maxPrice ) {
        List<House> list =  this.houseService.queryByPrice(Double.valueOf(minPrice), Double.valueOf(maxPrice));
        return list;
    }

    //城市查询
    @GetMapping("/queryByCity")
    @ApiOperation("城市查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "house", value = "房源对象", dataType = "House"),
    })
    @ResponseBody
    public List<House> queryByCity(@PathVariable String city) {
        List<House> list = this.houseService.queryByCity(city);
        return list;
    }

}
