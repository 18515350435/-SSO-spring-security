package com.zc.biz.dao.models.dbOne.sys;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_buttons")
public class SysButtons implements Serializable {
    /**
     * ����id
     */
    private Integer id;

    /**
     * ��ť����
     */
    private String buttonname;

    /**
     * ��ť������
     */
    private String methodname;

    /**
     * ͼ���ַ
     */
    private String iconurl;

    /**
     * �����ֶ�
     */
    private Integer sort;

    /**
     * ��ťλ��
     */
    private Integer position;

    /**
     * ��ť״̬��0-ɾ����1-���ã�2-����
     */
    private Integer status;

    /**
     * ����ʱ��
     */
    private Date createtime;

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
     * ��ȡ��ť����
     *
     * @return buttonname - ��ť����
     */
    public String getButtonname() {
        return buttonname;
    }

    /**
     * ���ð�ť����
     *
     * @param buttonname ��ť����
     */
    public void setButtonname(String buttonname) {
        this.buttonname = buttonname;
    }

    /**
     * ��ȡ��ť������
     *
     * @return methodname - ��ť������
     */
    public String getMethodname() {
        return methodname;
    }

    /**
     * ���ð�ť������
     *
     * @param methodname ��ť������
     */
    public void setMethodname(String methodname) {
        this.methodname = methodname;
    }

    /**
     * ��ȡͼ���ַ
     *
     * @return iconurl - ͼ���ַ
     */
    public String getIconurl() {
        return iconurl;
    }

    /**
     * ����ͼ���ַ
     *
     * @param iconurl ͼ���ַ
     */
    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    /**
     * ��ȡ�����ֶ�
     *
     * @return sort - �����ֶ�
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * ���������ֶ�
     *
     * @param sort �����ֶ�
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ��ťλ��
     *
     * @return position - ��ťλ��
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * ���ð�ťλ��
     *
     * @param position ��ťλ��
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * ��ȡ��ť״̬��0-ɾ����1-���ã�2-����
     *
     * @return status - ��ť״̬��0-ɾ����1-���ã�2-����
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ���ð�ť״̬��0-ɾ����1-���ã�2-����
     *
     * @param status ��ť״̬��0-ɾ����1-���ã�2-����
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return createtime - ����ʱ��
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createtime ����ʱ��
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", buttonname=").append(buttonname);
        sb.append(", methodname=").append(methodname);
        sb.append(", iconurl=").append(iconurl);
        sb.append(", sort=").append(sort);
        sb.append(", position=").append(position);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}