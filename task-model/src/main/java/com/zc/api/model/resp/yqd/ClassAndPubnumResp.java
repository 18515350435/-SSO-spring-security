package com.zc.api.model.resp.yqd;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "根据分类查询饼状图的出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class ClassAndPubnumResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040441L;
	
	@ApiModelProperty(value = "分类id或网格id")
	private String id;
	@ApiModelProperty(value = "分类名或网格名")
	private String name;
	@ApiModelProperty(value = "该分类对应的污染源数值")
	private String pubnum;
	@ApiModelProperty(value = "该分类对应的污染源数值百分比")
	private String pubnumPer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPubnum() {
		return pubnum;
	}

	public void setPubnum(String pubnum) {
		this.pubnum = pubnum;
	}

	public String getPubnumPer() {
		return pubnumPer;
	}

	public void setPubnumPer(String pubnumPer) {
		this.pubnumPer = pubnumPer;
	}
}
