package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PerValueKey implements Serializable {

    @ApiModelProperty(value = "描述")
    private String key;
    @ApiModelProperty(value = "数值")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}