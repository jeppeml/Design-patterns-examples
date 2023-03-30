/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesandabstractclasses;

/**
 *
 * @author Jeppe
 */
public abstract class Cargo implements TruckSizeable {
    int weight;
    private String name;

    public Cargo(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }
 
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
