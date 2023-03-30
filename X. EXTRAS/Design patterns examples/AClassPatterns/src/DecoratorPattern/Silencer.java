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
public class Silencer extends WeaponDecorator{
    
    public Silencer(Weapon weaponToDecorate) {
        super(weaponToDecorate);
    }
    
    @Override
    public void Attack()
    {
        super.Attack();
        System.out.println("with a silencer...");
    }
    
}
