package com.zc.api.model.req;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Demo01入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class Demo01Req implements Serializable {

	private static final long serialVersionUID = 7595667370040467522L;
	
	@ApiModelProperty(value = "demoStr")
	@NotBlank(message = "demoStr不能为空")
	private String demoStr;
	
	@ApiModelProperty(value = "demoDate")
	@NotNull(message = "demoDate不能为空")
	private Date demoDate;
	
	public String getDemoStr() {
		return demoStr;
	}

	public void setDemoStr(String demoStr) {
		this.demoStr = demoStr;
	}

	public Date getDemoDate() {
		return demoDate;
	}

	public void setDemoDate(Date demoDate) {
		this.demoDate = demoDate;
	}
}
