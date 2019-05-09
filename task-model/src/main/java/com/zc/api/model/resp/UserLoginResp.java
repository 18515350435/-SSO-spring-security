package com.zc.api.model.resp;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户登录出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class UserLoginResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040441L;
	

	@ApiModelProperty(value = "姓名")
	private String name;

	@ApiModelProperty(value = "登录的IP")
	private String requestIp;
	
	@ApiModelProperty(value = "创建时间")
	@JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
