/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

import java.util.Hashtable;


/**
 *
 * @author jeppjleemoritzled
 */
public class ProductFactory
{
    private static Hashtable<String, Product> productCache = new Hashtable<>();
    
    private static void loadCache()
    {
        Computer c = new Computer();
        c.setProductIdString(ProductType.COMPUTER.name());
        productCache.put(c.getProductIdString(), c);
        
        Spaceship s = new Spaceship();
        s.setProductIdString(ProductType.SPACESHIP.name());
        productCache.put(c.getProductIdString(), s);
    }
    
    public enum ProductType
    {
        SPACESHIP,
        COMPUTER,
    }

    private static int nextid = 0;

    public static Product createProduct(String name, double price, ProductType type)
    {
        if(productCache.isEmpty()) loadCache();
        Product p = (Product)productCache.get(type.name()).clone();
        p.setId(nextid++);
        p.setName(name);
        p.setPrice(price);
        return p;
    }
    
}
