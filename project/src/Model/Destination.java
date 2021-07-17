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
public class Destination 
{
    private String city;
    private String country;
    
    public Destination()
    {
        this.city = "";
        this.country = "";
    }
    
    public Destination(String city, String country)
    {
        this.city = city;
        this.country = country;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    @Override
    public String toString()
    {
        String s;
        
        s = country + ", " + city;
        
        return s;
    }  
}
