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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        
        Product bike = factory.createEntity("Bike");
        Product bike2 = factory.createEntity("Bike");
        Product bike3 = factory.createEntity("Bike");
        Product computer = factory.createEntity("Computer");
        
        System.out.println("bike1: " + bike.getName() + " price: " + bike.getPrice());
        System.out.println("bike2: " + bike2.getName() + " price: " + bike2.getPrice());
        System.out.println("bike3: " + bike3.getName() + " price: " + bike3.getPrice());
        System.out.println("computer: " + computer.getName() + " price: " + computer.getPrice());
        
    }
    
}
