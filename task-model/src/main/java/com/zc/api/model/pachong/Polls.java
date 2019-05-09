package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Polls {
	@XmlElement(name="Poll")
	private List<Poll> pollList;

	public List<Poll> getPollList() {
		return pollList;
	}

	public void setPollList(List<Poll> pollList) {
		this.pollList = pollList;
	}
}
