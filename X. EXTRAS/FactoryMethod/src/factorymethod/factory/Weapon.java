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
public abstract class Weapon {
    protected double magicDmg;
    protected double physicalDmg;

    public Weapon(double magicDmg, double physicalDmg) {
        this.magicDmg = magicDmg;
        this.physicalDmg = physicalDmg;
    }
    
    public abstract double getMagicDmg();
    public abstract double getPhysDmg();
}
