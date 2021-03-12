package com.example.spinnertest;

public class Data {
    private String name;
    private int price;
    private int img;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
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

    public Data(String name, int price, int img) {
        this.name = name;
        this.price = price;
        this.img = img;
    }
}
