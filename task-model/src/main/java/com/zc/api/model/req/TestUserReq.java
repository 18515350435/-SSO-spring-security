package com.zc.api.model.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel(value = "test用户入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestUserReq implements Serializable {

	private static final long serialVersionUID = -1793109859154232827L;

	@ApiModelProperty(value = "主键信息)", required = true)
	@NotNull(message = "主键id不能为空")
	private Long id;

	@ApiModelProperty(value = "姓名)", required = true)
	@NotBlank(message = "姓名不能为空")
	private String name;

	@ApiModelProperty(value = "年龄")
	private String age;

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
