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

@ApiModel(value = "二级菜单权限")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class SecondLevel implements Serializable {
    @ApiModelProperty(value = "权限菜单id")
    private String permissionId;
    @ApiModelProperty(value = "菜点名称")
    private String label;
    @ApiModelProperty(value = "url路径")
    private String path;
    @ApiModelProperty(value = "是否拥有此权限 0未拥有 1已拥有")
    private String havaThis;
    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getHavaThis() {
        return havaThis;
    }

    public void setHavaThis(String havaThis) {
        this.havaThis = havaThis;
    }
}