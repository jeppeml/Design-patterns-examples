/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

/**
 *
 * @author Jeppe
 */
public class CompositeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comment c1 = new Comment("Hi welcome to discussion about cars");
        Comment cNew = new Comment("New cars");
        Comment cUsed = new Comment("Used cars");
        Comment cRepairs = new Comment("Repairs on cars");
        
        Comment cUsedProblem1 = new Comment(
                "Just bought a used car, now it broke down, how to fix?");
        Comment cUsedProblemAnswer1 = new Comment(
                "Just buy a new one LOL");
        Comment cUsedProblemAnswer2 = new Comment(
                "Hit it with an Axe of Repairing and finish with Bow of Speed");
        
        Comment cUsedProblem2 = new Comment(
                "My car burst into flames, now what?");
        Comment cUsedProblem3 = new Comment(
                "Buy cheap pills, everything you need, <a href=\"OnlinePharmacyTrusted.scambait.as/ripoff\"> click here </a>");
        
        c1.addChildComment(cNew);
        c1.addChildComment(cUsed);
        c1.addChildComment(cRepairs);
        cUsed.addChildComment(cUsedProblem1);
        cUsedProblem1.addChildComment(cUsedProblemAnswer1);
        cUsedProblem1.addChildComment(cUsedProblemAnswer2);
        
        cUsed.addChildComment(cUsedProblem2);
        cUsed.addChildComment(cUsedProblem3);
        System.out.println(c1.toString());
        
        
        
    }
    
}
