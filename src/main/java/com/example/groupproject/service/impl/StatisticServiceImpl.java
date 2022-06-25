package com.example.groupproject.service.impl;

import com.example.groupproject.dao.StatisticDao;
import com.example.groupproject.entity.Order;
import com.example.groupproject.service.StatisticService;
import com.example.groupproject.utils.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author: 张振彬
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
        Integer total = this.statisticDao.queryCount();
//        System.out.println("----------" + total);
//        System.out.println("----------" + (double) 1 / 9);
        List<Statistic> list = new ArrayList<>(Arrays.asList(new Statistic[6]));
        Double minPrice = 0.00;
        Double maxPrice = 50.00;
        //DecimalFormat df = new DecimalFormat(".00");//设置保留位数
        for (int i = 0; i < 6; i++) {
            Statistic statistic = new Statistic();
            statistic.setValue(this.statisticDao.queryByPrice(minPrice, maxPrice));
            statistic.setName(minPrice+"-"+maxPrice+"万");
            list.set(i,statistic);
            minPrice = maxPrice;
            maxPrice += 50.00;
            if (maxPrice > 300.00&& maxPrice < 100000000.00) {
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
        //卖家总数
        Integer seller = this.statisticDao.querySeller();
        //买家总数
        Integer buyer = this.statisticDao.queryBuyer();
        //游客总数
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        List list = new ArrayList<>(Arrays.asList(new Double[3]));
        list.set(0, numberFormat.format((double) seller / (double) total));
        list.set(1, numberFormat.format((double) buyer / (double) total));
        list.set(2, numberFormat.format((double) total - (seller + buyer) / (double) total));
        System.out.println(list);
        return list;
    }

    @Override
    public Integer queryOrderCount(Date startTime, Date endTime) {
        return this.statisticDao.queryOrderCount(startTime, endTime);
    }

    @Override
    public Integer queryDoneOrder() {
        return this.statisticDao.queryDoneOrder();
    }

    @Override
    public List turnoverStatistic(Integer quarter) {

        Date startTime = null;
        Date endTime = null;
        Double turnover = 0.00;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        //判断季度
        if (quarter == 1) {
            try {
                startTime = ft.parse("2022-01-01");
                endTime = ft.parse("2022-04-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (quarter == 2) {
            try {
                startTime = ft.parse("2022-04-01");
                endTime = ft.parse("2022-07-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (quarter == 3) {
            try {
                startTime = ft.parse("2022-07-01");
                endTime = ft.parse("2022-010-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (quarter == 4) {
            try {
                startTime = ft.parse("2022-10-01");
                endTime = ft.parse("2022-12-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        //达成的订单总数
        Integer total = this.statisticDao.queryOrderCount(startTime, endTime);
        List<Order> list = this.statisticDao.queryBySeason(startTime, endTime);
        //统计本季度营业额订单中抽取3个点的中介费
        for (Order order : list) {
            System.out.println(order.getSalePrice() * 0.3);
            turnover += order.getSalePrice() * (0.3);
        }
        //小数点后三位
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(3);
        List<String> res = new ArrayList<>(Arrays.asList(new String[2]));
        //达成订单总数
        res.set(0, numberFormat.format(total));
        //本季度营业额
        res.set(1, numberFormat.format(turnover));
        System.out.println(res);
        return res;
    }


}
