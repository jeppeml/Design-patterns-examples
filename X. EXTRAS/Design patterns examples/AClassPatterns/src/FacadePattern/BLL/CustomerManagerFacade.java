/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.BLL;

import FacadePattern.BE.BankAccount;
import FacadePattern.BE.Customer;
import FacadePattern.BE.RealEstate;
import FacadePattern.BE.Stock;
import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
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
    
    private  CustomerManagerFacade() {
        customers = new ArrayList<>();
        loadCustomers();
    }
    
    public double getCreditRating(int customerId)
    {
        return getCreditRating(getCustomer(customerId));
    }
    
    private double getCreditRating(Customer c)
    {
        double cr = 0;
        
        for(BankAccount ba : c.getAccounts())
            cr += ba.getBalance();
        
        for(Stock st : c.getStocks())
            cr += st.getAmount() * st.getCurrentValue();
        
        for (RealEstate re : c.getRealEstates())
            cr += re.getValue()-re.getDebt();
        
        if (cr<0)
            return 0;

        return cr * 0.8;
    }
    
    private void loadCustomers()
    {
        customers.add(createMockUpCustomer());
    }
    
    private Customer createMockUpCustomer()
    {
        Customer cust = new Customer();
        BankAccount ba = new BankAccount(34225.34);
        RealEstate ra = new RealEstate(1700000, 850000);
        RealEstate ra2 = new RealEstate(650000, 890000);
        Stock st = new Stock(23, 15);
        
        cust.getAccounts().add(ba);
        cust.getRealEstates().add(ra);
        cust.getRealEstates().add(ra2);
        cust.getStocks().add(st);
        return cust;
    }
    private Customer getCustomer(int customerId) {
        return customers.get(customerId * 0);
    }
}
