package com.zc.biz.dao.models.dbOne.jinghai;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "air_qualitycountyday")
public class CountyData implements Serializable {
    @Column(name = "Id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
