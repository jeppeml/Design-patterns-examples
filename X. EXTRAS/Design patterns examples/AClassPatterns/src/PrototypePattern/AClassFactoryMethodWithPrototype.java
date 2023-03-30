/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class AClassFactoryMethodWithPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.nanoTime();
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 1500; i++) {
            ProductFactory.createProduct("Millinium Falcon 1.1", 235234, ProductFactory.ProductType.COMPUTER);
            //products.add(ProductFactory.createProduct("Millinium Falcon 1.1", 235234, ProductFactory.ProductType.COMPUTER));
            //products.add(ProductFactory.createProduct("Millinium Falcon 2.0", 325232, ProductFactory.ProductType.SPACESHIP));
        }
        long end = System.nanoTime();
        
        System.out.println("Elapsed : " + ((double)(end-start)/1000000000) + " secs");
        /*ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            products.add(ProductFactory.createProduct("Millinium Falcon 1.1", 235234, ProductFactory.ProductType.COMPUTER));
            products.add(ProductFactory.createProduct("Millinium Falcon 2.0", 325232, ProductFactory.ProductType.SPACESHIP));
        }
        

        for (Product p : products) {
            System.out.println("Product: " + p.getId() + " " + p.getName() + " " + p.getPrice());
        }*/
    }

}
