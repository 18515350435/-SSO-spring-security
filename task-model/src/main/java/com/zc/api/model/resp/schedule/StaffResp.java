package com.zc.api.model.resp.schedule;



public class StaffResp {
    private String username;
    private String mobile;
    private String checkin;
    private String checkout;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCheckin() {
        return this.checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return this.checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}