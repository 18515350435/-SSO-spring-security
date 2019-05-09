package com.zc.api.model.req;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "test入参")
@JsonInclude(JsonInclude.Include.NON_NULL)
// 不输出NULL字段
public class TestReq implements Serializable {

	private static final long serialVersionUID = 4159704841070201463L;
	
    private Integer demoId;

    private String demoName;

    private String demoDescribe;
    
    public Integer getDemoId() {
		return demoId;
	}

	public void setDemoId(Integer demoId) {
		this.demoId = demoId;
	}

	public String getDemoName() {
		return demoName;
	}

	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}

	public String getDemoDescribe() {
		return demoDescribe;
	}

	public void setDemoDescribe(String demoDescribe) {
		this.demoDescribe = demoDescribe;
	}

}
