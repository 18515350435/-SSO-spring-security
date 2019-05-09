package com.zc.api.model.resp;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Demo01出参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class Demo01Resp implements Serializable {

	private static final long serialVersionUID = -555236426906032847L;
	
	@ApiModelProperty(value = "demoStr")
	private String demoStr;
	
	@ApiModelProperty(value = "demoDate")
	@JsonFormat(timezone = "Asia/Shanghai", pattern = "yyyy-MM-dd HH:mm:ss")
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
