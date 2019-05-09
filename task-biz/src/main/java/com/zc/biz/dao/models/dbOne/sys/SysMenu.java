package com.zc.biz.dao.models.dbOne.sys;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_menu")
public class SysMenu implements Serializable {
    /**
     * ����id
     */
    @ApiModelProperty(value = "自增id")
    private Integer id;

    /**
     * �˵�����
     */
    @ApiModelProperty(value = "菜单名称")
    private String menuname;

    /**
     * �˵�url��ַ
     */
    @ApiModelProperty(value = "菜单链接（权限标识）")
    private String menuurl;

    /**
     * ���˵�id��Ϊ0ʱ����һ���˵�
     */
    @ApiModelProperty(value = "菜单父级id，根目录id=0")
    private Integer parentid;

    /**
     * �����ֶ�
     */
    @ApiModelProperty(value = "菜单排序")
    private Integer sort;

    /**
     * �˵�״̬��0-ɾ����1-���ã�2-����
     */
    @ApiModelProperty(value = "菜单状态0-删除，1-启用，2-禁用")
    private Integer status;

    /**
     * ��ע
     */
    @ApiModelProperty(value = "备注")
    private String remarks;

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
     * ��ȡ�˵�����
     *
     * @return menuname - �˵�����
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * ���ò˵�����
     *
     * @param menuname �˵�����
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * ��ȡ�˵�url��ַ
     *
     * @return menuurl - �˵�url��ַ
     */
    public String getMenuurl() {
        return menuurl;
    }

    /**
     * ���ò˵�url��ַ
     *
     * @param menuurl �˵�url��ַ
     */
    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    /**
     * ��ȡ���˵�id��Ϊ0ʱ����һ���˵�
     *
     * @return parentid - ���˵�id��Ϊ0ʱ����һ���˵�
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * ���ø��˵�id��Ϊ0ʱ����һ���˵�
     *
     * @param parentid ���˵�id��Ϊ0ʱ����һ���˵�
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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
     * ��ȡ�˵�״̬��0-ɾ����1-���ã�2-����
     *
     * @return status - �˵�״̬��0-ɾ����1-���ã�2-����
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ���ò˵�״̬��0-ɾ����1-���ã�2-����
     *
     * @param status �˵�״̬��0-ɾ����1-���ã�2-����
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ��ע
     *
     * @return remarks - ��ע
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * ���ñ�ע
     *
     * @param remarks ��ע
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        sb.append(", menuname=").append(menuname);
        sb.append(", menuurl=").append(menuurl);
        sb.append(", parentid=").append(parentid);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}