package com.scienstechnologies.simpleseparationproject.models.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RootModel {

    @SerializedName("login")
    @Expose
    public String loginName;


    @SerializedName("location")
    @Expose
    public String location;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
