package com.zc.api.model.resp.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "案件饼状图数据出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CaseBingResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040241L;
	

	@ApiModelProperty(value = "分组名称")
	private String name;

	@ApiModelProperty(value = "数量")
	private String num;
	
	@ApiModelProperty(value = "分组名称编码")
	private String code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
