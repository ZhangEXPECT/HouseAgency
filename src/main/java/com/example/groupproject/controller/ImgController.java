package com.example.groupproject.controller;

import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Img;
import com.example.groupproject.service.ImgService;
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
 * @description:
 * @author: 张振彬
 * @create: 2022-06-25
 * @version: 1.0
 */
@Controller
@Api(tags = "房源图片管理控制器")
@RequestMapping("/img")
public class ImgController {

    @Autowired
    private ImgService imgService;

    //id查询房源
    @GetMapping("/queryById/{imgId}")
    @ApiOperation("id查询房源图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "imgId", value = "图片Id", dataType = "String"),
    })
    @ResponseBody
    public Result queryById(@PathVariable String imgId) {
        Img img= this.imgService.queryById(Integer.valueOf(imgId));
        return new Result(ResultCodeEnum.SUCCESS,img);
    }
    @PostMapping("/queryCondition")
    @ApiOperation("查询房源图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "img", value = "图片对象", dataType = "Img"),
    })
    @ResponseBody
    public Result queryCondition(@RequestBody Img img) {
        List<Img> list = this.imgService.queryCondition(img);
        return new Result(ResultCodeEnum.SUCCESS,list);
    }
    @PostMapping("/add")
    @ApiOperation("查询房源图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "img", value = "图片对象", dataType = "Img"),
    })
    @ResponseBody
    public Result add(@RequestBody Img img) {
        this.imgService.add(img);
        Img img1 = this.imgService.queryCondition(img).get(0);
        return new Result(ResultCodeEnum.SUCCESS,img1);
    }

}
