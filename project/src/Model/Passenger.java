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

public class Passenger extends Person
{
    protected Destination dest;
    protected ArrayList<Baggage> baggList;
    protected final int CHARGE = 30;
    
    public Passenger()
    {
        this.dest = new Destination();
        this.firstName = "";
        this.lastName = "";
        this.baggList = new ArrayList<>();
    }
    
    public Passenger(String fn, String ln, Destination dest)
    {
        this.dest = dest;
        this.firstName = fn;
        this.lastName = ln;
        this.baggList = new ArrayList<>();
    }
    
    public void checkIn(Baggage bagg)
    {
        baggList.add(bagg);
    }
}