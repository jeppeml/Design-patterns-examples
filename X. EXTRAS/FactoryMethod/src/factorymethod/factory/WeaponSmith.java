/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

/**
 *
 * @author Jeppe
 */
public class WeaponSmith { // This is the Factory
    public enum WeaponType{
        sword, mace, staff;
    }
    
    public Weapon create(WeaponType weaponType, double magicDmg, double physicalDmg){ // Factory Method!
        switch (weaponType) {
            case sword:
                return new Sword(magicDmg, physicalDmg);
            case mace:
                return new Mace(magicDmg, physicalDmg);
            case staff:
                return new Staff(magicDmg);
                
            default:
                throw new AssertionError();
        }
    }
}
