package com.company.BuisnessLayer;

import com.company.PersistenceLayer.Data;
import com.company.PersistenceLayer.Headphones;
import com.company.PersistenceLayer.Technique;

import java.util.ArrayList;

public class BusinessClass {

    public String displayAll(){
       return new Data().viewAllStorage();
    }

    public ArrayList<Technique> findByType(String type){
        Data data = new Data();
        ArrayList<Technique> storage = data.getDB();
        ArrayList<Technique> soughtTypes = new ArrayList<>();
        for (Technique technique : storage) {
            if (technique.getClass().getSimpleName().equals(type)) {
                soughtTypes.add(technique);
            }
        }
        return soughtTypes;
    }

    public Technique findTheCheapest(String type){
        ArrayList<Technique> storageList = new Data().getDB();
        int count = 0;
        Technique cheap = null;
        for (Technique technique : storageList) {
            if (technique.getClass().getSimpleName().equals(type)) {
                if (count == 0) {
                    cheap = technique;
                    count++;
                } else {
                    if (technique.getPrice() < cheap.getPrice()) {
                        cheap = technique;
                    }
                }
            }
        }
        return cheap;
    }
}
