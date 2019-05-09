package com.zc.api.model.resp.cases;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "案件各类责任主数量")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CaseDepNumResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040241L;

	@ApiModelProperty(value = "总数")
	private Integer sum;
	@ApiModelProperty(value = "责任主体编码")
	private String pcode;
	@ApiModelProperty(value = "责任主体名称")
	private String pname;
	@ApiModelProperty(value = "各种污染类型占比")
	private List<CaseKindsNumResp> caseKindsNumRespList=new ArrayList<CaseKindsNumResp>();

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<CaseKindsNumResp> getCaseKindsNumRespList() {
		return caseKindsNumRespList;
	}

	public void setCaseKindsNumRespList(List<CaseKindsNumResp> caseKindsNumRespList) {
		this.caseKindsNumRespList = caseKindsNumRespList;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
}
