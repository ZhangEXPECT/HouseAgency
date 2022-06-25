package com.example.groupproject.service.impl;

import com.example.groupproject.dao.EmpDao;
import com.example.groupproject.entity.Emp;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.AchievementService;
import com.example.groupproject.utils.Achievement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

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
     * 可查询所有，一季度二季度等 ;固定在今年
     * @param empId
     * @param quarter
     * @return
     */
    public Achievement getMyAchievement(Integer empId,Integer quarter){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date minDate = null;
        Date maxDate = null;
        List<Order> list = new ArrayList<>();
        //通过参数quarter判断是哪个季度
        //0：所有;1：一季度;2:2季度;...
        if(quarter == 1){
            try {
                minDate = ft.parse("2022-01-01");
                maxDate = ft.parse("2022-04-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //根据季度查询员工达成订单
            list = this.empDao.getByBuildTime(empId,minDate,maxDate);
        }else if(quarter == 2){
            try {
                minDate = ft.parse("2022-04-01");
                maxDate = ft.parse("2022-07-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list = this.empDao.getByBuildTime(empId,minDate,maxDate);
        }else if(quarter == 3){
            try {
                minDate = ft.parse("2022-07-01");
                maxDate = ft.parse("2022-10-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list = this.empDao.getByBuildTime(empId,minDate,maxDate);
        }else if(quarter == 4){
            try {
                minDate = ft.parse("2022-10-01");
                maxDate = ft.parse("2022-12-31");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list = this.empDao.getByBuildTime(empId,minDate,maxDate);
        }else if(quarter == 0){
            list = this.empDao.getOrderByEmpId(empId);
        }else {
            return null;
        }
        DecimalFormat df = new DecimalFormat("0.00");
//      员工总提成
        double commissionTotal = 0.00;
        for(Order order:list){
            //只计算已完成的订单
            if(order.getOrderStatus().equals("已完成")){
                //公司对达成交易收取3个点的中介费,员工得到这其中0.3的提成，计算出员工的总提成
                commissionTotal += Double.parseDouble(df.format(order.getSalePrice()*10000*(0.03*0.3)));
            }
        }
        Achievement achievement = new Achievement();
        String empName = this.empDao.queryId(empId).getEmpName();
        //将数据以achievement对象的形式返回
        achievement.setEmpId(empId);
        achievement.setEmpName(empName);
        achievement.setOrderTotal(list.size());
        achievement.setCommissionTotal(commissionTotal);
        return achievement;
    }

    /**
     * 根据所有员工的业务生成排行榜
     * @param type
     * @param quarter
     * @return
     */
    public Stream<Achievement> achievementRankList(Integer type,Integer quarter){
        //查出所有员工
        List<Emp> empList = this.empDao.queryCondition(new Emp());
        //初始化achievements的列表用来存储所有员工的业绩
        List<Achievement> achievements = new ArrayList<>();
        for(Emp emp : empList){
            //根据季度查出所有员工的业绩
            achievements.add(getMyAchievement(emp.getEmpId(),quarter));
        }
        //依据参数type决定生成榜单
        //1:订单的总提成;2:订单数量
        if(type == 0){
            return null;
        }else if(type == 1){
            //通过java8的新特性Stream对list进行排序，进而生成榜单
            //先根据总提成进行降序，再根据订单数量进行降序
            Stream<Achievement> rankCommissionTotal=
                    achievements.stream().sorted(Comparator.comparing(Achievement::getCommissionTotal).reversed()
                            .thenComparing(Achievement::getOrderTotal,Comparator.reverseOrder()));
            return rankCommissionTotal;
        }else if(type == 2){
            //先根据订单数量进行降序，再根据总提成进行降序
            Stream<Achievement> rankOrderTotal=
                    achievements.stream().sorted(Comparator.comparing(Achievement::getOrderTotal).reversed()
                            .thenComparing(Achievement::getCommissionTotal,Comparator.reverseOrder()));
            return rankOrderTotal;
        }else {
            return null;
        }
    }
}
