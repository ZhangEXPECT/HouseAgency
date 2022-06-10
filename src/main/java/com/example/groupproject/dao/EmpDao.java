package com.example.groupproject.dao;

import com.example.groupproject.entity.Emp;

import java.util.*;

/** @pdOid 9812d4a6-3c44-40bd-8306-3defe695ebd1 */
public interface EmpDao {
   /** @param emp
    * @pdOid 0362a16e-5624-49b3-baa2-f0c07ad34357 */
   void add(Emp emp);
   /** @param empId
    * @pdOid 9719f087-ec32-4bfc-bde2-dec668257408 */
   void delete(Integer empId);
   /** @param emp
    * @pdOid 7794af48-ce7c-42c1-9eca-056590c979e0 */
   void update(Emp emp);
   /** @param empId
    * @pdOid 81d01ab0-6b49-4240-a9a8-673afeabf35d */
   Emp queryId(Integer empId);
   /** @param emp
    * @pdOid 3cdb5d7c-4580-475e-aaed-77bec2797384 */
   List<Emp> queryCondition(Emp emp);

}