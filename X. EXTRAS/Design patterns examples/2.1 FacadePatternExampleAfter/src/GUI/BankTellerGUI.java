/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Customer;
import BLL.CustomerManagerFacade;

/**
 *
 * @author Jeppe
 */
public class BankTellerGUI {

    private Customer currentCustomer;
    
    public BankTellerGUI() {
        CustomerManagerFacade cm = CustomerManagerFacade.getInstance();
        cm.loadCustomers();
        System.out.println("Customer credit rating: " + cm.getCreditRating(345));
        if (cm.getCreditRating(345)>160000)
            System.out.println("Customer credit rating is excellent");
    }

}
