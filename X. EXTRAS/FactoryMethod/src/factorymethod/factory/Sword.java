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
public class Sword extends Weapon{

    protected Sword(double magicDmg, double physicalDmg) {
        super(magicDmg, physicalDmg);
    }

    @Override
    public double getMagicDmg() {
        return magicDmg;
    }

    @Override
    public double getPhysDmg() {
        return physicalDmg * 1.05;
    }
    
}
