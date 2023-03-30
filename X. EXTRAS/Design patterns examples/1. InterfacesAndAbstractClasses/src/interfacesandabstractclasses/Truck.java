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
public class Truck {
    private int availableStorageSpace;
    private int availableStorageWeight;
    private String name;

    public Truck(int availableStorageSpace, int availableStorageWeight, String name) {
        this.availableStorageSpace = availableStorageSpace;
        this.availableStorageWeight = availableStorageWeight;
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

    public int getAvailableStorageSpace() {
        return availableStorageSpace;
    }

    public int getAvailableStorageWeight() {
        return availableStorageWeight;
    }
    
    public boolean loadTruck(TruckSizeable truckSizeable)
    {
        if(truckSizeable.getSpace()<availableStorageSpace && 
                truckSizeable.getWeight()<availableStorageWeight) // There is enough space and carry
        {
            availableStorageSpace-=truckSizeable.getSpace();
            availableStorageWeight-=truckSizeable.getWeight();
            return true;
        }
        return false;
       
    }
    
} 