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
import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "一级菜单权限")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class FirstLevel implements Serializable {
    @ApiModelProperty(value = "菜点名称")
    private String label;
    @ApiModelProperty(value = "菜点名称")
    private List<SecondLevel> children=new ArrayList<>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<SecondLevel> getChildren() {
        return children;
    }

    public void setChildren(List<SecondLevel> children) {
        this.children = children;
    }
}