package com.company.PersistenceLayer;

import java.io.Serializable;

public class Technique implements Serializable {

    private static final long VersionUID = 1L;

    private double price;
    private String name;

    public Technique() {

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Technique(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\n";
    }
}
