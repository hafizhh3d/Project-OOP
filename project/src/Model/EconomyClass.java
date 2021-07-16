/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hafizh Herti
 */
public class EconomyClass extends Passenger
{
    protected final int allowedWeight = 50;
    protected String seat = "Economy";
    protected double totWeight = 0.00;
    protected double excWeight;
    protected double totCharge;
    
    public EconomyClass()
    {
        this.totWeight = 0.00;
        this.excWeight = 0.00;
        this.totCharge = 0.00;
    }
    
    public EconomyClass(String fn, String ln, Destination dest)
    {
        super(fn, ln, dest);
    }
    
    public double calcTotalWeight()
    {
        totWeight = 0.00;
        
        for(int i = 0; i < baggList.size(); i++)
        {
            totWeight += baggList.get(i).getWeight();
        }
        
        return totWeight;
    }
    
    public double calcExcessWeight()
    {
        excWeight = totWeight - allowedWeight;
        if(excWeight<0)
        {
            excWeight = 0.00;
        }
        
        return excWeight;
    }
    
    public double calcTotalCharge()
    {
        totCharge = excWeight * CHARGE;
        
        return totCharge;
    }
    
    @Override
    public String toString()
    {
        String s;
        
        s = "Name: " + this.firstName + " " + this.lastName + "\n";
        s += "Destination: " + dest.toString() + "\n";
        s += "Seat: " + this.seat + "\n";
        s += "Number of baggage: " + baggList.size() + "\n";
        for(int i = 0; i < this.baggList.size(); i++)
        {
            s += "\tBag " + (i+1) + " : " + this.baggList.get(i).getWeight() + " kg\n";
        }
        
        s += "Total Weight: " + this.calcTotalWeight() + " kg" + "\n";
        s += "Total excess weight: " + this.calcExcessWeight() + " kg" + "\n";
        s += "Total charge: RM " + this.calcTotalCharge() + "\n";
        
        return s;
    }
}
