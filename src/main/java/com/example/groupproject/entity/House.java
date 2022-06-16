package com.example.groupproject.entity;



import java.io.Serializable;

public class House implements Serializable {
    private Integer houseId;
    private Integer clientId;
    private Integer empId;
    private Integer adminId;
    private String houseType;
    private Double housePrice;
    private Double houseArea;
    private String city;
    private String address;
    private String layoutType;
    private String cellName;
    private String houseOrientation;
    private String image;


    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Double housePrice) {
        this.housePrice = housePrice;
    }

    public Double getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Double houseArea) {
        this.houseArea = houseArea;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getHouseOrientation() {
        return houseOrientation;
    }

    public void setHouseOrientation(String houseOrientation) {
        this.houseOrientation = houseOrientation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "house{" +
                "houseId=" + houseId +
                ", clientId=" + clientId +
                ", empId=" + empId +
                ", adminId=" + adminId +
                ", houseType='" + houseType + '\'' +
                ", housePrice=" + housePrice +
                ", houseArea=" + houseArea +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", layoutType='" + layoutType + '\'' +
                ", cellName='" + cellName + '\'' +
                ", houseOrientation='" + houseOrientation + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
