package com.zc.api.model.resp.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "案件各类责任主数量")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CaseAboutDealNumResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088047241L;

	@ApiModelProperty(value = "责任主体编码")
	private String pcode;
	@ApiModelProperty(value = "责任主体名称")
	private String pname;
	@ApiModelProperty(value = "已处理数量")
	private Integer dealNum;
	@ApiModelProperty(value = "未处理数量")
	private Integer notDealNum;
	@ApiModelProperty(value = "负责案件总数")
	private Integer sum;
	@ApiModelProperty(value = "结案率")
	private String per;

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getDealNum() {
		return dealNum;
	}

	public void setDealNum(Integer dealNum) {
		this.dealNum = dealNum;
	}

	public Integer getNotDealNum() {
		return notDealNum;
	}

	public void setNotDealNum(Integer notDealNum) {
		this.notDealNum = notDealNum;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}
}
