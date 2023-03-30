/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class RobotArmy implements IContainer{
    private Robot[] robots;
    
    @Override
    public IIterator getIterator() {
        return new RobotIteratorCollection();
    }

    public RobotArmy(Robot... r) {
        robots = r;
    }
    
    private class RobotIteratorCollection implements IIterator{
        int iteratorIndex = 0;
        
        @Override
        public boolean hasNext() {
            return iteratorIndex<robots.length;
        }

        @Override
        public Object next() {
            if(this.hasNext())
                return robots[iteratorIndex++];
            
            return null;
        }
        
    }
            
    
}
