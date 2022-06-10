package com.example.groupProject.service;
import com.example.groupProject.entity.Emp;
import com.example.groupProject.entity.Order;

import java.util.*;

/** @pdOid 4fa9ccf6-125a-413e-9a29-ad3ee8577215 */
public interface EmpService {
   /** @param emp
    * @pdOid 5368a14f-2ee8-43ad-8ffd-21293f10f1eb */
   boolean add(Emp emp);
   /** @param empId
    * @pdOid 0e02cad4-8930-43f2-b8ae-2c2335332a72 */
   boolean delete(Integer empId);
   /** @param emp
    * @pdOid 3067005d-9a6d-406f-9b44-710766114ee4 */
   boolean update(Emp emp);
   /** @param empId
    * @pdOid a77d0d90-192d-4fc0-a9bc-ac80a6ae025e */
   Emp queryId(Integer empId);
   /** @param emp
    * @pdOid 5635246c-0eb9-4df3-ad40-1267c7eabe93 */
   List<Order> queryCondition(Emp emp);
   /** @param empAcc 
    * @param empPwd
    * @pdOid 9846d941-c89f-4de4-b1a2-8386aae48a47 */
   boolean login(String empAcc, String empPwd);
   /** @param empId 
    * @param empPwd
    * @pdOid 13f330e4-7e9f-4561-a2a3-7f667f0c4749 */
   boolean updatePwd(Integer empId, Integer empPwd);
   /** @param empId
    * @pdOid 4a8f5e4b-0af4-495b-8c10-477737a8223d */
   List<Order> queryMyManageOrder(Integer empId);
   /** @param empId
    * @pdOid 21cbc650-046a-4765-9717-55df9362a615 */
   List<Order> queryMymanageHouse(Integer empId);
   /** @param pageBean
    * @pdOid 25fa78b2-8bdd-4374-8413-eb6b2edcd571 */
//   Page<Emp> getEmpPage(PageBean pageBean);

}