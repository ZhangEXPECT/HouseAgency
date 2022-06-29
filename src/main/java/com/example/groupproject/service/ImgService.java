package com.example.groupproject.service;

import com.example.groupproject.entity.Img;

import java.util.List;

public interface ImgService {
    Img queryById(Integer imgId);
    void add(Img img);
    List<Img> queryCondition(Img img);
}
