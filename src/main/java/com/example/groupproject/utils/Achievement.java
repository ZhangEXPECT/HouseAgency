package com.example.groupproject.utils;


/**
 * Author:甘舟
 * Data:2022/6/22
 */
public class Achievement {
    private Integer empId;
    private String empName;
    private Integer orderTotal;
    private Double commissionTotal;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Double getCommissionTotal() {
        return commissionTotal;
    }

    public void setCommissionTotal(Double commissionTotal) {
        this.commissionTotal = commissionTotal;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", orderTotal=" + orderTotal +
                ", commissionTotal=" + commissionTotal +
                '}';
    }
}
