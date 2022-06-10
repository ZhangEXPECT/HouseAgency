package com.example.groupproject.service;
import com.example.groupproject.entity.Order;

import java.util.*;

/** @pdOid 77b0846d-e866-4fc9-bdd1-89d180775a68 */
public interface OrderService {
   /** @param order
    * @pdOid 1180b291-f3ed-48c9-8e37-a8a4910bd0fa */
   String add(Order order);
   /** @param orderId
    * @pdOid c5b678b8-a775-4a89-a069-5eaf8988c0ad */
   String delete(Integer orderId);
   /** @param order
    * @pdOid 19a3263c-3290-4ca4-85e5-d98995355ebd */
   String update(Order order);
   /** @param orderId
    * @pdOid f8264f59-c185-4606-aae5-f54455254b38 */
   Order queryId(Integer orderId);
   /** @param order
    * @pdOid 969da5ca-182c-4c9e-9dea-1f676c56c5cf */
   List<Order> queryCondition(Order order);
   /** @param startTime 
    * @param endTime
    * @pdOid 023a8655-589f-4579-8e74-e0d47de61a07 */
   List<Order> queryByBuildTime(Date startTime, Date endTime);
   /** @param lowestPrice 
    * @param highestPrice
    * @pdOid af096c72-5cef-443d-a118-7702170fc87e */
   List<Order> queryBySalePrice(double lowestPrice, double highestPrice);
   /** @param orderStatus
    * @pdOid 73b42168-741a-4ffa-963d-89ce83ece8d5 */
   List<Order> queryByOrderStatus(boolean orderStatus);

}