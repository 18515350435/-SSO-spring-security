package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Result")
public class Result {
    @XmlElement(name = "System")
    private SystemIn system;
    @XmlElement(name = "Citys")
    private Citys Citys;

    public Citys getCitys() {
        return Citys;
    }

    public void setCitys(Citys citys) {
        Citys = citys;
    }

    public SystemIn getSystem() {
        return system;
    }

    public void setSystem(SystemIn system) {
        this.system = system;
    }
}