package com.example.groupProject.service;
import com.example.groupProject.entity.Admin;

import java.util.*;

/** @pdOid 22ae5ea5-6f74-40a4-9f01-a2f83f9ca9e8 */
public interface AdminService {
   /** @param admin
    * @pdOid 7866d348-faa8-46c2-b574-92e86d128370 */
   boolean add(Admin admin);
   /** @param id
    * @pdOid 54067787-47ee-4912-bba2-9c5925d68dea */
   boolean delete(Integer id);
   /** @param admin
    * @pdOid bfaf5326-0442-452b-bf13-ba62dd754759 */
   boolean update(Admin admin);
   /** @param id
    * @pdOid 15511330-a225-4e2f-80a9-461b38f81028 */
   Admin queryId(Integer id);
   /** @param admin
    * @pdOid 07449912-3d67-4ce1-80a4-b828db217533 */
   List<Admin> queryCondition(Admin admin);
   /** @param adminAcount 
    * @param password
    * @pdOid 9f2d6be0-21cd-4837-b6ab-e14c96c4f267 */
   boolean login(String adminAcount, String password);

}