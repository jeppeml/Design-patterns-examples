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
public class Bag extends Cargo {
    private int crossMeasure;

    public Bag(int crossMeasure, int weight, String name) {
        super(weight, name);
        this.crossMeasure = crossMeasure;
    }
    
    public int getCrossMeasure() {
        return crossMeasure;
    }

    public void setCrossMeasure(int crossMeasure) {
        this.crossMeasure = crossMeasure;
    }

    @Override
    public int getSpace() {
        return (int) Math.pow(crossMeasure * (1/Math.sqrt(2)),3);
    }
}
