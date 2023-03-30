/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.BE;

/**
 *
 * @author jeppjleemoritzled
 */
public class Stock {
    private int amount;
    private double currentValue;

    public Stock(int amount, double currentValue) {
        this.amount = amount;
        this.currentValue = currentValue;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
    
    
}
