package com.example.groupproject.service;
import com.example.groupproject.entity.Admin;
/*
 * @description: Admin服务层接口
 * @author: EXPECT
 * @create: 2022-06-13
 * @version: 1.0
 */


import java.util.List;

public interface AdminService {
    void add(Admin admin);

    void delete(Integer id);

    void update(Admin admin);

    Admin queryId(Integer id);

    List<Admin> queryCondition(Admin admin);

    void login(String adminAccount, String password);
}
