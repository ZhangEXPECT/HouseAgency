package com.example.groupproject.service.impl;
import com.example.groupproject.dao.EmpDao;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.*;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {
   @Autowired
   private EmpDao empDao;

   /**
    * 员工登录
    * @param emp
    * @return
    */
   public Object login(Emp emp) {
      Emp obj = new Emp();
      obj.setEmpAccount(emp.getEmpAccount());
      List<Emp> list = this.empDao.queryCondition(obj);

      if(list == null || list.isEmpty()){
         return "用户不存在";
      }else if(list.get(0).getEmpPassword().equals(emp.getEmpPassword())){
         return list.get(0);
      }else {
         return "密码错误";
      }
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

   /**
    * 员工查询自己管理订单
    * @param empId
    * @return
    */
   public List<Order> queryMyManageOrder(Integer empId) {
      return this.empDao.getOrderByEmpId(empId);
   }

   /**
    * 员工查询自己管理的房子
    * @param empId
    * @return
    */
   public List<House> queryMyManageHouse(Integer empId) {
      return this.empDao.getHouseByEmpId(empId);
   }

//   public Page<Emp> getEmpPage(PageBean pageBean) {
//      // TODO: implement
//      return null;
//   }

}