package com.example.groupproject.utils;
/**
 * @description: 分页工具类
 * @author: 张振彬
 * @create: 2022-06-15
 * @version: 1.0
 */

import java.util.List;

public class PageBeans<T>{
    private Integer currentPage;//当前页
    private Integer pageSize;//每页记录数
    private Integer totalCount;//总记录数
    private Integer totalPage;//总页数
    private List<T> data;

    public PageBeans(){
        super();
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageBeans{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }
}
