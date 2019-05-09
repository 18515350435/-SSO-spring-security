package com.zc.api.model.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "检查用户是否登录出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class UserCheckLoginResp implements Serializable {

	private static final long serialVersionUID = -1793109859154232827L;
	
	@ApiModelProperty(value = "账号(用户名，唯一)")
	private String loginName;
	
	@ApiModelProperty(value = "姓名")
	private String name;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
