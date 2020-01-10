package com.sheela.foodmandu.model;

public class Details {
    private int image;
    private String RTitle;
//    private String Address;

    public Details(int image, String RTitle) {
        this.image = image;
        this.RTitle = RTitle;
//        Address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRTitle() {
        return RTitle;
    }

    public void setRTitle(String RTitle) {
        this.RTitle = RTitle;
    }

//    public String getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String address) {
//        Address = address;
//    }
}
