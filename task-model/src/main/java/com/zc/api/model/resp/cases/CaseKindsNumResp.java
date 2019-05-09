package com.zc.api.model.resp.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "案件各类责任主污染类型数量以及占比")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CaseKindsNumResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040241L;

	@ApiModelProperty(value = "总数")
	private Integer num;
	@ApiModelProperty(value = "责任主体名称")
	private String pname;
	@ApiModelProperty(value = "责任主体编码")
	private String pcode;
	@ApiModelProperty(value = "污染类型名称")
	private String dname;
	@ApiModelProperty(value = "污染类型编码")
	private String dcode;
	@ApiModelProperty(value = "责任主体内部占比")
	private Double percent;

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
}
