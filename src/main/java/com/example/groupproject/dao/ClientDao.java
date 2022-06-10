package com.example.groupproject.dao;
import com.example.groupproject.entity.Client;

import java.util.*;

/** @pdOid c67e14b9-a134-43db-a02a-631038ef4101 */
public interface ClientDao {
   /** @param client
    * @pdOid 8b97806e-38ae-48da-8bd6-583b9c7fb3df */
   void add(Client client);
   /** @param client
    * @pdOid 24305489-c8d3-459b-9ce1-a408e3ae55dd */
   void update(Client client);
   /** @param clientId
    * @pdOid 44ac6d80-2277-47ec-a64f-fe846d344c49 */
   void delete(Integer clientId);
   /** @param clientId
    * @pdOid 60b637df-21d2-4eff-baae-af99a17329ae */
   Client queryId(Integer clientId);
   /** @param client
    * @pdOid 9060ccfd-2580-47e3-93ef-497362ef14ff */
   List<Client> queryCondition(Client client);

}