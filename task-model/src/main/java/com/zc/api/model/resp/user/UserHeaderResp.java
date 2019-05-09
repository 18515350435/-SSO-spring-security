/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserHeaderResp
 * Author:   wuyinzhao
 * Date:     2018/9/10 10:35
 * Description: 修改用户信息model
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.api.model.resp.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈修改用户信息model〉
 *
 * @author wuyinzhao
 * @create 2018/9/10
 * @since 1.0.0
 */
@ApiModel(value = "修改用户信息model")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class UserHeaderResp implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Long id;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String name;
    @ApiModelProperty(value = "人员区域标签（使用的是截取相关长度的行政编码）")
    private String flagCode;
    /**
     * 角色id：0巡查员  1责任主体人员
     */
    @ApiModelProperty(value="岗位：0巡查员  1责任主体人员 责任主体可以处理案件 巡查员不允许处理案件")
    private String role;


    @ApiModelProperty(value = "用户联系方式")
    private String phone;

    @ApiModelProperty(value = "用户头像")
    private String headerUrl;

    public String getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }
}