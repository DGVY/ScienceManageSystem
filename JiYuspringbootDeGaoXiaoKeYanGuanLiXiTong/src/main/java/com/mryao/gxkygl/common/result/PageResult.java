package com.mryao.gxkygl.common.result;


import java.io.Serializable;
import java.util.List;

/**
 * @author Mocker
 * @Date 2016-12-12 上午12:29
 * @Description 分页信息封装对象
 * @Version 1.0
 */
public class PageResult<T> implements Serializable{

    private List<T> rows;

    private Integer totalPage;

    private Long totalCount;


    public PageResult() {
    }

    public PageResult(List rows, Integer totalPage, Long totalCount) {
        this.rows = rows;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
    }


    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public List<T> getRows() {
        return rows;
    }
}
