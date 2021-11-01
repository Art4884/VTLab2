package com.company.PresentationLayer;

import com.company.BuisnessLayer.BusinessClass;
import com.company.PersistenceLayer.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Headphones h1 = new Headphones("Samsung Galaxy Buds 2", "in-ear", 370.74);
//        Headphones h2 = new Headphones("JBL Tune 510BT", "on-ear", 88.78);
//        Headphones h3 = new Headphones("Sony WH-1000XM4", "monitor", 799);
//        TV t1 = new TV("Samsung QE55Q67AAU", 2090, "LCD");
//        TV t2 = new TV("Panasonic TX-PR50G20", 550, "plasma");
//        TV t3 = new TV("LG OLED65C1RLA", 3400, "OLED");
//        Phone p1 = new Phone("Samsung Galaxy S10", 1200, "touchscreen");
//        Phone p2 = new Phone("Apple IPhone XS", 1500, "touchscreen");
//        ArrayList<Technique> list = new ArrayList<>();
//        list.add(h1);
//        list.add(h2);
//        list.add(h3);
//        list.add(t1);
//        list.add(t2);
//        list.add(t3);
//        list.add(p1);
//        list.add(p2);
//        SerializeToXML<Technique> serialize= new SerializeToXML<>();
//        serialize.serialize(list);
	    menu();
    }

    public static void menu(){
        System.out.println("Please, enter what you want to do: \n" +
                "'Display' for displaying all technique in store;\n" +
                "'Find' for finding all technique of same type;\n" +
                "'Cheap' for finding the cheapest technique in store;\n" +
                "'Exit' for exit from program.");
        Scanner scan = new Scanner(System.in);
        boolean isExit = false;
        do{
            System.out.print("Function: ");
            String choice = scan.nextLine();
            switch (choice) {
                case "Display" -> displayInfo();
                case "Find" -> findByType();
                case "Cheap" -> findTheCheapest();
                case "Exit" -> isExit = true;
                default -> System.out.println("Please, check your spelling!");
            }
        }while (!isExit);
    }

    public static void displayInfo(){
        System.out.println("Full store:\n" + new BusinessClass().displayAll());
    }

    public static void findByType(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, print what type of technique you want to find: ");
        String type = scan.nextLine();
        ArrayList<Technique> soughtHeadphones = new BusinessClass().findByType(type);
        System.out.println("Sought type of technique:");
        for(Technique technique : soughtHeadphones){
            System.out.println(technique.toString() + "\n----------------------------------\n");
        }
    }

    public static void findTheCheapest(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a type of technique you want to get the cheapest: ");
        String type = scan.nextLine();
        System.out.println("\nThe cheapest " + type + " is:\n" + new BusinessClass().findTheCheapest(type).toString());
    }
}
