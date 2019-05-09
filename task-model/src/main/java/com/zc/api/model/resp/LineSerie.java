package com.zc.api.model.resp;

import java.util.List;

public class LineSerie{
    private String name;
    private String type;
    private String stack;
    private List<String> data;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStack() {
        return this.stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public List<String> getData() {
        return this.data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}