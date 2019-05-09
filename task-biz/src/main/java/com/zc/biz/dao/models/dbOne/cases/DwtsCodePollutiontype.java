package com.zc.biz.dao.models.dbOne.cases;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "dwts_code_pollutiontype")
public class DwtsCodePollutiontype implements Serializable {
    @Id
    private Integer id;

    /**
     * 污染类别编码
     */
    private String code;

    /**
     * 污染类别名称
     */
    private String name;

    /**
     * 污染类别父编码
     */
    @Column(name = "pCode")
    private String pcode;

    /**
     * 备注
     */
    @Column(name = "Comment")
    private String comment;

    /**
     * 开始时间
     */
    @Column(name = "BeginTime")
    private Date begintime;

    /**
     * 结束时间
     */
    @Column(name = "EndTime")
    private Date endtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取污染类别编码
     *
     * @return code - 污染类别编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置污染类别编码
     *
     * @param code 污染类别编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取污染类别名称
     *
     * @return name - 污染类别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置污染类别名称
     *
     * @param name 污染类别名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取污染类别父编码
     *
     * @return pCode - 污染类别父编码
     */
    public String getPcode() {
        return pcode;
    }

    /**
     * 设置污染类别父编码
     *
     * @param pcode 污染类别父编码
     */
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    /**
     * 获取备注
     *
     * @return Comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取开始时间
     *
     * @return BeginTime - 开始时间
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * 设置开始时间
     *
     * @param begintime 开始时间
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * 获取结束时间
     *
     * @return EndTime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", pcode=").append(pcode);
        sb.append(", comment=").append(comment);
        sb.append(", begintime=").append(begintime);
        sb.append(", endtime=").append(endtime);
        sb.append("]");
        return sb.toString();
    }
}