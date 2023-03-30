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
public class Computer extends Product{
    public Computer() {
        setName("MacBook Pro");
        setPrice(15699.0);
    }
    public Computer(int id, String name, double price)      
    {
        super(id,name,price);
    }
    
}
