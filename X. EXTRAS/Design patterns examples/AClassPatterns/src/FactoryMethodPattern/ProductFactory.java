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
public class ProductFactory
{
    public enum ProductType
    {
        SPACESHIP,
        COMPUTER,
        HORSE;
    }

    private static int nextid = 0;

    public static Product createProduct(String name, double price, ProductType type)
    {
        switch(type)
        {
            case SPACESHIP: return new Spaceship(nextid++, name, price);
            case COMPUTER: return new Computer(nextid++, name, price);
            case HORSE: return new Computer(nextid++, name, price);
            default: return null;
        }
    }
    
}
