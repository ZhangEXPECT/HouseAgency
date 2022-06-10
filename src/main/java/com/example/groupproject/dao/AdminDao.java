package com.example.groupproject.dao;
/***********************************************************************
 * Module:  AdminDao.java
 * Author:  86159
 * Purpose: Defines the Interface AdminDao
 ***********************************************************************/


import com.example.groupproject.entity.Admin;

import java.util.*;

/** @pdOid 9c325b87-c5ae-4e8d-a6e1-2d9296029e97 */
public interface AdminDao {
   /** @param admin
    * @pdOid 358757be-bf4f-421e-8c69-3996a50f69db */
   void add(Admin admin);
   /** @param id
    * @pdOid 620aebd2-02b5-4651-b182-b68f5857194c */
   void delete(Integer id);
   /** @param admin
    * @pdOid c70bf328-79c6-4354-9eb1-cca32dc27a25 */
   void update(Admin admin);
   /** @param id
    * @pdOid 811376b4-7d5e-4622-9ed9-d587e3f640b6 */
   Admin queryId(Integer id);
   /** @param admin
    * @pdOid d9044a40-f706-44b0-8297-745f4b946647 */
   List<Admin> queryCondition(Admin admin);

}