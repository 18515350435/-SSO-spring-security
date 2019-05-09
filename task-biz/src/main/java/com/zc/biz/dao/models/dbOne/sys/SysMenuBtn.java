package com.zc.biz.dao.models.dbOne.sys;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_menu_btn")
public class SysMenuBtn implements Serializable {
    /**
     * uuid
     */
    @ApiModelProperty(value = "主键uuid")
    private String id;

    /**
     * �˵�id
     */
    @ApiModelProperty(value = "菜单id")
    private Integer menuid;

    /**
     * ��ťid
     */
    @ApiModelProperty(value = "按钮id")
    private Integer btnid;

    /**
     * �����д����������д���ֶΣ�����Ĭ��ʹ�ð�ť�ķ������˴����������ڷ����̨�ӿ����ػ�������һ�������ǣ�ǰ��ҳ��������ģ�ֻ���̨���ó��µķ�������
     */
    @ApiModelProperty(value = "按钮方法名")
    private String methodname;

    /**
     * ����ʱ��
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡuuid
     *
     * @return id - uuid
     */
    public String getId() {
        return id;
    }

    /**
     * ����uuid
     *
     * @param id uuid
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ�˵�id
     *
     * @return menuid - �˵�id
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * ���ò˵�id
     *
     * @param menuid �˵�id
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * ��ȡ��ťid
     *
     * @return btnid - ��ťid
     */
    public Integer getBtnid() {
        return btnid;
    }

    /**
     * ���ð�ťid
     *
     * @param btnid ��ťid
     */
    public void setBtnid(Integer btnid) {
        this.btnid = btnid;
    }

    /**
     * ��ȡ�����д����������д���ֶΣ�����Ĭ��ʹ�ð�ť�ķ������˴����������ڷ����̨�ӿ����ػ�������һ�������ǣ�ǰ��ҳ��������ģ�ֻ���̨���ó��µķ�������
     *
     * @return methodname - �����д����������д���ֶΣ�����Ĭ��ʹ�ð�ť�ķ������˴����������ڷ����̨�ӿ����ػ�������һ�������ǣ�ǰ��ҳ��������ģ�ֻ���̨���ó��µķ�������
     */
    public String getMethodname() {
        return methodname;
    }

    /**
     * ���������д����������д���ֶΣ�����Ĭ��ʹ�ð�ť�ķ������˴����������ڷ����̨�ӿ����ػ�������һ�������ǣ�ǰ��ҳ��������ģ�ֻ���̨���ó��µķ�������
     *
     * @param methodname �����д����������д���ֶΣ�����Ĭ��ʹ�ð�ť�ķ������˴����������ڷ����̨�ӿ����ػ�������һ�������ǣ�ǰ��ҳ��������ģ�ֻ���̨���ó��µķ�������
     */
    public void setMethodname(String methodname) {
        this.methodname = methodname;
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
        sb.append(", menuid=").append(menuid);
        sb.append(", btnid=").append(btnid);
        sb.append(", methodname=").append(methodname);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}