package com.example.groupproject.service;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.utils.Result;

import java.util.*;


public interface EmpService {

   Result add(Emp emp);

   Result delete(Integer empId);

   Result update(Emp emp);

   Emp queryId(Integer empId);

   List<Emp> queryCondition(Emp emp);

   Result login(Emp emp);

   Result updatePwd(Integer empId, String oldPassword, String accPassword);

   List<Order> queryMyManageOrder(Integer empId);

   List<House> queryMyManageHouse(Integer empId);

//   Page<Emp> getEmpPage(PageBean pageBean);

}