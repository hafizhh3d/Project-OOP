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
public class Name 
{
    private String firstName;
    private String lastName;
    
    public Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String toString()
    {
        String s;
        
        s = firstName + " " + lastName;
        
        return s;
    }
}
