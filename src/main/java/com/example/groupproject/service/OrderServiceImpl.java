package com.example.groupproject.service;

import com.example.groupproject.entity.Order;

import java.util.Date;
import java.util.List;

/** @pdOid d610646f-7cda-417d-9fce-b4203936f50d */
public class OrderServiceImpl implements OrderService {
   /** @param order
    * @pdOid 30aec669-3e94-4352-aa2e-aabdb05adef0 */
   public String add(Order order) {
      // TODO: implement
      return null;
   }
   
   /** @param orderId
    * @pdOid 508b21c4-2a2d-4c79-8d26-f7f295af265a */
   public String delete(Integer orderId) {
      // TODO: implement
      return null;
   }
   
   /** @param order
    * @pdOid a644c18e-a60a-4439-8f97-2dea876de947 */
   public String update(Order order) {
      // TODO: implement
      return null;
   }
   
   /** @param orderId
    * @pdOid 564fa9ac-a8a5-48f3-9d98-6d8f231c2a25 */
   public Order queryId(Integer orderId) {
      // TODO: implement
      return null;
   }
   
   /** @param order
    * @pdOid 7fc4ec78-91a5-409d-adcf-a8309d822395 */
   public List<Order> queryCondition(Order order) {
      // TODO: implement
      return null;
   }
   
   /** @param startTime 
    * @param endTime
    * @pdOid 95738741-6224-43a9-af59-49636af400e8 */
   public List<Order> queryByBuildTime(Date startTime, Date endTime) {
      // TODO: implement
      return null;
   }
   
   /** @param lowestPrice 
    * @param highestPrice
    * @pdOid b6d390c9-ba49-4572-b62f-f4a5101297e0 */
   public List<Order> queryBySalePrice(double lowestPrice, double highestPrice) {
      // TODO: implement
      return null;
   }
   
   /** @param orderStatus
    * @pdOid 18080fe9-b062-4a96-a477-93d339089edc */
   public List<Order> queryByOrderStatus(boolean orderStatus) {
      // TODO: implement
      return null;
   }

}