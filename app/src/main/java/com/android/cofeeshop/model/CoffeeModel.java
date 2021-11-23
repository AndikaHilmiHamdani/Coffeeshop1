package com.android.cofeeshop.model;

import java.io.Serializable;

public class CoffeeModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int price, totalItem;
    private String image;

    public CoffeeModel(String name, int price, String image) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}