package com.zc.api.model.req.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "用户信息入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class UserReq implements Serializable {

	private static final long serialVersionUID = -1793109859154232827L;

	@ApiModelProperty(value = "主键", required = true)
	private Long id;

	@ApiModelProperty(value = "姓名", required = true)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
