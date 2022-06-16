package com.example.groupproject.service;

import com.example.groupproject.dao.HouseDao;
import com.example.groupproject.entity.House;
import com.example.groupproject.utils.PageBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseDao houseDao;


    /**
     * @param houseType
     **/
    @Override
    @Transactional(readOnly = true)
    public List<House> queryByType(String houseType) {
        House house = new House();
        house.setHouseType(houseType);
        return this.houseDao.queryCondition(house);
    }

    /**
     * @param minHouseArea
     * @param maxHouseArea
     **/
    @Override
    public List<House> queryByArea(Integer minHouseArea, Integer maxHouseArea) {
        return this.houseDao.queryByArea(minHouseArea, maxHouseArea);
    }

    /**
     * @param minPrice
     * @param maxPrice
     **/
    @Override
    public List<House> queryByPrice(Double minPrice, Double maxPrice) {
        return this.houseDao.queryByPrice(minPrice, maxPrice);
    }

    @Override
    public Integer queryCount() {
        return this.houseDao.queryCount();
    }

    /**
     * @param city
     **/
    @Override
    public List<House> queryByCity(String city) {
        House house = new House();
        house.setCity(city);
        return this.houseDao.queryCondition(house);
    }

    @Override
    public PageBeans<House> queryByPage(House house,Integer pageStart, Integer pageSize) {

        PageBeans<House> pageBeans = new PageBeans<House>();
        //设置起始页
        pageBeans.setCurrentPage(pageStart);
        //设置页面大小
        pageBeans.setPageSize(pageSize);

        //封装总记录数
        int totalCount = this.houseDao.queryCount();
        pageBeans.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBeans.setTotalPage(num.intValue());

        //封装每页显示的数据
        List<House> lists = this.houseDao.queryByPage(house,pageStart, pageSize);
        pageBeans.setData(lists);

        return pageBeans;
    }


    /**
     * @param houseId
     **/
    @Override
    public House updatePrice(Integer houseId) {
        return null;
    }

    /**
     * @param house
     **/
    @Override
    public void add(House house) {
        this.houseDao.add(house);
    }

    /**
     * @param house
     **/
    @Override
    public void update(House house) {
        this.houseDao.update(house);
    }

    /**
     * @param houseId
     **/
    @Override
    public void delete(Integer houseId) {
        this.houseDao.delete(houseId);
    }

    /**
     * @param houseId
     **/
    @Override
    public House queryById(Integer houseId) {
        // TODO: implement
        return null;
    }

    /**
     * @param house
     **/

    @Override
    public List<House> queryCondition(House house) {
        return this.houseDao.queryCondition(house);
    }


}