/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Hafizh Herti
 */
public class Passenger 
{
    private Seat seat;
    private Name name;
    private Destination dest;
    private ArrayList<Baggage> baggList;
    private final int CHARGE = 30;
    
    public Passenger(String fn, String ln, String s, Destination dest)
    {
        this.dest = dest;
        name = new Name(fn, ln);
        seat = Seat.valueOf(s);
        baggList = new ArrayList<>();
    }
    
    public void checkIn(Baggage bagg)
    {
        baggList.add(bagg);
    }
    
    public void display()
    {
        double totWeight = 0.00;
        double excWeight;
        double charge;
        
        System.out.println("Name: " + name.toString());
        System.out.println("Destination: " +dest.toString());
        System.out.println("Seat: " + seat.getSeatClass());
        System.out.println("Number of baggage: " + baggList.size());
        for(int i = 0; i < baggList.size(); i++)
        {
            System.out.print("\n\tBag " + (i+1) + " : " +baggList.get(i).getWeight() + " kg\n");
            totWeight += baggList.get(i).getWeight();
        }
        
        excWeight = totWeight - seat.getAllowWeight();
        if(excWeight<0)
        {
            excWeight = 0.00;
        }
        
        charge = excWeight * 30;
        
        System.out.println("Total Weight: " + totWeight + " kg");
        System.out.println("Total excess weight: " + excWeight + " kg");
        System.out.println("Total charge: RM " + charge);
    }
}
