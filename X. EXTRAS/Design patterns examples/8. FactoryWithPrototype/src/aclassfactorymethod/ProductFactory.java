/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclassfactorymethod;

import java.util.Hashtable;

/**
 *
 * @author jeppjleemoritzled
 */
public class ProductFactory {

    private static Hashtable<String, Product> cache = new Hashtable<String, Product>();

    public enum ProductType {
        SPACESHIP,
        COMPUTER,
    }

    private static int nextid = 0;

    public static Product getProduct(String productTypeId) {
        if (cache.isEmpty()) {
            loadCache();
        }

        Product cachedProduct = cache.get(productTypeId);
        return (Product) cachedProduct.clone();
    }

    public static void loadCache() {
        Computer computer = new Computer();
        computer.setTypeId(ProductType.COMPUTER.name());
        cache.put(computer.getTypeId(), computer);

        Spaceship spaceship = new Spaceship();
        spaceship.setTypeId(ProductType.SPACESHIP.name());
        cache.put(spaceship.getTypeId(), spaceship);
    }

    public static Product createProduct(String name, double price, ProductType type) {
        switch (type) {
            case SPACESHIP:
                Spaceship spaceship = (Spaceship) getProduct(type.name());
                spaceship.setId(nextid++);
                spaceship.setName(name);
                spaceship.setPrice(price);
                return spaceship;
            case COMPUTER:
                Computer cpu = (Computer) getProduct(type.name());
                cpu.setId(nextid++);
                cpu.setName(name);
                cpu.setPrice(price);
                return cpu;
            default:
                return null;
        }
    }

}
