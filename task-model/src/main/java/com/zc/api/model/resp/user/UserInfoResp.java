package com.zc.api.model.resp.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "用户及其信息出参")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class UserInfoResp implements Serializable {

	private static final long serialVersionUID = -90212727088040441L;

	@ApiModelProperty(value = "用户id")
	private Long id;

	/**
	 * 姓名
	 */
	@ApiModelProperty(value = "用户姓名")
	private String name;

	/**
	 * 年龄
	 */
	@ApiModelProperty(value = "年龄")
	private Integer age;

	/**
	 * 区域id
	 */
	@ApiModelProperty(value = "区域id")
	private Long regionId;
	@ApiModelProperty(value = "地址")
	private String address;
	@ApiModelProperty(value = "性别")
	private String sex;
	@ApiModelProperty(value = "课程信息")
	private List<CourseResp> jcCourse;

	public List<CourseResp> getJcCourse() {
		return jcCourse;
	}

	public void setJcCourse(List<CourseResp> jcCourse) {
		this.jcCourse = jcCourse;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
}
