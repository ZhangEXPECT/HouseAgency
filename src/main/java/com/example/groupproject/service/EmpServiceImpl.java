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
   public boolean login(String empAccount, String empPassword) {
      // TODO: implement
      return false;
   }
   

   public boolean add(Emp emp) {
      // TODO: implement
      this.empDao.add(emp);
      return false;
   }
   
   /** @param empId
    * @pdOid 862e459c-9dca-4a8e-acc5-4fdb092f321c */
   public boolean delete(Integer empId) {
      // TODO: implement
      this.empDao.delete(empId);
      return false;
   }
   
   /** @param emp
    * @pdOid 70e188a7-d14f-4b4d-9ca2-98700f6a33c6 */
   public boolean update(Emp emp) {
      // TODO: implement
      this.empDao.update(emp);
      return false;
   }
   
   /** @param empId
    * @pdOid 4910eb0f-2382-47a9-9dd5-cb8a72cbd270 */
   public Emp queryId(Integer empId) {
      // TODO: implement
      return null;
   }
   
   /** @param emp
    * @pdOid 1042fc27-eaab-4c58-b6a8-a1135450ed1f */
   public List<Emp> queryCondition(Emp emp) {
      // TODO: implement
      return this.empDao.queryCondition(emp);
   }
   

   public boolean updatePwd(Integer empId, Integer empPassword) {
      // TODO: implement
      return false;
   }
   
   /** @param empId
    * @pdOid 6487c67c-4948-457d-988a-e8434eea0476 */
   public List<Order> queryMyManageOrder(Integer empId) {
      // TODO: implement
      return null;
   }
   

   public List<Order> queryMymanageHouse(Integer empId) {
      // TODO: implement
      return null;
   }
   
   /** @param pageBean
    * @pdOid 2429f359-44a6-48db-9c58-ec7b6c03b49c */
//   public Page<Emp> getEmpPage(PageBean pageBean) {
//      // TODO: implement
//      return null;
//   }

}