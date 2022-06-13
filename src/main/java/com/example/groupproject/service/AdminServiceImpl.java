package com.example.groupproject.service;
import com.example.groupproject.dao.AdminDao;
import com.example.groupproject.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/*
 * @description: 管理员服务层接口实现类
 * @author: EXPECT
 * @create: 2022-06-13
 * @version: 1.0
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public void add(Admin admin) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public Admin queryId(Integer id) {
        return null;
    }

    @Override
    public List<Admin> queryCondition(Admin admin) {
        return this.adminDao.queryCondition(admin);
    }

    @Override
    public boolean login(String adminAccount, String password) {
        return false;
    }
}
