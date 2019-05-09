package com.zc.biz.dao.models.dbTwo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_demo")
public class TDemo implements Serializable {
    @Id
    @Column(name = "demo_id")
    private Integer demoId;

    /**
     * 姓名
     */
    @Column(name = "demo_name")
    private String demoName;

    /**
     * 描述
     */
    @Column(name = "demo_describe")
    private String demoDescribe;

    private static final long serialVersionUID = 1L;

    /**
     * @return demo_id
     */
    public Integer getDemoId() {
        return demoId;
    }

    /**
     * @param demoId
     */
    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    /**
     * 获取姓名
     *
     * @return demo_name - 姓名
     */
    public String getDemoName() {
        return demoName;
    }

    /**
     * 设置姓名
     *
     * @param demoName 姓名
     */
    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    /**
     * 获取描述
     *
     * @return demo_describe - 描述
     */
    public String getDemoDescribe() {
        return demoDescribe;
    }

    /**
     * 设置描述
     *
     * @param demoDescribe 描述
     */
    public void setDemoDescribe(String demoDescribe) {
        this.demoDescribe = demoDescribe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", demoId=").append(demoId);
        sb.append(", demoName=").append(demoName);
        sb.append(", demoDescribe=").append(demoDescribe);
        sb.append("]");
        return sb.toString();
    }
}