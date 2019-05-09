package com.zc.api.model.resp;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "单点登录信息")
public class CookieInfoResp implements Serializable {
	
	private static final long serialVersionUID = -4180408080689904238L;
	
	@ApiModelProperty(value = "签名算法")
	private String alg;
	@ApiModelProperty(value = "密钥ID")
	private String kid;
	@ApiModelProperty(value = "令牌类型")
	private String typ;
	@ApiModelProperty(value = "过期时间")
	private Long exp;
	@ApiModelProperty(value = "颁发时间")
	private Long iat;
	@ApiModelProperty(value = "颁发者")
	private String iss;
	@ApiModelProperty(value = "接受方")
	private String aud;
	@ApiModelProperty(value = "令牌ID")
	private String jti;
	@ApiModelProperty(value = "用户ID")
	private String sub;
	@ApiModelProperty(value = "昵称")
	private String nickname;
	@ApiModelProperty(value = "社保卡是否绑定")
	private String is_bind;
	@ApiModelProperty(value = "真实姓名")
	private String name;
	@ApiModelProperty(value = "JWT字符串")
	private String jwt;
	@ApiModelProperty(value = "用户类型")
	private String userType;

	@ApiModelProperty(value = "跳转地址")
	private String jumpUrl;
	@ApiModelProperty(value = "登录是否过期")
	private Boolean isExpired = true; // true-已过期，false-未过期
	@ApiModelProperty(value = "是否绑定社保卡")
	private Boolean isBind = false;

	public String getAlg() {
		return alg;
	}

	public void setAlg(String alg) {
		this.alg = alg;
	}

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public Long getExp() {
		return exp;
	}

	public void setExp(Long exp) {
		this.exp = exp;
	}

	public Long getIat() {
		return iat;
	}

	public void setIat(Long iat) {
		this.iat = iat;
	}

	public String getIss() {
		return iss;
	}

	public void setIss(String iss) {
		this.iss = iss;
	}

	public String getAud() {
		return aud;
	}

	public void setAud(String aud) {
		this.aud = aud;
	}

	public String getJti() {
		return jti;
	}

	public void setJti(String jti) {
		this.jti = jti;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIs_bind() {
		return is_bind;
	}

	public void setIs_bind(String is_bind) {
		this.is_bind = is_bind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	public Boolean getIsBind() {
		return isBind;
	}

	public void setIsBind(Boolean isBind) {
		this.isBind = isBind;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getJumpUrl() {
		return jumpUrl;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "CookieInfoResp [alg=" + alg + ", kid=" + kid + ", typ=" + typ
				+ ", exp=" + exp + ", iat=" + iat + ", iss=" + iss + ", aud="
				+ aud + ", jti=" + jti + ", sub=" + sub + ", nickname="
				+ nickname + ", is_bind=" + is_bind + ", name=" + name
				+ ", jwt=" + jwt + ", userType=" + userType + ", jumpUrl="
				+ jumpUrl + ", isExpired=" + isExpired + ", isBind=" + isBind
				+ "]";
	}

}
