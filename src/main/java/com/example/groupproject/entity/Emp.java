package com.example.groupproject.entity;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer empId;
    private Integer adminId;
    private Integer clientId;
    private String empName;
    private String empPhone;
    private Date hireDate;
    private String empAccount;
    private String empPassword;

    public String getEmpAccount() {
        return empAccount;
    }

    public void setEmpAccount(String empAccount) {
        this.empAccount = empAccount;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", adminId=" + adminId +
                ", clientId=" + clientId +
                ", empName='" + empName + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", hireDate=" + hireDate +
                ", empAccount='" + empAccount + '\'' +
                ", empPassword='" + empPassword + '\'' +
                '}';
    }
}