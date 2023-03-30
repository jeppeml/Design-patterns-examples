/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jeppe
 */
public class Person implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("TEST");
        System.out.println("Obs " + o + " notified changes: " + arg);
    }
    
}
