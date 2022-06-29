package com.example.groupproject.service.impl;

import com.example.groupproject.dao.HouseDao;
import com.example.groupproject.entity.House;
import com.example.groupproject.service.HouseService;
import com.example.groupproject.utils.PageBeans;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
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

    /**
     * @param house
     * @param pageStart
     * @param pageSize
     * @return
     */
    @Override
    public PageBeans<House> queryByPage(House house, Integer pageStart, Integer pageSize) {

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
        List<House> lists = this.houseDao.queryByPage(house, pageStart, pageSize);
        pageBeans.setData(lists);

        return pageBeans;
    }

    @Override
    public List<House> changeHouseStatus() {
        return null;
    }

    @Override
    public List<House> queryByStatus(String houseStatus) {
        return null;
    }

    @Override
    public List<House> queryAll() {
        return null;
    }


    /**
     * @param house
     * @return
     */
    @Override
    public Result add(House house) {
        House house1 = new House();
        house1.setAddress(house.getAddress());
        house1.setCellName(house.getCellName());
        if (this.houseDao.queryCondition(house1).isEmpty()) {
            this.houseDao.add(house);
            return new Result(ResultCodeEnum.ADD_SUCCESS);
        } else {
            return new Result(ResultCodeEnum.ADD_FAIL, "错误！！无法重复发布！！");
        }
    }

    /**
     * @param house
     * @return
     */
    @Override
    public Result update(House house) {
        House house1 = new House();
        house1.setHouseId(house.getHouseId());
        if (this.houseDao.queryCondition(house1).isEmpty()) {
            return new Result(ResultCodeEnum.UPDATE_FAIL, "该房源不存在！！修改错误！！");
        } else {
            this.houseDao.update(house);
            return new Result(ResultCodeEnum.UPDATE_SUCCESS);
        }
    }

    /**
     * @param houseId
     * @return
     */
    @Override
    public Result delete(Integer houseId) {
        House house1 = new House();
        house1.setHouseId(houseId);
        if (this.houseDao.queryCondition(house1).isEmpty()) {
            return new Result(ResultCodeEnum.DELETE_FAIL, "该房源不存在");
        } else {
            this.houseDao.delete(houseId);
            return new Result(ResultCodeEnum.DELETE_SUCCESS);
        }
    }

    /**
     * @param houseId
     **/
    @Override
    public House queryById(Integer houseId) {

        return this.houseDao.queryById(houseId);
    }

    @Override
    public House getImgByHouseId(Integer houseId) {
        return this.houseDao.getImgByHouseId(houseId);
    }

    /**
     * @param house
     **/

    @Override
    public List<House> queryCondition(House house) {
        return this.houseDao.queryCondition(house);
    }
}

