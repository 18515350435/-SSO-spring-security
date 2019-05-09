package com.zc.api.model.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "从redis里得到医院信息出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CacheHospitalRedisResp implements Serializable {
	
	private static final long serialVersionUID = 490335999124532218L;

	@ApiModelProperty(value = "医院的id")
	private String id;

	@ApiModelProperty(value = "医院的名称")
	private String name;
	
	@ApiModelProperty(value = "操作者")
	private String loginName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
}
