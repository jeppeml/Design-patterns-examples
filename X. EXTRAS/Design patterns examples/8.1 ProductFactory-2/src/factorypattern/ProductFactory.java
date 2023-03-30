/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author lbilde
 */
public class ProductFactory{
    
    public Product createEntity(String type){
        switch(type){
            case "Bike": return new Bike();
            case "Computer": return new Computer();
            default: return null;
        }  
    } 
}
