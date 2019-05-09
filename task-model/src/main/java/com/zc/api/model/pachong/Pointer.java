package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pointer {
	@XmlElement
	private String City;
	@XmlElement
	private String Region;
	@XmlElement
	private String Name;
	@XmlElement
	private String DataTime;
	@XmlElement
	private String AQI;
	@XmlElement
	private String Level;
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
	private String CLng;
	@XmlElement
	private String CLat;
	@XmlElement
	private String ShowDetail;
	@XmlElement
	private Polls Polls;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

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

	public String getCLng() {
		return CLng;
	}

	public void setCLng(String CLng) {
		this.CLng = CLng;
	}

	public String getCLat() {
		return CLat;
	}

	public void setCLat(String CLat) {
		this.CLat = CLat;
	}

	public String getShowDetail() {
		return ShowDetail;
	}

	public void setShowDetail(String showDetail) {
		ShowDetail = showDetail;
	}

	public Polls getPolls() {
		return Polls;
	}

	public void setPolls( Polls polls) {
		Polls = polls;
	}

	@Override
	public String toString() {
		return "Pointer{" +
				"City='" + City + '\'' +
				", Region='" + Region + '\'' +
				", Name='" + Name + '\'' +
				", DataTime='" + DataTime + '\'' +
				", AQI='" + AQI + '\'' +
				", Level='" + Level + '\'' +
				", LevelIndex='" + LevelIndex + '\'' +
				", MaxPoll='" + MaxPoll + '\'' +
				", Color='" + Color + '\'' +
				", Intro='" + Intro + '\'' +
				", Tips='" + Tips + '\'' +
				", CLng='" + CLng + '\'' +
				", CLat='" + CLat + '\'' +
				", ShowDetail='" + ShowDetail + '\'' +
				", Polls=" + Polls +
				'}';
	}
}
