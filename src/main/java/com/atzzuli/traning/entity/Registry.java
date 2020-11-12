package com.atzzuli.traning.entity;

public class Registry {
    public String password;
    public String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Registry{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
