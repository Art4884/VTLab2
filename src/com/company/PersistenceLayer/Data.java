package com.company.PersistenceLayer;

import java.util.ArrayList;

public class Data {

    public ArrayList<Technique> getDB(){
        SerializeToXML<Technique> deserialize = new SerializeToXML<>();
        return deserialize.deserialize();
    }

    public String viewAllStorage(){
        ArrayList<Technique> storage= getDB();
        StringBuilder storeList = new StringBuilder();
        for(Technique technique : storage){
            storeList.append(technique.toString()).append("\n--------------------------\n");
        }
        return storeList.toString();
    }
}
