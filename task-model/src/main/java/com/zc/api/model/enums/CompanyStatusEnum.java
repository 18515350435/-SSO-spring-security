package com.zc.api.model.enums;

import java.io.Serializable;

public enum CompanyStatusEnum implements Serializable{
    /** 灰色，离线或停炉 */
	离线或停炉("离线或停炉", 1),
	/** 黄色，异常*/
	异常("异常", 10),
	/** 红色，超标 */
	超标("超标", 30),
	/** 绿色，正常 */
	正常("正常", 20),
	/** 默认颜色，黑色 */
	Default("Default", 20);

	private String display;
	private int code;

	// 构造方法
	private CompanyStatusEnum(String display, int code) {
		this.display = display;
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

	public String getValue() {
		return name();
	}

	public static CompanyStatusEnum fromCode(int code) {
		CompanyStatusEnum[] states = CompanyStatusEnum.values();
		for (CompanyStatusEnum state : states) {
			if (state.getCode() == code) {
				return state;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.display;
	}

	public String getDisplay() {
		return display;
	}
}