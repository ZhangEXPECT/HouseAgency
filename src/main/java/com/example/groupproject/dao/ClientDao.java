package com.example.groupproject.dao;
import com.example.groupproject.entity.Client;
import com.example.groupproject.entity.House;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface ClientDao {

   void add(Client client);

   void update(Client client);

   void delete(Integer clientId);

   Client queryId(Integer clientId);

   List<Client> queryCondition(Client client);

   List<House> getHouseByClientId(Integer clientId);


}