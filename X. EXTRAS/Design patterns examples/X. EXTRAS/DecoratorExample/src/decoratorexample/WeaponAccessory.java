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
public class WeaponAccessory implements Weapon{
    private Weapon weaponToDecorate;
    public WeaponAccessory(Weapon weaponToDecorate) {
        this.weaponToDecorate = weaponToDecorate;
    }
    
    @Override
    public void Attack() {
        weaponToDecorate.Attack();
    }
    
}
