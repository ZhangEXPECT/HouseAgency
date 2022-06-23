package com.example.groupproject.service.impl;

import com.example.groupproject.dao.StatisticDao;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
 * @author: EXPECT
 * @create: 2022-06-21
 * @version: 1.0
 */
@Service
@Transactional
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticDao statisticDao;


    @Override
    public Integer queryByPrice(Double minPrice, Double maxPrice) {
        return this.statisticDao.queryByPrice(minPrice, maxPrice);
    }

    @Override
    public Integer queryCount() {
        return this.statisticDao.queryCount();
    }

    @Override
    public List houseStatistic() {
        //按价格区间索引
//        Integer sector1 = this.statisticDao.queryByPrice(0.00, 1000000.00);
//        Integer sector2 = this.statisticDao.queryByPrice(1000000.00, 2000000.00);
//        Integer sector3 = this.statisticDao.queryByPrice(2000000.00, 3000000.00);
//        Integer sector4 = this.statisticDao.queryByPrice(3000000.00, 4000000.00);
//        Integer sector5 = this.statisticDao.queryByPrice(4000000.00, 5000000.00);
//        Integer sector6 = this.statisticDao.queryByPrice(5000000.00, 10000000.00);
//        Integer sector7 = this.statisticDao.queryByPrice(10000000.00, 100000000.00);
//
//
        Integer total = this.statisticDao.queryCount();
//        List<Double> list = new ArrayList<>(Arrays.asList(new Double[7]));
//        list.set(0, (double)sector1/ (double) total);
//        list.set(1, (double)sector2/ (double) total);
//        list.set(2, (double)sector3/ (double) total);
//        list.set(3, (double)sector4/ (double) total);
//        list.set(4, (double)sector5/ (double) total);

        System.out.println("----------" + total);
        System.out.println("----------" + (double) 1 / 9);
        List<Double> list = new ArrayList<>(Arrays.asList(new Double[7]));
        Double minPrice = 0.00;
        Double maxPrice = 1000000.00;
        //DecimalFormat df = new DecimalFormat(".00");//设置保留位数
        for (int i = 0; i < 7; i++) {
            list.set(i, (double) this.statisticDao.queryByPrice(minPrice, maxPrice) / (double) total);
            minPrice = maxPrice;
            maxPrice += 1000000.00;
            if (maxPrice > 10000000.00 && maxPrice < 100000000.00) {
                break;
            }
        }
        System.out.println(list);
        return list;
    }

    @Override
    public Integer querySeller() {
        return this.statisticDao.querySeller();
    }

    @Override
    public Integer queryBuyer() {
        return this.statisticDao.queryBuyer();
    }

    @Override
    public Integer queryClientCount() {
        return this.statisticDao.queryClientCount();
    }

    @Override
    public List clientStatistic() {

        //统计系统客源数目
        Integer total = this.statisticDao.queryClientCount();
        System.out.println(total);
        //卖家总数
        Integer seller = this.statisticDao.querySeller();
        System.out.println(seller);
        //买家总数
        Integer buyer = this.statisticDao.queryBuyer();
        System.out.println(buyer);
        //游客总数
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        List list = new ArrayList<>(Arrays.asList(new Double[3]));
        list.set(0, numberFormat.format((double) seller / (double) total) );
        list.set(1,numberFormat.format ((double) buyer / (double) total) );
        list.set(2, numberFormat.format((double) total - (seller + buyer) / (double) total) );
        System.out.println(list);
        return list;
    }

    @Override
    public Integer queryOrderCount(Date startTime,Date endTime) {
        return this.statisticDao.queryOrderCount(startTime,endTime);
    }

    @Override
    public List<Order> queryDoneOrder() {
        return this.statisticDao.queryDoneOrder();
    }

    @Override
    public List turnoverStatistic(Date startTime, Date endTime) {

        //达成的订单总数
        Integer total =this.statisticDao.queryOrderCount(startTime,endTime);
        System.out.println(total);

        Double turnover = 0.00;
        List<Order> list = this.statisticDao.queryBySeason(startTime,endTime);
        for (Order order :list) {
            System.out.println(order.getSalePrice()*0.3);
            turnover +=order.getSalePrice()*(0.3);
        }
        System.out.println(turnover);
        List<String> res = new ArrayList<>(Arrays.asList(new String[2]) );
        res.set(0,"达成订单总数："+total);
        res.set(1,"营业额："+turnover);

        System.out.println(res);
        return res;
    }


}
