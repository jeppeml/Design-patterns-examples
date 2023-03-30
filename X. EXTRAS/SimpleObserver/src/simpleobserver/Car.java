/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobserver;

import java.util.Observable;

/**
 *
 * @author Jeppe
 */
public class Car extends Observable{
    boolean hasDoneSomething=false;
    
    public void doSomething(){
        System.out.println("Doing stuff");
        hasDoneSomething=true;
        // This is important for observers, so lets notify them
        setChanged();
        notifyObservers(hasDoneSomething);
    }
}
