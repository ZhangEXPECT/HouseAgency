package com.example.groupproject.service.impl;

import com.example.groupproject.dao.ImgDao;
import com.example.groupproject.entity.Img;
import com.example.groupproject.service.HouseService;
import com.example.groupproject.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-06-25
 * @version: 1.0
 */

@Service
@Transactional
public class ImgServiceImpl implements ImgService {

    @Autowired
    private ImgDao imgDao;
    @Override
    public Img queryById(Integer imgId) {
        return this.imgDao.queryById(imgId);
    }
}
