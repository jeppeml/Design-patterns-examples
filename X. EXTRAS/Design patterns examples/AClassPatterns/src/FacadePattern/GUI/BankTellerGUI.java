/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern.GUI;


import FacadePattern.BE.Customer;
import FacadePattern.BLL.CustomerManagerFacade;

/**
 *
 * @author jeppjleemoritzled
 */
public class BankTellerGUI {

    public BankTellerGUI() {
        CustomerManagerFacade cm = CustomerManagerFacade.getInstance();
        
        System.out.println("Current customer credit rating: " + cm.getCreditRating(0));
    }
    
    
    
}
