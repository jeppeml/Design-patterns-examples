/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.*;
import BLL.Customer;

/**
 *
 * @author Jeppe
 */
public class BankTellerGUI {

    private Customer currentCustomer;

    public BankTellerGUI() {
        loadCustomers();
        System.out.println("Customer credit rating: " + getCreditRating());
        if (getCreditRating()>160000)
            System.out.println("Customer credit rating is excellent");
    }

    private double getCreditRating() {
        // Calculate credit rating
        double cr = 0;
        for (BankAccount ba : currentCustomer.getBankAccount()) {
            cr += ba.getBalance();
        }

        for (Stock st : currentCustomer.getStocks()) {
            cr += st.getAmount() * st.getCurrentValue();
        }

        for (RealEstate re : currentCustomer.getRealEstate()) {
            cr += re.getValue() - re.getDebt();
        }

        return cr;
    }

    private void loadCustomers() {
        currentCustomer = createMockupCustomer();
    }

    private Customer createMockupCustomer() {
        Customer cust = new Customer();
        BankAccount ba = new BankAccount(5442);
        RealEstate re = new RealEstate(1745000, 584000);
        Stock st = new Stock(47, 784);

        cust.getBankAccount().add(ba);
        cust.getRealEstate().add(re);
        cust.getStocks().add(st);
        return cust;
    }

}
