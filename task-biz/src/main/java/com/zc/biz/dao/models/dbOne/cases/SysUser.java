package com.zc.biz.dao.models.dbOne.cases;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Table(name = "sys_user")
public class SysUser implements Serializable {
    @Id
    @Column(name = "user_id")
    @ApiModelProperty("用户ID,在删除与编辑时必填")
    private Long userId;
    @Column(name = "parent_id")
    @ApiModelProperty("上级userid")
    private Long parentId;
    @Column(name = "responsibility_department")
    @ApiModelProperty("所属责任部门")
    private String responsibilityDepartment;
    @Column(name = "flag_code")
    @ApiModelProperty("人员区域标签（使用的是截取相关长度的行政编码）")
    private String flagCode;
    @ApiModelProperty(value = "所属责任部门名称")
    @Transient
    String responsibilityDepartmentname;

    public String getResponsibilityDepartmentname() {
        return responsibilityDepartmentname;
    }

    public void setResponsibilityDepartmentname(String responsibilityDepartmentname) {
        this.responsibilityDepartmentname = responsibilityDepartmentname;
    }

    public String getResponsibilityDepartment() {
        return responsibilityDepartment;
    }

    public void setResponsibilityDepartment(String responsibilityDepartment) {
        this.responsibilityDepartment = responsibilityDepartment;
    }

    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名 添加与编辑接口必填")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 性别 0=保密/1=男/2=女
     */
    @ApiModelProperty("性别 0=保密/1=男/2=女")
    private Boolean sex;


    /**
     * 经度
     */
    @ApiModelProperty("经度")
    private String longitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 纬度
     */
    @ApiModelProperty("纬度")
    private String latitude;


    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String mobile;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    @ApiModelProperty("最后登录时间")
    private Long lastLoginTime;

    /**
     * 最后登录IP
     */
    @Column(name = "last_login_ip")
    @ApiModelProperty("最后登录IP")
    private String lastLoginIp;

    /**
     * 头像缩略图地址
     */
    @Column(name = "avatar_url")
    @ApiModelProperty("头像缩略图地址")
    private String avatarUrl;

    /**
     * 状态  0：禁用   1：正常
     */
    @ApiModelProperty(value="登录权限 1-允许 0-不允许 添加与编辑接口必填")
    private Byte status;
    /**
     * 角色id：0三级网格员 1三级网格长 2二级网格员 3二级网格长 4一级网格长 5责任部门 6巡查员 7领导人员
     */
    @ApiModelProperty(value="角色id：0三级网格员 1三级网格长 2二级网格员 3二级网格长 4一级网格长 5责任部门 6巡查员 7领导人员")
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 姓名 用户昵称

     */
    @ApiModelProperty(value="姓名 用户昵称 巡查员列表的查询项")
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Long createTime;

    /**
     * 设备编号
     */
    @Column(name = "devicecode")
    private String devicecode;

    public String getDevicecode() {
        return devicecode;
    }

    public void setDevicecode(String devicecode) {
        this.devicecode = devicecode;
    }

    private static final long serialVersionUID = 1L;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别 0=保密/1=男/2=女
     *
     * @return sex - 性别 0=保密/1=男/2=女
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别 0=保密/1=男/2=女
     *
     * @param sex 性别 0=保密/1=男/2=女
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取最后登录IP
     *
     * @return last_login_ip - 最后登录IP
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param lastLoginIp 最后登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取头像缩略图地址
     *
     * @return avatar_url - 头像缩略图地址
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置头像缩略图地址
     *
     * @param avatarUrl 头像缩略图地址
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 角色id：0三级网格员 1三级网格长 2二级网格员 3二级网格长 4一级网格长 5责任部门
     *
     * @return role -0三级网格员 1三级网格长 2二级网格员 3二级网格长 4一级网格长 5责任部门
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置角色id：0三级网格员 1三级网格长 2二级网格员 3二级网格长 4一级网格长 5责任部门
     *
     * @param role 0三级网格员 1三级网格长 2二级网格员 3二级网格长 4一级网格长 5责任部门
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取状态  0：禁用   1：正常
     *
     * @return status - 状态  0：禁用   1：正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态  0：禁用   1：正常
     *
     * @param status 状态  0：禁用   1：正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", role=").append(role);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}