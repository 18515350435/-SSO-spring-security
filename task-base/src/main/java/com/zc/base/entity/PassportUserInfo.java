package com.zc.base.entity;

/**
 * 统一用户信息
 * 
 * @author guofan
 *
 */
public class PassportUserInfo {
	/**
	 * 登录账户
	 */
	String loginName;
	/**
	 * 社保卡序号
	 */
	String serialNumber;
	/**
	 * 身份证号
	 */
	String idNo;
	/**
	 * 姓名
	 */
	String name;
	/**
	 * 社保卡号
	 */
	String socialNum;
	/**
	 * 社保卡电话
	 */
	String sinCardPhone;
	/**
	 * 平台电话，登录账号
	 */
	String phone;
	/**
	 * 社保卡SSID
	 */
	String sid;
	/**
	 * 行政区划号码
	 */
	String districtId;
	/**
	 * 行政区划名称
	 */
	String districtName;
	/**
	 * 性别
	 */
	String sex;
	/**
	 * 授权手机号
	 */
	String authPhone;

	/**
	 * 参保类型
	 */
	String insuredType;

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName
	 *            the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber
	 *            the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the idNo
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * @param idNo
	 *            the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the socialNum
	 */
	public String getSocialNum() {
		return socialNum;
	}

	/**
	 * @param socialNum
	 *            the socialNum to set
	 */
	public void setSocialNum(String socialNum) {
		this.socialNum = socialNum;
	}

	/**
	 * @return the sinCardPhone
	 */
	public String getSinCardPhone() {
		return sinCardPhone;
	}

	/**
	 * @param sinCardPhone
	 *            the sinCardPhone to set
	 */
	public void setSinCardPhone(String sinCardPhone) {
		this.sinCardPhone = sinCardPhone;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the districtId
	 */
	public String getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId
	 *            the districtId to set
	 */
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName
	 *            the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the authPhone
	 */
	public String getAuthPhone() {
		return authPhone;
	}

	/**
	 * @param authPhone
	 *            the authPhone to set
	 */
	public void setAuthPhone(String authPhone) {
		this.authPhone = authPhone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PassportUserInfo [loginName=" + loginName + ", serialNumber="
				+ serialNumber + ", idNo=" + idNo + ", name=" + name
				+ ", socialNum=" + socialNum + ", sinCardPhone=" + sinCardPhone
				+ ", phone=" + phone + ", sid=" + sid + ", districtId="
				+ districtId + ", districtName=" + districtName + ", sex="
				+ sex + ", authPhone=" + authPhone + "]";
	}

	/**
	 * @return the insuredType
	 */
	public String getInsuredType() {
		return insuredType;
	}

	/**
	 * @param insuredType
	 *            the insuredType to set
	 */
	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}

}
