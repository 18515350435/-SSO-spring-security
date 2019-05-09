package com.zc.api.model.resp.gkpt;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "用户登录出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class AirMonitoringpointalarmvaluesettingResp implements Serializable {
    private String id;

    private Integer aqi;

    private Integer pm25;

    private Integer pm10;

    private Integer so2;

    private Integer no2;

    private Double co;

    private Integer o3;

    private String belongcity;

    /**
     * 创建者 : 创建者
     */
    private String createBy;

    /**
     * 创建时间 : 创建时间
     */
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 更新者 : 更新者
     */
    private String updateBy;

    /**
     * 更新时间 : 更新时间
     */
    @JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 备注信息 : 备注信息
     */
    private String remarks;

    /**
     * 删除标记 : 删除标记 0有效
     */
    private String delFlag;

    private static final long serialVersionUID = 1L;

    /**
     * @return Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return AQI
     */
    public Integer getAqi() {
        return aqi;
    }

    /**
     * @param aqi
     */
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    /**
     * @return PM25
     */
    public Integer getPm25() {
        return pm25;
    }

    /**
     * @param pm25
     */
    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    /**
     * @return PM10
     */
    public Integer getPm10() {
        return pm10;
    }

    /**
     * @param pm10
     */
    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    /**
     * @return SO2
     */
    public Integer getSo2() {
        return so2;
    }

    /**
     * @param so2
     */
    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    /**
     * @return NO2
     */
    public Integer getNo2() {
        return no2;
    }

    /**
     * @param no2
     */
    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    /**
     * @return CO
     */
    public Double getCo() {
        return co;
    }

    /**
     * @param co
     */
    public void setCo(Double co) {
        this.co = co;
    }

    /**
     * @return O3
     */
    public Integer getO3() {
        return o3;
    }

    /**
     * @param o3
     */
    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    /**
     * @return BelongCity
     */
    public String getBelongcity() {
        return belongcity;
    }

    /**
     * @param belongcity
     */
    public void setBelongcity(String belongcity) {
        this.belongcity = belongcity;
    }

    /**
     * 获取创建者 : 创建者
     *
     * @return create_by - 创建者 : 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者 : 创建者
     *
     * @param createBy 创建者 : 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间 : 创建时间
     *
     * @return create_date - 创建时间 : 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间 : 创建时间
     *
     * @param createDate 创建时间 : 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新者 : 更新者
     *
     * @return update_by - 更新者 : 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者 : 更新者
     *
     * @param updateBy 更新者 : 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间 : 更新时间
     *
     * @return update_date - 更新时间 : 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间 : 更新时间
     *
     * @param updateDate 更新时间 : 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取备注信息 : 备注信息
     *
     * @return remarks - 备注信息 : 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息 : 备注信息
     *
     * @param remarks 备注信息 : 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取删除标记 : 删除标记 0有效
     *
     * @return del_flag - 删除标记 : 删除标记 0有效
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记 : 删除标记 0有效
     *
     * @param delFlag 删除标记 : 删除标记 0有效
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", aqi=").append(aqi);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", so2=").append(so2);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", o3=").append(o3);
        sb.append(", belongcity=").append(belongcity);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", delFlag=").append(delFlag);
        sb.append("]");
        return sb.toString();
    }
}