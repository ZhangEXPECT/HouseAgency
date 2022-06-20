package com.example.groupproject.service.impl;
import com.example.groupproject.dao.EmpDao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.House;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.EmpService;
import com.example.groupproject.utils.Result;
import com.example.groupproject.utils.ResultCodeEnum;
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
   public Result login(Emp emp) {
      Emp obj = new Emp();
      obj.setEmpAccount(emp.getEmpAccount());
      List<Emp> list = this.empDao.queryCondition(obj);

      if(list == null || list.isEmpty()){
         return new Result(201,"用户不存在");
      }else if(list.get(0).getEmpPassword().equals(emp.getEmpPassword())){
         return new Result(200,"登录成功",list.get(0));
      }else {
         return new Result(201,"密码错误");
      }
   }

   /**
    * 用户添加
    * @param emp
    * @return
    */
   public Result add(Emp emp) {
      Emp emp1 = new Emp();
      emp1.setEmpAccount(emp.getEmpAccount());
      if(this.empDao.queryCondition(emp1) == null || this.empDao.queryCondition(emp1).isEmpty()){
         this.empDao.add(emp);
         return new Result(ResultCodeEnum.ADD_SUCCESS);
      }else {
         return new Result(ResultCodeEnum.ADD_FAIL,"该用户名已存在");
      }
   }

   /**
    * 用户删除
    * @param empId
    * @return
    */
   public Result delete(Integer empId) {
      Emp emp1 = new Emp();
      emp1.setEmpId(empId);
      if(this.empDao.queryCondition(emp1) == null || this.empDao.queryCondition(emp1).isEmpty()){
         this.empDao.delete(empId);
         return new Result(ResultCodeEnum.DELETE_SUCCESS);
      }else {
         return new Result(ResultCodeEnum.DELETE_FAIL,"该用户不存在");
      }
   }

   /**
    * 用户修改
    * @param emp
    * @return
    */
   public Result update(Emp emp) {
      Emp emp1 = new Emp();
      emp1.setEmpAccount(emp.getEmpAccount());
      if(this.empDao.queryCondition(emp1) == null || this.empDao.queryCondition(emp1).isEmpty()){
         return new Result(ResultCodeEnum.UPDATE_FAIL,"用户名不存在，请更换");
      }else {
         this.empDao.update(emp);
         return new Result(ResultCodeEnum.UPDATE_SUCCESS);
      }
   }

   /**
    * 通过id查询
    * @param empId
    * @return
    */
   public Emp queryId(Integer empId) {
      return this.empDao.queryId(empId);
   }

   /**
    * 动态查询
    * @param emp
    * @return
    */
   public List<Emp> queryCondition(Emp emp) {
      return this.empDao.queryCondition(emp);
   }

   /**
    * 修改密码
    * @return
    */
   public Result updatePwd(Integer empId, String oldPassword, String accPassword) {
      Emp emp = this.empDao.queryId(empId);
      if(emp == null){
         return new Result(203,"该用户未找到");
      }else {
         if(emp.getEmpPassword().equals(oldPassword)){
            emp.setEmpPassword(accPassword);
            this.empDao.update(emp);
            return new Result(ResultCodeEnum.SUCCESS);
         }else {
            return new Result(ResultCodeEnum.FAIL,"密码错误");
         }
      }
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