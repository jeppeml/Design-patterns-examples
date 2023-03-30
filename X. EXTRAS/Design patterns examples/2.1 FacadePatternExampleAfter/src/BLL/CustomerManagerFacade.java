/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Customer;
import BE.BankAccount;
import BE.RealEstate;
import BE.Stock;
import java.util.ArrayList;

/**
 *
 * @author Jeppe
 */
public class CustomerManagerFacade {

    private ArrayList<Customer> customers;
    private static CustomerManagerFacade instance;
    
    public static CustomerManagerFacade getInstance()
    {
        if(instance==null)
            instance = new CustomerManagerFacade();
        return instance;
    }
    
    private CustomerManagerFacade() {
        customers = new ArrayList<>();
    }

    public double getCreditRating(int CustomerId) {
        return getCreditRating(getCustomer(CustomerId));
    }

    public void loadCustomers() {
        customers.add(createMockupCustomer());
    }

    private Customer getCustomer(int CustomerId) {
        // Mockup
        return customers.get(CustomerId * 0);
    }

    private double getCreditRating(Customer c) {
        // Calculate credit rating
        double cr = 0;
        for (BankAccount ba : c.getBankAccount()) {
            cr += ba.getBalance();
        }

        for (Stock st : c.getStocks()) {
            cr += st.getAmount() * st.getCurrentValue();
        }

        for (RealEstate re : c.getRealEstate()) {
            cr += re.getValue() - re.getDebt();
        }

        return cr;
    }

    private Customer createMockupCustomer() {
        // CALL DAL!!!!
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
