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

    boolean login(String adminAccount, String password);
}
//*package com.example.groupproject.service;
//import com.example.groupproject.dao.AdminDao;
//import com.example.groupproject.entity.Admin;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.*;
//
//@Service
//@Transactional
//public class AdminServiceImpl implements AdminService {
//
//   @Autowired
//   private AdminDao adminDao;
//
//   /** @param adminAccount
//    * @param password*/
//   public boolean login(String adminAccount, String password) {
//      // TODO: implement
//      return false;
//   }
//
//   /***
//    * @param admin*/
//   public void add(Admin admin) {
//      // TODO: implement
//   }
//
//   /***
//    * @param id*/
//   public void delete(Integer id) {
//      // TODO: implement
//
//   }
//
//   /***
//    * @param admin*/
//   public void update(Admin admin) {
//
//      // TODO: implement
//
//   }
//
//   /** @param id
//    **/
//   public Admin queryId(Integer id) {
//      // TODO: implement
//      return null;
//   }
//
//   /** @param admin
//    **/
//   public List<Admin> queryCondition(Admin admin) {
//      return this.adminDao.queryCondition(admin);
//   }
//
//}*/