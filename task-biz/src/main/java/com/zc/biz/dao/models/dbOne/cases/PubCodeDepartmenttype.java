package com.zc.biz.dao.models.dbOne.cases;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Table(name = "pub_code_departmenttype")
@UniqueConstraint(columnNames={"Code"})
public class PubCodeDepartmenttype implements Serializable {
    @Id
    @Column(name = "ID")
    @ApiModelProperty("部门ID")
    private Integer id;

    /**
     * 部门编码
     */
    @Column(name = "Code",unique = true)
    @ApiModelProperty(value="部门编码")
    private String code;

    /**
     * 部门名称
     */
    @ApiModelProperty(value="部门名称")
    @Column(name = "Name")
    private String name;

    /**
     * 主管领导
     */
    @ApiModelProperty(value="主管领导")
    @Column(name = "Leader")
    private String leader;

    /**
     * 联系方式
     */
    @ApiModelProperty(value="联系方式")
    @Column(name = "Contacts")
    private String contacts;


    /**
     * 联系方式
     */
    @ApiModelProperty(value="flagCode")
    @Column(name = "flagCode")
    private String flagCode;

    /**
     * 删除状态 0-已删除 1-正常
     */
    @Column(name = "Status")
    private Boolean status;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门编码
     *
     * @return Code - 部门编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置部门编码
     *
     * @param code 部门编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取部门名称
     *
     * @return Name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取主管领导
     *
     * @return Leader - 主管领导
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置主管领导
     *
     * @param leader 主管领导
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取联系方式
     *
     * @return Contacts - 联系方式
     */
    public String getContacts() {
        return contacts;
    }

    public String getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    /**
     * 设置联系方式
     *
     * @param contacts 联系方式
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取删除状态 0-已删除 1-正常
     *
     * @return Status - 删除状态 0-已删除 1-正常
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置删除状态 0-已删除 1-正常
     *
     * @param status 删除状态 0-已删除 1-正常
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", leader=").append(leader);
        sb.append(", contacts=").append(contacts);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}