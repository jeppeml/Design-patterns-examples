/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class AK47Weapon implements Weapon{

    @Override
    public void Attack() {
        System.out.println("Ratatatatataaa! AK47 shooting");
    }
    
}
