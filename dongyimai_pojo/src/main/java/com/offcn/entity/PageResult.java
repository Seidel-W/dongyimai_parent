package com.offcn.entity;

import java.io.Serializable;
import java.util.List;

//分页封装实体类
public class PageResult implements Serializable {
    private Long total; //总记录数
    private List rows;  //分页后的集合

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
    //注意：如果定义了有参的构造方法，则一定要定义无参的构造方法

    public PageResult() {
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public List getRows() {
        return rows;
    }
}
