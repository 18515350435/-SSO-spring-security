package com.zc.api.model.resp.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "巡查员案件上报统计")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CaseInfoNumResp implements Serializable {
	
	private static final long serialVersionUID = -90212727488040241L;

	@ApiModelProperty(value = "巡查员名称")
	private String name;
	@ApiModelProperty(value = "上报案件总数")
	private Integer sum;
	@ApiModelProperty(value = "误报总数")
	private Integer distortNum;
	@ApiModelProperty(value = "误报率（小数）")
	private Double per;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getDistortNum() {
		return distortNum;
	}

	public void setDistortNum(Integer distortNum) {
		this.distortNum = distortNum;
	}

	public Double getPer() {
		return per;
	}

	public void setPer(Double per) {
		this.per = per;
	}
}
