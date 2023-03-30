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
public class WeaponDecorator implements Weapon{
    private Weapon weaponToDecorate;

    public WeaponDecorator(Weapon weaponToDecorate) {
        this.weaponToDecorate = weaponToDecorate;
    }
    
    @Override
    public void Attack() {
        weaponToDecorate.Attack();
    }
    
}
