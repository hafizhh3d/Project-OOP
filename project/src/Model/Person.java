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
public class Person
{
    protected String firstName;
    protected String lastName;
    
    public Person()
    {
        this.firstName = "";
        this.lastName = "";
    }
    
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    @Override
    public String toString()
    {
        String s;
        
        s = firstName + " " + lastName;
        
        return s;
    }
}