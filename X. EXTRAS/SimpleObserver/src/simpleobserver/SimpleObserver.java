/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobserver;

/**
 *
 * @author Jeppe
 */
public class SimpleObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person jeppe = new Person();
        Car ford = new Car();
        
        ford.addObserver(jeppe);
       
        ford.doSomething();
    }
    
}
