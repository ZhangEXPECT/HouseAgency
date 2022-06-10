package com.example.groupProject.dao;

import com.example.groupProject.entity.Order;

import java.util.List;

/** @pdOid 687314f1-05ba-478d-823b-a8cce3b06360 */
public interface OrderDao {
   /** @param order
    * @pdOid f93ca51e-0708-4031-8e9b-ddb7445b280e */
   void add(Order order);
   /** @param orderId
    * @pdOid d4606066-1071-4458-b320-fab8f6ceafce */
   void delete(Integer orderId);
   /** @param order
    * @pdOid 367438a3-dc25-4661-87d5-c42af36c88ac */
   void update(Order order);
   /** @param orderId
    * @pdOid 05f1728c-283b-4403-bc51-7cc7da46b129 */
   Order queryId(Integer orderId);
   /** @param order
    * @pdOid 5db7f776-152f-496b-91df-9752ea0ef8ac */
   List<Order> queryCondition(Order order);

}