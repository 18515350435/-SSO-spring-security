package com.zc.biz.dao.models.dbOne.sys;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "sys_warning")
public class SysWarning implements Serializable {
    @Column(name = "Id")
    private Long id;

    @Column(name = "Content")
    private String content;

    @Column(name = "Code")
    private Integer code;

    private static final long serialVersionUID = 1L;

    /**
     * @return Id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return Code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }
}