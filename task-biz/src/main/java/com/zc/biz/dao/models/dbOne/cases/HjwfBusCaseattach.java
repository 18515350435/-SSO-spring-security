package com.zc.biz.dao.models.dbOne.cases;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "hjwf_bus_caseattach")
public class HjwfBusCaseattach implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 案件编码
     */
    @Column(name = "CaseType")
    private String casetype;

    /**
     * 附件类型
     */
    @Column(name = "FK_AttachType")
    private String fkAttachtype;

    /**
     * 附件名称
     */
    @Column(name = "AttachName")
    private String attachname;

    /**
     * 附件
     */
    @Column(name = "Attachment")
    private String attachment;

    /**
     * 更新时间
     */
    @Column(name = "UpdateDate")
    private Date updatedate;

    /**
     * 数据来源
     */
    @Column(name = "DataSource")
    private String datasource;

    /**
     * 是否删除
     */
    @Column(name = "DeleteFlag")
    private Integer deleteflag;

    /**
     * 时间戳
     */
    @Column(name = "TimeTamp")
    private Date timetamp;

    /**
     * 创建人
     */
    @Column(name = "Creater")
    private String creater;

    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 修改人
     */
    @Column(name = "Modifier")
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "ModifyTime")
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取案件编码
     *
     * @return CaseType - 案件编码
     */
    public String getCasetype() {
        return casetype;
    }

    /**
     * 设置案件编码
     *
     * @param casetype 案件编码
     */
    public void setCasetype(String casetype) {
        this.casetype = casetype;
    }

    /**
     * 获取附件类型
     *
     * @return FK_AttachType - 附件类型
     */
    public String getFkAttachtype() {
        return fkAttachtype;
    }

    /**
     * 设置附件类型
     *
     * @param fkAttachtype 附件类型
     */
    public void setFkAttachtype(String fkAttachtype) {
        this.fkAttachtype = fkAttachtype;
    }

    /**
     * 获取附件名称
     *
     * @return AttachName - 附件名称
     */
    public String getAttachname() {
        return attachname;
    }

    /**
     * 设置附件名称
     *
     * @param attachname 附件名称
     */
    public void setAttachname(String attachname) {
        this.attachname = attachname;
    }

    /**
     * 获取附件
     *
     * @return Attachment - 附件
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * 设置附件
     *
     * @param attachment 附件
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * 获取更新时间
     *
     * @return UpdateDate - 更新时间
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * 设置更新时间
     *
     * @param updatedate 更新时间
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * 获取数据来源
     *
     * @return DataSource - 数据来源
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * 设置数据来源
     *
     * @param datasource 数据来源
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
     * 获取是否删除
     *
     * @return DeleteFlag - 是否删除
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * 设置是否删除
     *
     * @param deleteflag 是否删除
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * 获取时间戳
     *
     * @return TimeTamp - 时间戳
     */
    public Date getTimetamp() {
        return timetamp;
    }

    /**
     * 设置时间戳
     *
     * @param timetamp 时间戳
     */
    public void setTimetamp(Date timetamp) {
        this.timetamp = timetamp;
    }

    /**
     * 获取创建人
     *
     * @return Creater - 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * @return CreateTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取修改人
     *
     * @return Modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取修改时间
     *
     * @return ModifyTime - 修改时间
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * 设置修改时间
     *
     * @param modifytime 修改时间
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", casetype=").append(casetype);
        sb.append(", fkAttachtype=").append(fkAttachtype);
        sb.append(", attachname=").append(attachname);
        sb.append(", attachment=").append(attachment);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", datasource=").append(datasource);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", timetamp=").append(timetamp);
        sb.append(", creater=").append(creater);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append("]");
        return sb.toString();
    }
}