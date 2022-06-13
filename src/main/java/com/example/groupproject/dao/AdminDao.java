package com.example.groupproject.dao;
import com.example.groupproject.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface AdminDao {
   /** @param admin */
   void add(Admin admin);
   /** @param id*/
   void delete(Integer id);
   /** @param admin*/
   void update(Admin admin);
   /** @param id*/
   Admin queryId(Integer id);
   /** @param admin*/
   List<Admin> queryCondition(Admin admin);

}