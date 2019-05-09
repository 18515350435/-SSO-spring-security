package com.zc.api.model.util.page;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * @Description 分页入参
 * @Author       Peihan.Zhang
 * @CreateTime  2018/4/19
 * @Email       zhangpeihan@jchzbj.com
 */
@ApiModel(value = "分页入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pager<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "一页显示数目", required = true)
    private int pageSize;
    @ApiModelProperty(value = "页码，从1开始", required = true)
    private int pageNo;
    @ApiModelProperty(value = "查询条件", required = false)
    private T condition;
    public Pager() {
        this.pageSize = 10;
        this.pageNo = 1;
    }

    public Pager(int pageSize) {
        this.pageSize = 10;
        this.pageNo = 1;
        this.setPageSize(pageSize);
    }

    public Pager(int pageSize, T condition) {
        this(pageSize);
        this.condition = condition;
    }

    public Pager(int pageSize, int pageNo) {
        this(pageSize);
        this.setPageNo(pageNo);
    }

    public Pager(int pageSize, int pageNo, int offset) {
        this.pageSize = 10;
        this.pageNo = 1;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        if(pageSize > 0) {
            this.pageSize = pageSize;
        }
    }
    public int getPageNo() {
        return this.pageNo;
    }
    //获取分页起始位置
    public int getOffset() {
        return (this.pageNo-1)*this.getPageSize();
    }

    public void setPageNo(int pageNo) {
        if(pageNo > 0) {
            this.pageNo = pageNo;
        }

    }
    public T getCondition() {
        return this.condition;
    }
    public void setCondition(T condition) {
        this.condition = condition;
    }
    public <K> Pager<K> clonePager() {
        Pager pager = new Pager(this.getPageSize(), this.getPageNo());
        return pager;
    }
}
