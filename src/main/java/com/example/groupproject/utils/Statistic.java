package com.example.groupproject.utils;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-06-25
 * @version: 1.0
 */
public class Statistic {
    private Integer value;
    private String name;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
