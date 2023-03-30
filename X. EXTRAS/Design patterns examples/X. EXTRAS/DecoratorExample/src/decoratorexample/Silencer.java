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
public class Silencer extends WeaponAccessory {
    
    public Silencer(Weapon weaponToDecorate) {
        super(weaponToDecorate);
    }
    
    @Override
    public void Attack()
    {
        super.Attack();
        System.out.print(" with silencer...");
    }
    
}
