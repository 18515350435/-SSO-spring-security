package com.zc.api.model.resp.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "课程及其信息出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CourseResp implements Serializable {

	private static final long serialVersionUID = -90212727088040441L;

	@ApiModelProperty(value = "用户id")
	private Long id;

	/**
	 * 姓名
	 */
	@ApiModelProperty(value = "用户姓名")
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
