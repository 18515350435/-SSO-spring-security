package com.zc.biz.dao.models.dbOne.user;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "base_userinfo")
public class BaseUserinfo implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 登录名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 所属区域
     */
    private String area;

    /**
     * 市
     */
    private String city;

    /**
     * 省
     */
    private String province;

    /**
     * 角色，0-超管，1-普通用户，2-网格员
     */
    private Integer role;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return username - 登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置登录名
     *
     * @param username 登录名
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
     * 获取所属区域
     *
     * @return area - 所属区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所属区域
     *
     * @param area 所属区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取角色，0-超管，1-普通用户，2-网格员
     *
     * @return role - 角色，0-超管，1-普通用户，2-网格员
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色，0-超管，1-普通用户，2-网格员
     *
     * @param role 角色，0-超管，1-普通用户，2-网格员
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", area=").append(area);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", role=").append(role);
        sb.append("]");
        return sb.toString();
    }
}