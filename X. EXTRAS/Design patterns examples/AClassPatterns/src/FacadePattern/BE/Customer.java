/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.BE;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class Customer {

    private ArrayList<Stock> stocks;
    private ArrayList<RealEstate> realEstates;
    private ArrayList<BankAccount> accounts;

    public Customer() {
        stocks = new ArrayList<>();
        realEstates = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(ArrayList<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    

}
