package com.example.demo.classes;

public class User{

    private String FullName;
    private String Email;
    private String Password;

    public User(String fullName, String email, String password){
        this.FullName = fullName;
        this.Email = email;
        this.Password = password;
    }

    public String getFullName(){
        return this.FullName;
    }

    public void setFullName(String fullname){
        this.FullName = fullname;
    }

    public String getEmail(){
        return this.Email;
    }

    public void setEmail(String email){
        this.Email = email;
    }

    public String getPassword(){
        return this.Password;
    }

    public void setPassword(String password){
        this.Password = password;
    }

    
}