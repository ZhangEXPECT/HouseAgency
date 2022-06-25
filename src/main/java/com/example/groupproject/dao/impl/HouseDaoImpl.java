package com.example.groupproject.dao.impl;
/*
 * @description: 房源dao实现类
 * @author: EXPECT
 * @create: 2022-06-13
 * @version: 1.0
 */
import com.example.groupproject.dao.HouseDao;
import com.example.groupproject.entity.House;
import com.example.groupproject.utils.PageBeans;

import java.util.*;

public class HouseDaoImpl implements HouseDao {


    /** @param house*/
    public void add(House house) {
        // TODO: implement
    }

    /** @param house */
    public void update(House house) {
        // TODO: implement
    }

    /** @param houseId */
    public void delete(Integer houseId) {
        // TODO: implement
    }

    /** @param houseId */
    public House queryById(Integer houseId) {
        // TODO: implement
        return null;
    }

    /** @param house */
    public List<House> queryCondition(House house) {
        // TODO: implement
        return null;
    }

    @Override
    public List<House> queryByArea(Integer minHouseArea, Integer maxHouseArea) {
        return null;
    }

    @Override
    public List<House> queryByPrice(Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public Integer queryCount() {
        return null;
    }

    @Override
    public List<House> queryByPage(House house,Integer pageStart, Integer pageSize) {
        return null;
    }

    @Override
    public House getImgByHouseId(Integer houseId) {
        return null;
    }

}