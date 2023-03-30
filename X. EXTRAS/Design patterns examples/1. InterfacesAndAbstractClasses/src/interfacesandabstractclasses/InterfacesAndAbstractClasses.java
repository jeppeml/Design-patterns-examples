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
public class InterfacesAndAbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck smallTruck = new Truck(160_000, 4000, "Smally"); // small truck
        Truck bigTruck = new Truck(14_450_000, 8000, "Biggy"); // bigger truck
        
        CardboardBox cbUnderpants = new CardboardBox(47, 35, 25, 15, "30 pairs of Underpants");
        CardboardBox cbHowitzer = new CardboardBox(430, 340, 96, 7154, "M198 Howitzer, and 50 Mars bars"); // super big
        
        Bag bCrisps = new Bag(44, 15, "5 bags of Crisps");
        Bag bCandybars = new Bag(17, 25, "Candybars");
        
        Tube tubeBieberPoster = new Tube(50, 10, 50, "Justin Bieber poster, with lead hanger");
        Tube tubeMercury = new Tube(150, 25, 159_043, "Liquid Mercury"); // super heavy
        
        System.out.println("Loading small truck...");
        loadTruck(smallTruck, cbUnderpants);
        loadTruck(smallTruck, bCrisps);
        loadTruck(smallTruck, bCandybars);
        loadTruck(smallTruck, tubeBieberPoster);
        loadTruck(smallTruck, tubeMercury);

        loadTruck(smallTruck, tubeBieberPoster);
        loadTruck(smallTruck, tubeBieberPoster);
        loadTruck(smallTruck, tubeBieberPoster);
        
        loadTruck(smallTruck, cbUnderpants);
        loadTruck(smallTruck, cbUnderpants);
        loadTruck(smallTruck, cbUnderpants);
        
        
        
        System.out.println("");
        
        System.out.println("Loading bigger truck...");
        loadTruck(bigTruck, cbUnderpants);
        loadTruck(bigTruck, bCrisps);
        loadTruck(bigTruck, bCandybars);
        loadTruck(bigTruck, tubeBieberPoster);
        loadTruck(bigTruck, tubeMercury);
        loadTruck(bigTruck, cbHowitzer);
        loadTruck(bigTruck, cbHowitzer);
        
    }
    
    private static void loadTruck(Truck t, Cargo c)
    {
        if(t.loadTruck(c))
            System.out.println("Loaded " + c.getName() + " to "+t.getName()+" nicely");
        else
            System.out.println("Couldn't load " + c.getName() + " to "+t.getName()+". Truck has no room or must be overloaded :(");
        
       
    }
    
}
