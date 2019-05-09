package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pointers {
	@XmlElement(name="Pointer")
	private List<Pointer> pointerList;

	public List<Pointer> getPointerList() {
		return pointerList;
	}

	public void setPointerList(List<Pointer> pointerList) {
		this.pointerList = pointerList;
	}
}
