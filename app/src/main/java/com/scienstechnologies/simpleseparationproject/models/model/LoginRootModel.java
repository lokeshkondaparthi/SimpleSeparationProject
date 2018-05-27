package com.scienstechnologies.simpleseparationproject.models.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRootModel {
    @SerializedName("status")
    @Expose
    String status;


    @SerializedName("data")
    @Expose
    LoginDataModel loginDataModel;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LoginDataModel getLoginDataModel() {
        return loginDataModel;
    }

    public void setLoginDataModel(LoginDataModel loginDataModel) {
        this.loginDataModel = loginDataModel;
    }
}
