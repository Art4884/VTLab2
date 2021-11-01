package com.company.PersistenceLayer;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class SerializeToXML<T> {

    private final String SERIALIZED_FILE_NAME = "DB.xml";

    public void serialize(ArrayList<T> object){
        XMLEncoder encoder;
        try{
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
            encoder.writeObject(object);
            encoder.close();
        }catch (FileNotFoundException e){
            System.out.println("ERROR: While creating or opening the file " + SERIALIZED_FILE_NAME);
        }
    }

    public ArrayList<T> deserialize(){
        ArrayList<T> list = new ArrayList<>();
        XMLDecoder decoder;
        try{
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
            list = (ArrayList<T>) decoder.readObject();
            decoder.close();
        }catch (FileNotFoundException e){
            System.out.println("ERROR: File " + SERIALIZED_FILE_NAME + " not found!");
        }
        return list;
    }
}
