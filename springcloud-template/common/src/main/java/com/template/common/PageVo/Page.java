package com.template.common.PageVo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * **********************************************************
 *
 * @Project:  分页工具类
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-11-03 11:39
 * @description:
 ************************************************************/
@Data
public class Page<T> implements Serializable{
    
    /**
     * 当前页码,起始页
     */
    private Integer startPage = 1;
    /**
     * 每页条数
     */
    private Integer pageSize = 5;
    /**
     * 前一页
     */
    private Integer previousPage;

    /**
     * 后一页
     */
    private Integer nextPage;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总记录数
     */
    private Integer totalRecord;

    /**
     * 保存查询的结果集合
     */
    private List<T> list;


    /**
     * 数据库偏移量  limit offset,pageSize
     */
    public Integer getLimitOffset() {
        return (this.startPage - 1) * this.pageSize;
    }


    /**
     * 得到总页码数
     */
    public Integer getTotalPage() {

       return  (this.totalRecord + this.pageSize - 1) / this.pageSize;
    }


    public Integer getPreviousPage() {
        //如果上一页小于1，则说明当前页码已经是第一页了
        if (this.startPage - 1 < 1) {
           return 1;
        } else {
            return this.startPage - 1;
        }
    }


    public Integer getNextPage() {
        //如果当前页等于总页数，则说明当前页码已经是最后一页了,那么下一页也是当前页
        if (this.startPage.equals(this.totalPage)) {
           return this.startPage;
        } else {
            return this.startPage + 1;
        }
    }


}