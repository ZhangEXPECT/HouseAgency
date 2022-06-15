package com.example.groupproject.service;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.Order;

import java.util.*;


public interface EmpService {

   void add(Emp emp);

   void delete(Integer empId);

   void update(Emp emp);

   Emp queryId(Integer empId);

   List<Emp> queryCondition(Emp emp);

   void login(String empAccount, String empPassword);

   void updatePwd(Integer empId, Integer empPwd);

   List<Order> queryMyManageOrder(Integer empId);

   List<Order> queryMymanageHouse(Integer empId);

//   Page<Emp> getEmpPage(PageBean pageBean);

}