package com.template.common.PageVo;

import lombok.Data;

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
public class Page<T> {
    
    /**
     * 当前页码,起始页
     */
    private int startPage = 1;
    /**
     * 每页条数
     */
    private int pageSize = 5;
    /**
     * 前一页
     */
    private int previousPage;

    /**
     * 后一页
     */
    private int nextPage;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总记录数
     */
    private int totalRecord;

    /**
     * 保存查询的结果集合
     */
    private List<T> list;


    /**
     * 数据库偏移量  limit offset,pageSize
     */
    public int getLimitOffset() {
        return (this.startPage - 1) * this.pageSize;
    }


    /**
     * 得到总页码数
     */
    public Integer getTotalPage() {

        return (this.totalRecord + this.pageSize - 1) / this.pageSize;
    }


    public int getPreviousPage() {
        //如果上一页小于1，则说明当前页码已经是第一页了
        if (this.startPage - 1 < 1) {
            this.previousPage = 1;
        } else {
            this.previousPage = this.startPage - 1;
        }
        return previousPage;
    }


    public int getNextPage() {
        //如果下一页大于总数页，则说明当前页码已经是最后一页了
        if (this.startPage + 1 >= this.totalPage) {
            this.nextPage = this.totalPage;
        } else {
            this.nextPage = this.startPage + 1;
        }
        return nextPage;
    }


}