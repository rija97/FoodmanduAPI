package com.sheela.foodmandu.model;


public class User {
    private int image_id;
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private int phoneno;
    private String password;



    public User(String firstname, String lastname, String email, String username,int phoneno, String password) {
        this.image_id = image_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username=username;
        this.phoneno = phoneno;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}