package com.example.bus_ownwer01.model;

public class LoginResponse {
    private String message;
    private boolean isUserRight;
    private String ownerID;
    private String ownerfirstName;
    private String ownerlastName;
    private String ownerMail;
    private int ownerContact;
    private  boolean isOwnerVirtify;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isUserRight() {
        return isUserRight;
    }

    public void setUserRight(boolean userRight) {
        isUserRight = userRight;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerfirstName() {
        return ownerfirstName;
    }

    public void setOwnerfirstName(String ownerfirstName) {
        this.ownerfirstName = ownerfirstName;
    }

    public String getOwnerlastName() {
        return ownerlastName;
    }

    public void setOwnerlastName(String ownerlastName) {
        this.ownerlastName = ownerlastName;
    }

    public String getOwnerMail() {
        return ownerMail;
    }

    public void setOwnerMail(String ownerMail) {
        this.ownerMail = ownerMail;
    }

    public int getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(int ownerContact) {
        this.ownerContact = ownerContact;
    }

    public boolean isOwnerVirtify() {
        return isOwnerVirtify;
    }

    public void setOwnerVirtify(boolean ownerVirtify) {
        isOwnerVirtify = ownerVirtify;
    }
}
