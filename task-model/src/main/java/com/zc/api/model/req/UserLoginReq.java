package com.zc.api.model.req;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户登录入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class UserLoginReq implements Serializable {

	private static final long serialVersionUID = -1793109859154232827L;

	@ApiModelProperty(value = "账号(用户名，唯一)", required = true)
	@NotBlank(message = "账号不能为空")
	private String loginName;

	@ApiModelProperty(value = "密码,医院端使用的密码,加密存放", required = true)
	@NotBlank(message = "密码不能为空")
	private String password;



	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
