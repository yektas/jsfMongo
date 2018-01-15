package com.trnet.spring.model;




public class Item {
    int quantity;
    int price;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }
}
