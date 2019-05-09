package com.zc.api.model.resp.backstage;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "责任部门")
public class DepartmentResp {
    @ApiModelProperty("部门ID")
    private Integer id;

    /**
     * 部门编码
     */
    @ApiModelProperty(value="部门编码")
    private String code;

    /**
     * 部门名称
     */
    @ApiModelProperty(value="部门名称")
    private String name;

    /**
     * 主管领导
     */
    @ApiModelProperty(value="主管领导")
    private String leader;

    /**
     * 联系方式
     */
    @ApiModelProperty(value="联系方式")
    private String contacts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 删除状态 0-已删除 1-正常
     */
    private Boolean status;
}
