package com.example.groupproject.service;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.Order;


import java.util.*;

/** @pdOid a4d889b6-ee6f-46fd-859a-96eb9abfe476 */
public class EmpServiceImpl implements EmpService {
   /** @param empAcc 
    * @param empPwd
    * @pdOid 28a76289-fa03-48ea-8890-438bb39f1bf5 */
   public boolean login(String empAcc, String empPwd) {
      // TODO: implement
      return false;
   }
   
   /** @param emp
    * @pdOid aa881025-da99-4749-b273-acb89ac7d915 */
   public boolean add(Emp emp) {
      // TODO: implement
      return false;
   }
   
   /** @param empId
    * @pdOid 862e459c-9dca-4a8e-acc5-4fdb092f321c */
   public boolean delete(Integer empId) {
      // TODO: implement
      return false;
   }
   
   /** @param emp
    * @pdOid 70e188a7-d14f-4b4d-9ca2-98700f6a33c6 */
   public boolean update(Emp emp) {
      // TODO: implement
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
   public List<Order> queryCondition(Emp emp) {
      // TODO: implement
      return null;
   }
   
   /** @param empId 
    * @param empPwd
    * @pdOid ddf2f600-012f-45cd-a211-08bac16b20e9 */
   public boolean updatePwd(Integer empId, Integer empPwd) {
      // TODO: implement
      return false;
   }
   
   /** @param empId
    * @pdOid 6487c67c-4948-457d-988a-e8434eea0476 */
   public List<Order> queryMyManageOrder(Integer empId) {
      // TODO: implement
      return null;
   }
   
   /** @param empId
    * @pdOid 0f960d83-cbb3-41a8-a12a-e76c89924776 */
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