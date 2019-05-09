package com.zc.api.model.resp.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "案件饼状图数据出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class TwoMonthAudResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040241L;
	

	@ApiModelProperty(value = "分组名称")
	private String name;

	@ApiModelProperty(value = "本月百分比")
	private String benyu;
	@ApiModelProperty(value = "上月百分比")
	private String shangyu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBenyu() {
		return benyu;
	}

	public void setBenyu(String benyu) {
		this.benyu = benyu;
	}

	public String getShangyu() {
		return shangyu;
	}

	public void setShangyu(String shangyu) {
		this.shangyu = shangyu;
	}
}
