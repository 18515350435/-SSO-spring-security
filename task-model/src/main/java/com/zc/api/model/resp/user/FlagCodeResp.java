package com.zc.api.model.resp.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "区域标识")
public class FlagCodeResp implements Serializable {

	private static final long serialVersionUID = -90212727088040441L;

	@ApiModelProperty(value = "标识编码")
	private String flagCode;
	@ApiModelProperty(value = "标识名称")
	private String cityName;

	public String getFlagCode() {
		return flagCode;
	}

	public void setFlagCode(String flagCode) {
		this.flagCode = flagCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
