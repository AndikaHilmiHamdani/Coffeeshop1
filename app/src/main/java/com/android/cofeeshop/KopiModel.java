package com.android.cofeeshop;

public class KopiModel {
    private String title, rating,desc;
    int image, price;
    public KopiModel() {
    }
    public KopiModel(String title, String rating, String desc, int price, int image) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.image=image;
        this.desc=desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
