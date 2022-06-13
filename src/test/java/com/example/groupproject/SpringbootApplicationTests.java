package com.example.groupproject;

import com.example.groupproject.config.Hello;
import com.example.groupproject.dao.AdminDao;
import com.example.groupproject.dao.HouseDao;
import com.example.groupproject.dao.OrderDao;
import com.example.groupproject.entity.Admin;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private Hello hello;

    //注入mapper
    @Autowired
    private HouseDao houseDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private AdminDao adminDao;


    @Test
    void contextLoads() {
        this.hello.say();
    }

    @Test
    public void testQueryHouse(){
        List<House> list = this.houseDao.queryCondition(new House());
        for (House house : list) {
            //System.out.println(house);
        }
    }

    @Test
    public void testQueryOrder(){
        List<Order> list = this.orderDao.queryCondition(new Order());
        for (Order order : list) {
            //System.out.println(order);
        }
    }

    @Test
    public void testQueryAdmin(){
        List<Admin> list = this.adminDao.queryCondition(new Admin());
        for (Admin admin : list) {
            //System.out.println(order);
        }
    }
}
