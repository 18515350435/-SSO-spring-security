package com.zc.api.model.resp;

import java.io.Serializable;

public class ValueTime implements Serializable {

    public String value;

    public String time;

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" +
            ", time='" + getTime() + "'" +
            "}";
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}