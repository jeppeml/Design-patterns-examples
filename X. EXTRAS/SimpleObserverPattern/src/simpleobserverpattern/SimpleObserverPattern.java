/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobserverpattern;

/**
 *
 * @author Jeppe
 */
public class SimpleObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        Car car = new Car();
        car.addObserver(p);
        car.addObserver(p2);
        
        car.doSomethingImportant();
    }
    
}
