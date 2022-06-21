package com.example.groupproject.service.impl;

import com.example.groupproject.dao.OrderDao;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.OrderService;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    /**
     * @param order
     * @return
     */
    public Result add(Order order) {
        Order order1 = new Order();
        order1.setHouseId(order.getHouseId());
        if (this.orderDao.queryCondition(order1).isEmpty()) {
            this.orderDao.add(order);
            return new Result(ResultCodeEnum.ADD_SUCCESS);
        } else {
            return new Result(ResultCodeEnum.ADD_FAIL, "该订单已存在");
        }
    }

    /**
     * @param orderId
     *
     * @return*/
    public Result delete(Integer orderId) {
        Order order1 = new Order();
        order1.setOrderId(orderId);
        if (this.orderDao.queryCondition(order1).isEmpty()) {
            return new Result(ResultCodeEnum.DELETE_FAIL,"订单不存在");
        } else {
            this.orderDao.delete(orderId);
            return new Result(ResultCodeEnum.DELETE_SUCCESS);
        }
    }

    /**
     * @param order
     *
     * @return*/
    public Result update(Order order) {
        Order order1 = new Order();
        order1.setOrderId(order.getOrderId());
        if (this.orderDao.queryCondition(order1).isEmpty()) {
            return new Result(ResultCodeEnum.UPDATE_FAIL,"订单数据不存在");
        } else {
            this.orderDao.update(order);
            return new Result(ResultCodeEnum.UPDATE_SUCCESS);
        }

    }

    /**
     * @param orderId
     **/
    public Order queryId(Integer orderId) {
        Order order = new Order();
        order.setOrderId(orderId);
        List<Order> list = this.orderDao.queryCondition(order);
        return list.get(0);
    }

    /**
     * @param order
     **/
    public List<Order> queryCondition(Order order) {
        return this.orderDao.queryCondition(order);
    }

    /**
     * @param minDate
     * @param maxDate
     **/
    public List<Order> queryByBuildTime(Date minDate,Date maxDate) {
        List<Order> list = this.orderDao.queryByBuildTime(minDate,maxDate);
        return list;
    }

    @Override
    public List<Order> queryBySalePrice(Double minPrice, Double maxPrice) {
        return this.orderDao.queryBySalePrice(minPrice, maxPrice);
    }

    /**
     * @param orderStatus
     **/
    public List<Order> queryByOrderStatus(String orderStatus) {
        Order order = new Order();
        order.setOrderStatus(orderStatus);
        List<Order> list = this.orderDao.queryCondition(order);
        return list;
    }



}