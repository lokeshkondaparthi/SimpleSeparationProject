package com.scienstechnologies.simpleseparationproject.models.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginDataModel {

    @SerializedName("first_name")
    @Expose
    String fName;

    @SerializedName("email_id")
    @Expose
    String emailId;


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
