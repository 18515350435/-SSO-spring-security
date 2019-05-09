package com.zc.biz.dao.models.dbOne.user;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "base_userinfo")
public class BaseUserinfo implements Serializable {
    /**
     * ����id
     */
    private Integer id;

    /**
     * ��¼��
     */
    private String username;

    /**
     * ����
     */
    private String password;

    /**
     * ��������
     */
    private String area;

    /**
     * ��
     */
    private String city;

    /**
     * ʡ
     */
    private String province;

    /**
     * ��ɫ��0-���ܣ�1-��ͨ�û���2-����Ա
     */
    private Integer role;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ��¼��
     *
     * @return username - ��¼��
     */
    public String getUsername() {
        return username;
    }

    /**
     * ���õ�¼��
     *
     * @param username ��¼��
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ��������
     *
     * @return area - ��������
     */
    public String getArea() {
        return area;
    }

    /**
     * ������������
     *
     * @param area ��������
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * ��ȡ��
     *
     * @return city - ��
     */
    public String getCity() {
        return city;
    }

    /**
     * ������
     *
     * @param city ��
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * ��ȡʡ
     *
     * @return province - ʡ
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����ʡ
     *
     * @param province ʡ
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * ��ȡ��ɫ��0-���ܣ�1-��ͨ�û���2-����Ա
     *
     * @return role - ��ɫ��0-���ܣ�1-��ͨ�û���2-����Ա
     */
    public Integer getRole() {
        return role;
    }

    /**
     * ���ý�ɫ��0-���ܣ�1-��ͨ�û���2-����Ա
     *
     * @param role ��ɫ��0-���ܣ�1-��ͨ�û���2-����Ա
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