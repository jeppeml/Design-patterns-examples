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
public class DecoratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Weapon gun = new AK47Weapon();
        Weapon decoratedGun = new Silencer(gun);
        Weapon decoratedGun2 = new Scope(decoratedGun);
        
        decoratedGun2.Attack();
    }
    
}
