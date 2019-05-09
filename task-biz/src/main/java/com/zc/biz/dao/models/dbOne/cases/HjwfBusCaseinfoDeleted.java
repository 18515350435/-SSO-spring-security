package com.zc.biz.dao.models.dbOne.cases;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Table(name = "hjwf_bus_caseinfo_deleted")
public class HjwfBusCaseinfoDeleted implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 污染源编码
     */
    @Column(name = "PolSorCode")
    private String polsorcode;

    /**
     * 企业ID
     */
    @Column(name = "EntID")
    private String entid;

    /**
     * 案件名称
     */
    @ApiModelProperty(value = "案件名称")
    @Column(name = "CaseName")
    private String casename;

    /**
     * 立案时间
     */
    @Column(name = "FilingTime")
    private Date filingtime;

    /**
     * 案件类型
     */
    @Column(name = "FK_CaseType")
    private String fkCasetype;

    /**
     * 违法类型
     */
    @Column(name = "FK_IllegalType")
    private String fkIllegaltype;

    /**
     * 立案号
     */
    @Column(name = "LiAnCode")
    private String liancode;

    /**
     * 案件编号
     */
    @Column(name = "CaseCode")
    private String casecode;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    @Column(name = "Comment")
    private String comment;
    /**
     * 备注`reject_opinion` varchar(500) DEFAULT NULL COMMENT '驳回意见',
     `reject_time` datetime DEFAULT NULL COMMENT '驳回时间',
     */
    @ApiModelProperty(value = "驳回意见")
    @Column(name = "reject_opinion")
    private String rejectOpinion;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "驳回时间")
    @Column(name = "reject_time")
    private Date rejectTime;

    @Column(name = "UpdateDate")
    private Date updatedate;

    /**
     * 数据来源
     */
    @ApiModelProperty(value = "数据来源，1app  2微信")
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

    /**
     * 创建时间
     */

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * 派发时间
     */

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "派发时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "dispatch_time")
    private Date dispatchTime;

    /**
     * 结案时间
     */

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "结案时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(name = "close_time")
    private Date closeTime;


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

    /**
     * 污染类型
     */
    @ApiModelProperty(value = "污染类型", required = false, example = "目前生效的可检索条件", position = 10)
    @Column(name = "FK_pollutiontype")
    private Integer fkPollutiontype;

    /**
     * 责任主体
     */
    @ApiModelProperty(value = "责任主体", required = false, example = "目前生效的可检索条件", position = 10)
    @Column(name = "FK_departmenttype")
    private Integer fkDepartmenttype;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "经度")
    @Column(name = "Longitude")
    private String longitude;

    @ApiModelProperty(value = "位置")
    private String location;

    @ApiModelProperty(value = "当前登录人用户id")
    @Column(name = "user_id")
    private Long userId;

    public Long getWaitOperatorUserId() {
        return waitOperatorUserId;
    }

    public void setWaitOperatorUserId(Long waitOperatorUserId) {
        this.waitOperatorUserId = waitOperatorUserId;
    }

    /**
     * 案件处理状态 1未处理 2已指派 3已处理 4已结案
     */
    @ApiModelProperty(value = "案件处理状态 1未处理 2已指派 3已处理 4已结案", required = false, example = "目前生效的可检索条件", position = 10)
    private Short status;

    /**
     * 等待此用户id的人进行流程节点操作
     */
    @ApiModelProperty(value = "等待此用户id的人进行流程节点操作", required = false, position = 10)
    @Column(name = "wait_operator_user_id")
    private Long waitOperatorUserId;
    /**
     * 案件历经操作节点，初始值是创建人userid逗号分隔
     */
    @ApiModelProperty(value = "案件历经操作节点，初始值是创建人userid逗号分隔", required = false, position = 10)
    @Column(name = "all_operator_user_id")
    private String allOperatorUserId;

    /**
     * 是否误报  0误报，1非误报
     */
    @ApiModelProperty(value = "是否误报  0误报，1非误报", required = false, position = 10)
    @Column(name = "is_distort")
    private Short isDistort;

    /**
     * 是否误报  0误报，1非误报
     */
    @ApiModelProperty(value = "是否错误的指派责任部门  0否，1是", required = false, position = 10)
    @Column(name = "is_wrong_dep")
    private Short isWrongDep;

    /**
     * 案件描述
     */
    @ApiModelProperty(value = "案件描述")
    @Column(name = "Description")
    private String description;

    /**
     * 网格名称
     */
    @ApiModelProperty(value = "网格名称")
    @Column(name = "netName")
    private String netname;

    /**
     * 案后图片路径
     */
    @ApiModelProperty(value = "案后图片路径")
    @Column(name = "afterCaseImg")
    private String aftercaseimg;

    /**
     * 处理结果
     */
    @ApiModelProperty(value = "处理结果")
    @Column(name = "handling_result")
    private String handlingResult;

    @ApiModelProperty(value = "附件信息", hidden = true, position = 10)
    @Transient
    List<HjwfBusCaseattach> hjwfBusCaseattachList;

    @ApiModelProperty(value = "开始时间")
    @Transient
    String startTime;
    @ApiModelProperty(value = "针对角色定性的案件状态 0全部案件 1已提交 2未处理[两个子项：21待分配 22待审核] 3已结案 4已派发 5误报")
    @Transient
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ApiModelProperty(value = "结束时间")
    @Transient
    String endTime;

    @ApiModelProperty(value = "责任主体名称")
    @Transient
    private String departmenttype;

    @ApiModelProperty(value = "污染类型名称")
    @Transient
    private String pollutiontype;

    @ApiModelProperty(value = "是否是24小时可编辑的 0是 1否")
    @Transient
    private String canEdit="1";

    @ApiModelProperty(value = "是否是太久未处理 0是 1否")
    @Transient
    private String tooLong="1";

    @ApiModelProperty(value = "案件经历时间")
    @Transient
    private String casejlsj;

    @ApiModelProperty(value = "人员信息")
    @Transient
    private SysUser sysUser;

    public Short getIsWrongDep() {
        return isWrongDep;
    }

    public void setIsWrongDep(Short isWrongDep) {
        this.isWrongDep = isWrongDep;
    }

    public String getRejectOpinion() {
        return rejectOpinion;
    }

    public void setRejectOpinion(String rejectOpinion) {
        this.rejectOpinion = rejectOpinion;
    }

    public Date getRejectTime() {
        return rejectTime;
    }

    public void setRejectTime(Date rejectTime) {
        this.rejectTime = rejectTime;
    }

    public String getAllOperatorUserId() {
        return allOperatorUserId;
    }

    public void setAllOperatorUserId(String allOperatorUserId) {
        this.allOperatorUserId = allOperatorUserId;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getCasejlsj() {
        if(this.getCloseTime()!=null) {
            long t = this.getCreatetime().getTime() - this.getCloseTime().getTime();
            return getClsjData(t);
        }
        return null;
    }
    /**
     * @Description 根据毫秒数获取 天时分秒
     * @Author       Peihan.Zhang
     * @CreateTime  2018/11/22
     * @Version     0.0.1
     * @Email       zhangpeihan@jchzbj.com
     * @param	_totalMillisecond 毫秒数
     */
    private static String getClsjData(long _totalMillisecond ){

        long _totalSecond =_totalMillisecond / 1000;
        long _day = _totalSecond / (24 * 60 * 60);
        long _hour = (_totalSecond % (24 * 60 * 60)) / (60 * 60);
        long _minute = ((_totalSecond % (24 * 60 * 60)) % (60 * 60)) / 60;
        long _second = ((_totalSecond % (24 * 60 * 60)) % (60 * 60)) % 60;
        return _day+"天"+_hour+"时"+_minute+"分"+_second+"秒";
    }
    public void setCasejlsj(String casejlsj) {
        this.casejlsj = casejlsj;
    }

    public Short getIsDistort() {
        return isDistort;
    }

    public void setIsDistort(Short isDistort) {
        this.isDistort = isDistort;
    }

    public String getDepartmenttype() {
        return departmenttype;
    }

    public void setDepartmenttype(String departmenttype) {
        this.departmenttype = departmenttype;
    }

    public String getPollutiontype() {
        return pollutiontype;
    }

    public void setPollutiontype(String pollutiontype) {
        this.pollutiontype = pollutiontype;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<HjwfBusCaseattach> getHjwfBusCaseattachList() {
        return hjwfBusCaseattachList;
    }

    public void setHjwfBusCaseattachList(List<HjwfBusCaseattach> hjwfBusCaseattachList) {
        this.hjwfBusCaseattachList = hjwfBusCaseattachList;
    }

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
     * 获取污染源编码
     *
     * @return PolSorCode - 污染源编码
     */
    public String getPolsorcode() {
        return polsorcode;
    }

    /**
     * 设置污染源编码
     *
     * @param polsorcode 污染源编码
     */
    public void setPolsorcode(String polsorcode) {
        this.polsorcode = polsorcode;
    }

    /**
     * 获取企业ID
     *
     * @return EntID - 企业ID
     */
    public String getEntid() {
        return entid;
    }

    /**
     * 设置企业ID
     *
     * @param entid 企业ID
     */
    public void setEntid(String entid) {
        this.entid = entid;
    }

    /**
     * 获取案件名称
     *
     * @return CaseName - 案件名称
     */
    public String getCasename() {
        return casename;
    }

    /**
     * 设置案件名称
     *
     * @param casename 案件名称
     */
    public void setCasename(String casename) {
        this.casename = casename;
    }

    /**
     * 获取立案时间
     *
     * @return FilingTime - 立案时间
     */
    public Date getFilingtime() {
        return filingtime;
    }

    /**
     * 设置立案时间
     *
     * @param filingtime 立案时间
     */
    public void setFilingtime(Date filingtime) {
        this.filingtime = filingtime;
    }

    /**
     * 获取案件类型
     *
     * @return FK_CaseType - 案件类型
     */
    public String getFkCasetype() {
        return fkCasetype;
    }

    /**
     * 设置案件类型
     *
     * @param fkCasetype 案件类型
     */
    public void setFkCasetype(String fkCasetype) {
        this.fkCasetype = fkCasetype;
    }

    /**
     * 获取违法类型
     *
     * @return FK_IllegalType - 违法类型
     */
    public String getFkIllegaltype() {
        return fkIllegaltype;
    }

    /**
     * 设置违法类型
     *
     * @param fkIllegaltype 违法类型
     */
    public void setFkIllegaltype(String fkIllegaltype) {
        this.fkIllegaltype = fkIllegaltype;
    }

    /**
     * 获取立案号
     *
     * @return LiAnCode - 立案号
     */
    public String getLiancode() {
        return liancode;
    }

    /**
     * 设置立案号
     *
     * @param liancode 立案号
     */
    public void setLiancode(String liancode) {
        this.liancode = liancode;
    }

    /**
     * 获取案件编号
     *
     * @return CaseCode - 案件编号
     */
    public String getCasecode() {
        return casecode;
    }

    /**
     * 设置案件编号
     *
     * @param casecode 案件编号
     */
    public void setCasecode(String casecode) {
        this.casecode = casecode;
    }

    /**
     * 获取备注
     *
     * @return Comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return UpdateDate
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
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
     * 获取创建时间
     *
     * @return CreateTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
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

    /**
     * 获取污染类型
     *
     * @return FK_pollutiontype - 污染类型
     */
    public Integer getFkPollutiontype() {
        return fkPollutiontype;
    }

    /**
     * 设置污染类型
     *
     * @param fkPollutiontype 污染类型
     */
    public void setFkPollutiontype(Integer fkPollutiontype) {
        this.fkPollutiontype = fkPollutiontype;
    }

    /**
     * 获取责任主体
     *
     * @return FK_departmenttype - 责任主体
     */
    public Integer getFkDepartmenttype() {
        return fkDepartmenttype;
    }

    /**
     * 设置责任主体
     *
     * @param fkDepartmenttype 责任主体
     */
    public void setFkDepartmenttype(Integer fkDepartmenttype) {
        this.fkDepartmenttype = fkDepartmenttype;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return Longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
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


    public Short getStatus() {
        return status;
    }


    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取案件描述
     *
     * @return Description - 案件描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置案件描述
     *
     * @param description 案件描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取网格名称
     *
     * @return netName - 网格名称
     */
    public String getNetname() {
        return netname;
    }

    /**
     * 设置网格名称
     *
     * @param netname 网格名称
     */
    public void setNetname(String netname) {
        this.netname = netname;
    }

    /**
     * 获取案后图片路径
     *
     * @return afterCaseImg - 案后图片路径
     */
    public String getAftercaseimg() {
        return aftercaseimg;
    }

    /**
     * 设置案后图片路径
     *
     * @param aftercaseimg 案后图片路径
     */
    public void setAftercaseimg(String aftercaseimg) {
        this.aftercaseimg = aftercaseimg;
    }

    /**
     * 获取处理结果
     *
     * @return handling_result - 处理结果
     */
    public String getHandlingResult() {
        return handlingResult;
    }

    /**
     * 设置处理结果
     *
     * @param handlingResult 处理结果
     */
    public void setHandlingResult(String handlingResult) {
        this.handlingResult = handlingResult;
    }

    public String getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(String canEdit) {
        this.canEdit = canEdit;
    }

    public String getTooLong() {
        return tooLong;
    }

    public void setTooLong(String tooLong) {
        this.tooLong = tooLong;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", polsorcode=").append(polsorcode);
        sb.append(", entid=").append(entid);
        sb.append(", casename=").append(casename);
        sb.append(", filingtime=").append(filingtime);
        sb.append(", fkCasetype=").append(fkCasetype);
        sb.append(", fkIllegaltype=").append(fkIllegaltype);
        sb.append(", liancode=").append(liancode);
        sb.append(", casecode=").append(casecode);
        sb.append(", comment=").append(comment);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", datasource=").append(datasource);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", timetamp=").append(timetamp);
        sb.append(", creater=").append(creater);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", fkPollutiontype=").append(fkPollutiontype);
        sb.append(", fkDepartmenttype=").append(fkDepartmenttype);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", location=").append(location);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", description=").append(description);
        sb.append(", netname=").append(netname);
        sb.append(", aftercaseimg=").append(aftercaseimg);
        sb.append(", handlingResult=").append(handlingResult);
        sb.append("]");
        return sb.toString();
    }
}