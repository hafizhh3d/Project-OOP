/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassengerApp;

import java.util.ArrayList;
import Model.Passenger;
import Model.Destination;
import Model.Baggage;
import java.util.Scanner;


/**
 *
 * @author Hafizh Herti
 */
public class PassengerApp 
{
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

    public static void main(String[] args)
    {
        ArrayList<Passenger> passengerList = new ArrayList<>();
        
        Passenger p;
        Destination d;
        Baggage b;
        
        String fn, ln, ci, co, s;
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
                    
                    d = new Destination(ci, co);
                    p = new Passenger(fn, ln, s, d);
                    
                    System.out.print("Number of baggage: "); num = in.nextInt();
                    for(int i = 0; i < num; i++)
                    {
                        System.out.print("\tBag " + (i+1) + " (in kg): "); w = in.nextDouble();
                        b = new Baggage(w);
                        p.checkIn(b);
                    }
                   
                    passengerList.add(p);
                    
                    break;
                case 2:
                    System.out.println("\n+++++ List of Passengers +++++");
                    
                    for(int i = 0; i < passengerList.size(); i++)
                    {
                        System.out.println("\nPassenger #" + (i+1));
                        passengerList.get(i).display();
                    }
                    
                    System.out.println("\n");
                    break; 
            }
        } while(choice != 3);
        
        System.out.println("Thank you for using this system :)");
    }
}
