package com.example.demo;

public class User{

    private String fullName;
    private String email;
    private String password;

    public void User(String fullName, String email, String password){
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public String getFullName(String fullName){
        return this.fullName;
    }

    public String setFullName(String fullname){
        this.fullName = fullname;
    }

}