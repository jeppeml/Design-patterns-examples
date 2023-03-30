/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class Product implements Cloneable {
    private int id;
    private String name;
    private double price;
    private String productIdString;

    public String getProductIdString() {
        return productIdString;
    }

    public void setProductIdString(String productIdString) {
        this.productIdString = productIdString;
    }

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Object clone()
    {
        Object clone = null;
        
        try{
            clone = super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
