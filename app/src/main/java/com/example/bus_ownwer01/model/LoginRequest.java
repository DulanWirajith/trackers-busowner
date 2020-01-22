package com.example.bus_ownwer01.model;

public class LoginRequest {
    private String owner_mail;
    private String password;

    public String getOwner_mail() {
        return owner_mail;
    }

    public void setOwner_mail(String owner_mail) {
        this.owner_mail = owner_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
