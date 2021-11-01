package com.company.PersistenceLayer;

import java.io.Serializable;

public class Phone extends Technique implements Serializable {

    private static final long VersionUID = 1L;

    private String type;


    public Phone(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public Phone(){
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
        return "Phone:\n" + super.toString() + "Type of phone: " + type + "\n";
    }
}
