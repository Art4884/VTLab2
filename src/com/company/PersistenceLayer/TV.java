package com.company.PersistenceLayer;

import java.io.Serializable;

public class TV extends Technique implements Serializable {

    private static final long VersionUID = 1L;

    private String screenType;

    public TV(String name, double price, String screenType) {
        super(name, price);
        this.screenType = screenType;
    }

    public TV(){
        super();
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return "TV:\n" + super.toString() + "Type of screen: " + screenType + "\n";
    }
}
