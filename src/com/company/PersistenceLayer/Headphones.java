package com.company.PersistenceLayer;

import java.io.Serializable;

public class Headphones extends Technique implements Serializable {

    private static final long VersionUID = 1L;

    private String type;

    public Headphones(String name, String type, double price){
        super(name, price);
        this.type = type;
    }

    public Headphones(){
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Headphones:\n" + super.toString() + "Type of headphones: " + type + "\n";
    }
}
