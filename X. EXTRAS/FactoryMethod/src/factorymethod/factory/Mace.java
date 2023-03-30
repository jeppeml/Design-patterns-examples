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
public class Mace extends Weapon{

    protected Mace(double magicDmg, double physicalDmg) {
        super(magicDmg, physicalDmg);
    }

    @Override
    public double getMagicDmg() {
        return magicDmg*0.25;
    }

    @Override
    public double getPhysDmg() {
        return physicalDmg*0.85;
    }
    
}
