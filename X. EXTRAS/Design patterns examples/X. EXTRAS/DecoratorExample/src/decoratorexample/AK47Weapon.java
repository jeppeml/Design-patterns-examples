/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorexample;

/**
 *
 * @author Jeppe
 */
public class AK47Weapon implements Weapon{

    @Override
    public void Attack() {
        System.out.print("Attacking with AK47");
    }
    
}
