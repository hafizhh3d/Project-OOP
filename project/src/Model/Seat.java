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
public enum Seat 
{
    F(60, "First"), B(50, "Business"), E(45, "Economy");
    
    private int allowWeight;
    private String seatClass;
    
    private Seat(int allowWeight, String seatClass)
    {
        this.allowWeight = allowWeight;
        this.seatClass = seatClass;
    }
    
    public int getAllowWeight()
    {
        return allowWeight;
    }
    
    public String getSeatClass()
    {
        return seatClass;
    }
}
