/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class Spaceship extends Product{

    public Spaceship() {
        setName("Millinium Falcon ver 2.0");
        setPrice(14000);
    }
    
    public Spaceship(int id, String name, double price)      
    {
        super(id,name,price);
    }
    
}
