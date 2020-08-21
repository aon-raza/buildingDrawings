package com.SAR.buildingdrawing.models;

public class user {
    private String name;
    private String email;
    private String phone;
    private String id;
    private String type;
    private String photo;
    private String vendor_category;

    boolean emailVerified;

    public user() {
    }

    public user(String name, String email, String phone, String id, String type, String photo, String vendor_category) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.id = id;
        this.type = type;
        this.photo = photo;
        this.vendor_category = vendor_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getVendor_category() {
        return vendor_category;
    }

    public void setVendor_category(String vendor_category) {
        this.vendor_category = vendor_category;
    }
}