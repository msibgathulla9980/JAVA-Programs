package com.bridgelabz.utility;

public class Inventory {
    private String name;
    private float weight;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double d) {
        this.weight = (float) d;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public float getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }
}

