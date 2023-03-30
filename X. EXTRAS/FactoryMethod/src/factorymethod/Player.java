/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.factory.Weapon;

/**
 *
 * @author Jeppe
 */
public class Player {
    private String name;
    private double hp;
    private Weapon weapon;
    private double magicShield;
    private double shield;

    public Player(String name, double hp, Weapon weapon, double magicShield, double shield) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.magicShield = magicShield;
        this.shield = shield;
    }
    
    public void damage(Weapon w){
        double physDmg = w.getPhysDmg() - shield;
        double magDmg = w.getMagicDmg() - magicShield;
        System.out.println(name + " is attacked with " + w);
        if(physDmg>0){
            hp = hp - physDmg;
            System.out.println(name + " has " + shield + " shield "
                    + "and was attacked for " + w.getPhysDmg() + " dealing " + physDmg);
        }
        
        if(magDmg>0){
            hp -= magDmg;
            System.out.println(name + " has " + magicShield + " magic shield "
                    + "and was attacked for " + w.getMagicDmg() + " dealing " + magDmg);
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getMagicShield() {
        return magicShield;
    }

    public void setMagicShield(double magicShield) {
        this.magicShield = magicShield;
    }

    public double getShield() {
        return shield;
    }

    public void setShield(double shield) {
        this.shield = shield;
    }
    
    
}
