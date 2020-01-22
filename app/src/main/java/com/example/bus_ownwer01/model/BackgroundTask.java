package com.example.bus_ownwer01.model;

public class BackgroundTask {
    private static BackgroundTask backgroundTask;
    private static String ownerID;
    private static String ownerfirstName;
    private static String ownerlastName;
    private static String ownerMail;
    private static int ownerContact;
    private static boolean isOwnerVirtify;


    private BackgroundTask(String ownerID, String ownerfirstName, String ownerlastName, String ownerMail, int ownerContact, boolean isOwnerVirtify){
        this.ownerID =ownerID;
        this.ownerfirstName=ownerfirstName;
        this.ownerlastName=ownerlastName;
        this.ownerMail=ownerMail;
        this.ownerContact=ownerContact;
        this.isOwnerVirtify=isOwnerVirtify;
    }

    public static BackgroundTask getBackgroundTask() {
        return backgroundTask;
    }

    public static void setBackgroundTask(BackgroundTask backgroundTask) {
        BackgroundTask.backgroundTask = backgroundTask;
    }

    public static String getOwnerID() {
        return ownerID;
    }

    public static void setOwnerID(String ownerID) {
        BackgroundTask.ownerID = ownerID;
    }

    public static String getOwnerfirstName() {
        return ownerfirstName;
    }

    public static void setOwnerfirstName(String ownerfirstName) {
        BackgroundTask.ownerfirstName = ownerfirstName;
    }

    public static String getOwnerlastName() {
        return ownerlastName;
    }

    public static void setOwnerlastName(String ownerlastName) {
        BackgroundTask.ownerlastName = ownerlastName;
    }

    public static String getOwnerMail() {
        return ownerMail;
    }

    public static void setOwnerMail(String ownerMail) {
        BackgroundTask.ownerMail = ownerMail;
    }

    public static int getOwnerContact() {
        return ownerContact;
    }

    public static void setOwnerContact(int ownerContact) {
        BackgroundTask.ownerContact = ownerContact;
    }

    public static boolean isIsOwnerVirtify() {
        return isOwnerVirtify;
    }

    public static void setIsOwnerVirtify(boolean isOwnerVirtify) {
        BackgroundTask.isOwnerVirtify = isOwnerVirtify;
    }

    public static BackgroundTask setBackgroundTask(String ownerID, String ownerfirstName, String ownerlastName, String ownerMail, int ownerContact, boolean isOwnerVirtify) {
        if (backgroundTask == null) {
            backgroundTask = new BackgroundTask(ownerID, ownerfirstName, ownerlastName, ownerMail, ownerContact, isOwnerVirtify);
        }
        return backgroundTask;
    }
}
