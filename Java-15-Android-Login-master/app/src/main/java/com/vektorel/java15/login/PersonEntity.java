package com.vektorel.java15.login;

/**
 * Created by vektorel on 15.01.2017.
 */
public class PersonEntity {
    private String name = "mustafa";
    private String userName = "leprax";
    private String passworld = "1234";

    public void setName(String name) {
        this.name = name;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getPassworld() {
        return passworld;
    }

    public String getUserName() {
        return userName;
    }
}
