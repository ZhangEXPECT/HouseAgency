package com.example.groupproject.service;
import com.example.groupproject.dao.EmpDao;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.*;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {
   @Autowired
   private EmpDao empDao;
   public void login(String empAccount, String empPassword) {

   }
   

   public void add(Emp emp) {
      this.empDao.add(emp);
   }

   public void delete(Integer empId) {
      this.empDao.delete(empId);
   }

   public void update(Emp emp) {
      this.empDao.update(emp);
   }

   public Emp queryId(Integer empId) {
      // TODO: implement
      return null;
   }

   public List<Emp> queryCondition(Emp emp) {
      // TODO: implement
      return this.empDao.queryCondition(emp);
   }

   public void updatePwd(Integer empId, Integer empPassword) {

   }

   public List<Order> queryMyManageOrder(Integer empId) {
      // TODO: implement
      return null;
   }

   public List<Order> queryMymanageHouse(Integer empId) {
      // TODO: implement
      return null;
   }

//   public Page<Emp> getEmpPage(PageBean pageBean) {
//      // TODO: implement
//      return null;
//   }

}