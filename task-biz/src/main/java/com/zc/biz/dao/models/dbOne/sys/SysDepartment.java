package com.zc.biz.dao.models.dbOne.sys;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_department")
public class SysDepartment implements Serializable {
    /**
     * ����id
     */
    @ApiModelProperty(value = "自增id")
    private Integer id;

    /**
     * ��������
     */
    @ApiModelProperty(value = "部门名称")
    private String departname;

    /**
     * �������
     */
    @ApiModelProperty(value = "区域编码")
    private String areacode;

    /**
     * ��������id
     */
    @ApiModelProperty(value = "父级部门id")
    private Integer parentid;

    /**
     * ����״̬��0-ɾ����1-����
     */
    @ApiModelProperty(value = "部门状态，0-删除，1-正常")
    private Integer status;

    /**
     * ����ʱ��
     */
    @ApiModelProperty(value = "创建时间")
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
     * ��ȡ��������
     *
     * @return departname - ��������
     */
    public String getDepartname() {
        return departname;
    }

    /**
     * ���ò�������
     *
     * @param departname ��������
     */
    public void setDepartname(String departname) {
        this.departname = departname;
    }

    /**
     * ��ȡ�������
     *
     * @return areacode - �������
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * �����������
     *
     * @param areacode �������
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    /**
     * ��ȡ��������id
     *
     * @return parentid - ��������id
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * ���ø�������id
     *
     * @param parentid ��������id
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * ��ȡ����״̬��0-ɾ����1-����
     *
     * @return status - ����״̬��0-ɾ����1-����
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ���ò���״̬��0-ɾ����1-����
     *
     * @param status ����״̬��0-ɾ����1-����
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
        sb.append(", departname=").append(departname);
        sb.append(", areacode=").append(areacode);
        sb.append(", parentid=").append(parentid);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}