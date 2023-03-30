/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import BE.BankAccount;
import BE.RealEstate;
import BE.Stock;
import java.util.ArrayList;

/**
 *
 * @author Jeppe
 */
public class Customer {
    private ArrayList<Stock> stocks;
    private ArrayList<RealEstate> realEstate;
    private ArrayList<BankAccount> bankAccount;

    public Customer() {
        stocks = new ArrayList<>();
        realEstate = new ArrayList<>();
        bankAccount = new ArrayList<>();
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<RealEstate> getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(ArrayList<RealEstate> realEstate) {
        this.realEstate = realEstate;
    }

    public ArrayList<BankAccount> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(ArrayList<BankAccount> bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    
    
}
