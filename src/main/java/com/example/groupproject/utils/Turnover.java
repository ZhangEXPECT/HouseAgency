package com.example.groupproject.utils;

import java.util.List;

/**
 * @description: 营业额
 * @author: 张振彬
 * @create: 2022-06-25
 * @version: 1.0
 */
public class Turnover {
    private List order;
    private List turnover;

    public List getOrder() {
        return order;
    }

    public void setOrder(List order) {
        this.order = order;
    }

    public List getTurnover() {
        return turnover;
    }

    public void setTurnover(List turnover) {
        this.turnover = turnover;
    }

    @Override
    public String toString() {
        return "Turnover{" +
                "order=" + order +
                ", turnover=" + turnover +
                '}';
    }
}
