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
public class Staff extends Weapon{

    protected Staff(double magicDmg) {
        super(magicDmg, 0);
    }
    
    public Staff(double magicDmg, double physicalDmg) {
        super(magicDmg, physicalDmg);
    }

    @Override
    public double getMagicDmg() {
        return magicDmg;
    }

    @Override
    public double getPhysDmg() {
        return physicalDmg;
    }
    
}
