/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;


import factorymethod.factory.Weapon;
import factorymethod.factory.WeaponSmith;
import factorymethod.factory.WeaponSmith.WeaponType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeppe
 */
public class Game {
    public void start(){
        List<Weapon> weapons = new ArrayList();
        List<Player> players = new ArrayList();
        
        WeaponSmith smith = new WeaponSmith();
        
        // Creates all weapons
        Weapon staff = smith.create(WeaponType.staff, 45.3, 0); 
        // Weapon sword = new Sword(0, 0); // BAD!
        Weapon sword = smith.create(WeaponType.sword, 0, 67.5);
        Weapon mace = smith.create(WeaponType.mace, 24, 67.5);
        weapons.add(staff);
        weapons.add(sword);
        weapons.add(mace);
        
        
        // Create players
        Player barbarian = new Player("Conan", 4355, sword, 5, 145);
        Player wizard = new Player("Merlin", 535, staff, 45, 24);
        Player assasin = new Player("Leon", 1225, mace, 75, 65);
        
        barbarian.damage(assasin.getWeapon());
        
        assasin.damage(barbarian.getWeapon());
        
        
    }
}
