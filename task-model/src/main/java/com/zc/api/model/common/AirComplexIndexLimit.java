package com.zc.api.model.common;

public class AirComplexIndexLimit
{
        public String so2 ;
        public String no2 ;
        public String co ;
        public String o3 ;
        public String pm10 ;
        public String pm25 ;

    @Override
    public String toString() {
        return "{" +
            " so2='" + getSo2() + "'" +
            ", no2='" + getNo2() + "'" +
            ", co='" + getCo() + "'" +
            ", o3='" + getO3() + "'" +
            ", pm10='" + getPm10() + "'" +
            ", pm25='" + getPm25() + "'" +
            "}";
    }

    public String getSo2() {
        return this.so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getNo2() {
        return this.no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getCo() {
        return this.co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return this.o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getPm10() {
        return this.pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm25() {
        return this.pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }
}