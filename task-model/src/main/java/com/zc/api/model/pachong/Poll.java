package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Poll {
	@XmlElement
	private String Name;
	@XmlElement
	private String Value;
	@XmlElement
	private String Count;
	@XmlElement
	private String IAQI;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public String getCount() {
		return Count;
	}

	public void setCount(String count) {
		Count = count;
	}

	public String getIAQI() {
		return IAQI;
	}

	public void setIAQI(String IAQI) {
		this.IAQI = IAQI;
	}
}
