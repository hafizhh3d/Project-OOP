/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassengerApp;

import java.util.ArrayList;
import Model.Destination;
import Model.Baggage;
import Model.BusinessClass;
import Model.EconomyClass;
import Model.FirstClass;
import java.util.Scanner;


/**
 *
 * @author Hafizh Herti
 */
public class PassengerApp 
{
    static ArrayList<FirstClass> firstPassengerList = new ArrayList<>(); // Comment this line if You are going to use IDE Output
    static ArrayList<BusinessClass> businessPassengerList = new ArrayList<>(); // Comment this line if You are going to use IDE Output
    static ArrayList<EconomyClass> economyPassengerList = new ArrayList<>(); // Comment this line if You are going to use IDE Output
    
    // Comment this function if You are going to use IDE Output
    public static void main(String[] args)
    {
        UI ui = new UI();
        ui.setVisible(true);
    }
    
    /*
    // Comment this function if You are going to use User Interface Output
    public static void displayMenu() 
    {
        System.out.println("------------------------------------------");
        System.out.println("\tCheck-In Baggage System");
        System.out.println("------------------------------------------");
        System.out.println("[1] Add Passenger");
        System.out.println("[2] Display Passengers");
        System.out.println("[3] Exit");
        System.out.print("Your choice: ");
    }

    // Comment this function if You are going to use User Interface Output
    public static void main(String[] args)
    {
        ArrayList<FirstClass> firstPassengerList = new ArrayList<>();
        ArrayList<BusinessClass> businessPassengerList = new ArrayList<>();
        ArrayList<EconomyClass> economyPassengerList = new ArrayList<>();
        
        FirstClass fc;
        BusinessClass bc;
        EconomyClass ec;
        Destination d;
        Baggage b;
        
        String fn, ln, ci, co, s, o;
        int num;
        double w;
        
        Scanner in = new Scanner(System.in);
        
        int choice = 0;
        
        do
        {
            displayMenu();
            choice = in.nextInt();
            in.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\n+++++ Add Passenger +++++");
                    
                    System.out.print("\nFirst name: "); fn = in.nextLine();
                    System.out.print("Last name: "); ln = in.nextLine();
                    
                    System.out.print("Destination: ");
                    System.out.print("\n\tCity: "); ci = in.nextLine();
                    System.out.print("\tCountry: "); co = in.nextLine();                
                    
                    System.out.print("Seat [F-First, B-Business, E-Economy]: "); s = in.nextLine();
                    
                    switch(s)
                    {
                        case "F":
                            d = new Destination(ci, co);
                            fc = new FirstClass(fn, ln, d);
                            
                            System.out.print("Number of baggage: "); num = in.nextInt();
                            for(int i = 0; i < num; i++)
                            {
                                System.out.print("\tBag " + (i+1) + " (in kg): "); w = in.nextDouble();
                                b = new Baggage(w);
                                fc.checkIn(b);
                            }
                            
                            firstPassengerList.add(fc);
                            break;
                        case "B":
                            d = new Destination(ci, co);
                            bc = new BusinessClass(fn, ln, d);
                            
                            System.out.print("Number of baggage: "); num = in.nextInt();
                            for(int i = 0; i < num; i++)
                            {
                                System.out.print("\tBag " + (i+1) + " (in kg): "); w = in.nextDouble();
                                b = new Baggage(w);
                                bc.checkIn(b);
                            }
                            
                            businessPassengerList.add(bc);
                            break;
                        case "E":
                            d = new Destination(ci, co);
                            ec = new EconomyClass(fn, ln, d);
                            
                            System.out.print("Number of baggage: "); num = in.nextInt();
                            for(int i = 0; i < num; i++)
                            {
                                System.out.print("\tBag " + (i+1) + " (in kg): "); w = in.nextDouble();
                                b = new Baggage(w);
                                ec.checkIn(b);
                            }
                            
                            economyPassengerList.add(ec);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n+++++ List of Passengers +++++");
                    
                    System.out.print("\nType of Passenger to Display [F-First, B-Business, E-Economy]: "); s = in.nextLine();
                    
                    switch(s)
                    {
                        case "F":
                            System.out.println("\n+-+-+ List of Passengers +-+-+");
                            
                            for(int i = 0; i < firstPassengerList.size(); i++)
                            {
                                System.out.println("\nPassenger #" + (i+1));
                                o = firstPassengerList.get(i).toString();
                                System.out.println(o);
                            }
                            break;
                        case "B":
                            System.out.println("\n+-+-+ List of Passengers +-+-+");
                            
                            for(int i = 0; i < businessPassengerList.size(); i++)
                            {
                                System.out.println("\nPassenger #" + (i+1));
                                o = businessPassengerList.get(i).toString();
                                System.out.println(o);
                            }
                            break;
                        case "E":
                            System.out.println("\n+-+-+ List of Passengers +-+-+");
                            
                            for(int i = 0; i < economyPassengerList.size(); i++)
                            {
                                System.out.println("\nPassenger #" + (i+1));
                                o = economyPassengerList.get(i).toString();
                                System.out.println(o);
                            }
                            break;
                    }
                    break;
            }
        } while(choice != 3);
        
        System.out.println("Thank you for using this system :)");
    }
    */
}
