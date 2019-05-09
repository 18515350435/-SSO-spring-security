package com.zc.api.model.resp.gkpt;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zc.api.model.enums.CompanyStatusEnum;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "企业类别，包括各指标状态，离线或停炉、正常、异常、超标")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CompanyPointListViewModel implements Serializable {
	
	private static final long serialVersionUID = -90212727088041441L;
	/// <summary>
	/// 企业编码
	/// </summary>
	public String pscode ;
	/// <summary>
	/// 企业名称
	/// </summary>
	public String psname ;
	/// <summary>
	/// 总排放量
	/// </summary>
	public BigDecimal gasoutputflow ;
	/// <summary>
	/// so2实测值
	/// </summary>
	public BigDecimal so2 ;
	/// <summary>
	/// so2折算值
	/// </summary>
	public BigDecimal so2_convert ;
	/// <summary>
	/// 氮氧化物实测值
	/// </summary>
	public BigDecimal nox ;
	/// <summary>
	/// 氮氧化物折算值
	/// </summary>
	public BigDecimal nox_convert ;
	/// <summary>
	/// 烟尘实测值
	/// </summary>
	public BigDecimal smoke ;
	/// <summary>
	/// 烟尘折算值
	/// </summary>
	public BigDecimal smoke_convert ;
	/// <summary>
	/// 含氧量
	/// </summary>
	public BigDecimal o2 ;
	/// <summary>
	/// 氮氧化物状态，默认正常
	/// </summary>
	public int noxStatus  = CompanyStatusEnum.正常.getCode();
	/// <summary>
	/// 烟尘状态，默认正常
	/// </summary>
	public int smokeStatus =CompanyStatusEnum.正常.getCode();
	/// <summary>
	/// so2状态，默认正常
	/// </summary>
	public int so2Status =CompanyStatusEnum.正常.getCode();
	/// <summary>
	/// 经度
	/// </summary>
	public BigDecimal longitude ;
	/// <summary>
	/// 纬度
	/// </summary>
	public BigDecimal latitude ;
	/// <summary>
	/// 网格名称
	/// </summary>
	public String gridName ;

	public String getPscode() {
		return pscode;
	}

	public void setPscode(String pscode) {
		this.pscode = pscode;
	}

	public String getPsname() {
		return psname;
	}

	public void setPsname(String psname) {
		this.psname = psname;
	}

	public BigDecimal getGasoutputflow() {
		return gasoutputflow;
	}

	public void setGasoutputflow(BigDecimal gasoutputflow) {
		this.gasoutputflow = gasoutputflow;
	}

	public BigDecimal getSo2() {
		return so2;
	}

	public void setSo2(BigDecimal so2) {
		this.so2 = so2;
	}

	public BigDecimal getSo2_convert() {
		return so2_convert;
	}

	public void setSo2_convert(BigDecimal so2_convert) {
		this.so2_convert = so2_convert;
	}

	public BigDecimal getNox() {
		return nox;
	}

	public void setNox(BigDecimal nox) {
		this.nox = nox;
	}

	public BigDecimal getNox_convert() {
		return nox_convert;
	}

	public void setNox_convert(BigDecimal nox_convert) {
		this.nox_convert = nox_convert;
	}

	public BigDecimal getSmoke() {
		return smoke;
	}

	public void setSmoke(BigDecimal smoke) {
		this.smoke = smoke;
	}

	public BigDecimal getSmoke_convert() {
		return smoke_convert;
	}

	public void setSmoke_convert(BigDecimal smoke_convert) {
		this.smoke_convert = smoke_convert;
	}

	public BigDecimal getO2() {
		return o2;
	}

	public void setO2(BigDecimal o2) {
		this.o2 = o2;
	}

	public int getNoxStatus() {
		return noxStatus;
	}

	public void setNoxStatus(int noxStatus) {
		this.noxStatus = noxStatus;
	}

	public int getSmokeStatus() {
		return smokeStatus;
	}

	public void setSmokeStatus(int smokeStatus) {
		this.smokeStatus = smokeStatus;
	}

	public int getSo2Status() {
		return so2Status;
	}

	public void setSo2Status(int so2Status) {
		this.so2Status = so2Status;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public String getGridName() {
		return gridName;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}
}
