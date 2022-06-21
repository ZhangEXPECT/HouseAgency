package com.example.groupproject.service.impl;

import com.example.groupproject.dao.EmpDao;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:甘舟
 * Data:2022/6/21
 */
@Service
@Transactional
public class AchievementImpl implements AchievementService {
    @Autowired
    private EmpDao empDao;

    /**
     * 查询员工自己达成的交易
     * @param empId
     * @return
     */
    public List<Order> getMyManageOrder (Integer empId){

        return this.empDao.getOrderByEmpId(empId);
    }

    /**
     * 计算员工达成订单的总提成
     * @param empId
     * @return
     */
    public Double getMyAchievement(Integer empId){
        List<Order> list = this.empDao.getOrderByEmpId(empId);
//      员工总提成
        Double commissionTotal = null;
        for(Order order:list){
            commissionTotal += order.getSalePrice()*0.03*0.3;
        }
        return commissionTotal;
    }

    /**
     * 根据所有员工的总提成生成排行榜
     * @return
     */
    public List achievementRankList(){
        List<Emp> empList = this.empDao.queryCondition(new Emp());
        for(Emp emp : empList){
            System.out.println(emp);
            getMyAchievement(emp.getEmpId());
        }
        return empList;
    }
}
