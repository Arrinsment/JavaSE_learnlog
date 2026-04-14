package com.huads.ui;

public class user {
    //这里我们新写一个user类去管理我们的 用户名和用户密码
    private String name;
    private String passWorld;

    public user() {
    }

    public user(String name, String passWorld) {
        this.name = name;
        this.passWorld = passWorld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }
}
