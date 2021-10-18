package com.android.cofeeshop.model;

import java.io.Serializable;

public class CoffeeModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String price;
    private String image;

    public CoffeeModel(String name, String price, String image) {
        this.name = name;
        this.price = price;
        this.image= image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String emailId) {
        this.price = emailId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}