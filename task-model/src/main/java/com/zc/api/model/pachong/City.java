package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class City {
	@XmlElement
	private String Name;
	@XmlElement
	private String DataTime;
	@XmlElement
	private String AQI;
	@XmlElement
	private String Level;
	@XmlElement
	private String Type;
	@XmlElement
	private String LevelIndex;
	@XmlElement
	private String MaxPoll;
	@XmlElement
	private String Color;
	@XmlElement
	private String Intro;
	@XmlElement
	private String Tips;
	@XmlElement
	private String ShowDetail;
	@XmlElement
	private Pointers Pointers;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDataTime() {
		return DataTime;
	}

	public void setDataTime(String dataTime) {
		DataTime = dataTime;
	}

	public String getAQI() {
		return AQI;
	}

	public void setAQI(String AQI) {
		this.AQI = AQI;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getLevelIndex() {
		return LevelIndex;
	}

	public void setLevelIndex(String levelIndex) {
		LevelIndex = levelIndex;
	}

	public String getMaxPoll() {
		return MaxPoll;
	}

	public void setMaxPoll(String maxPoll) {
		MaxPoll = maxPoll;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getIntro() {
		return Intro;
	}

	public void setIntro(String intro) {
		Intro = intro;
	}

	public String getTips() {
		return Tips;
	}

	public void setTips(String tips) {
		Tips = tips;
	}

	public String getShowDetail() {
		return ShowDetail;
	}

	public void setShowDetail(String showDetail) {
		ShowDetail = showDetail;
	}

	public Pointers getPointers() {
		return Pointers;
	}

	public void setPointers(Pointers pointers) {
		Pointers = pointers;
	}
}
