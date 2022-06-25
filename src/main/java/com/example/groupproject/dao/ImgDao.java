package com.example.groupproject.dao;

import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Img;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Mapper
public interface ImgDao {

    Img queryById(Integer imgId);




}
