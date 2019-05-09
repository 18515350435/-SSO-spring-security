package com.zc.biz.dao.models.dbOne.sys;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_users")
public class SysUsers implements Serializable {
    /**
     * ����id��uuid
     */
    @ApiModelProperty(value = "主键id,uuid")
    private String id;

    /**
     * ��¼��
     */
    @ApiModelProperty(value = "用户名")
    private String loginname;

    /**
     * ����
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * �Ա�0-Ů��1-��
     */
    @ApiModelProperty(value = "性别，0-女，1-男")
    private Integer sex;

    /**
     * �ǳ�
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * email
     */
    private String email;

    /**
     * �洢ͷ���ַ
     */
    @ApiModelProperty(value = "头像")
    private String photo;

    /**
     * ��ϵ��ʽ
     */
    private String phone;

    /**
     * ����id
     */
    @ApiModelProperty(value = "部门id")
    private Integer departid;

    /**
     * �������
     */
    @ApiModelProperty(value = "区域编码")
    private String areacode;

    /**
     * �Ƿ�Ϊ����Ա��0-�ǣ�1-��
     */
//    @ApiModelProperty(value = "是否为管理员，0-是，1-否")
//    private Integer isadmin;

    /**
     * �û�״̬��0-ɾ����1-���ã�2-���ã�Ĭ��1
     */
    @ApiModelProperty(value = "用户状态，0-删除，1-启用，2-禁用")
    private Integer status;

    /**
     * ����ʱ�䣬ֻ�ڵ�һ�δ���ʱд�룬�������޸�
     */
    @ApiModelProperty(value = "创建时间，只在第一次创建时写入，且无需修改")
    private Date createtime;

    /**
     * ���һ���޸�ʱ��
     */
    @ApiModelProperty(value = "最近一次修改时间")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ����id��uuid
     *
     * @return id - ����id��uuid
     */
    public String getId() {
        return id;
    }

    /**
     * ��������id��uuid
     *
     * @param id ����id��uuid
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ��¼��
     *
     * @return loginname - ��¼��
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * ���õ�¼��
     *
     * @param loginname ��¼��
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ�Ա�0-Ů��1-��
     *
     * @return sex - �Ա�0-Ů��1-��
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * �����Ա�0-Ů��1-��
     *
     * @param sex �Ա�0-Ů��1-��
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * ��ȡ�ǳ�
     *
     * @return nickname - �ǳ�
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * �����ǳ�
     *
     * @param nickname �ǳ�
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * ��ȡemail
     *
     * @return email - email
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ�洢ͷ���ַ
     *
     * @return photo - �洢ͷ���ַ
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * ���ô洢ͷ���ַ
     *
     * @param photo �洢ͷ���ַ
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * ��ȡ��ϵ��ʽ
     *
     * @return phone - ��ϵ��ʽ
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ������ϵ��ʽ
     *
     * @param phone ��ϵ��ʽ
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * ��ȡ����id
     *
     * @return departid - ����id
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * ���ò���id
     *
     * @param departid ����id
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * ��ȡ�������
     *
     * @return areacode - �������
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * �����������
     *
     * @param areacode �������
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

//    /**
//     * ��ȡ�Ƿ�Ϊ����Ա��0-�ǣ�1-��
//     *
//     * @return isadmin - �Ƿ�Ϊ����Ա��0-�ǣ�1-��
//     */
//    public Integer getIsadmin() {
//        return isadmin;
//    }
//
//    /**
//     * �����Ƿ�Ϊ����Ա��0-�ǣ�1-��
//     *
//     * @param isadmin �Ƿ�Ϊ����Ա��0-�ǣ�1-��
//     */
//    public void setIsadmin(Integer isadmin) {
//        this.isadmin = isadmin;
//    }

    /**
     * ��ȡ�û�״̬��0-ɾ����1-���ã�2-���ã�Ĭ��1
     *
     * @return status - �û�״̬��0-ɾ����1-���ã�2-���ã�Ĭ��1
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * �����û�״̬��0-ɾ����1-���ã�2-���ã�Ĭ��1
     *
     * @param status �û�״̬��0-ɾ����1-���ã�2-���ã�Ĭ��1
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ����ʱ�䣬ֻ�ڵ�һ�δ���ʱд�룬�������޸�
     *
     * @return createtime - ����ʱ�䣬ֻ�ڵ�һ�δ���ʱд�룬�������޸�
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * ���ô���ʱ�䣬ֻ�ڵ�һ�δ���ʱд�룬�������޸�
     *
     * @param createtime ����ʱ�䣬ֻ�ڵ�һ�δ���ʱд�룬�������޸�
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * ��ȡ���һ���޸�ʱ��
     *
     * @return updatetime - ���һ���޸�ʱ��
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * �������һ���޸�ʱ��
     *
     * @param updatetime ���һ���޸�ʱ��
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginname=").append(loginname);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", photo=").append(photo);
        sb.append(", phone=").append(phone);
        sb.append(", departid=").append(departid);
        sb.append(", areacode=").append(areacode);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}