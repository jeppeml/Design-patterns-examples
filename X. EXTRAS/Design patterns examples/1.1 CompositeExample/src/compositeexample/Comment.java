/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeppe
 */
public class Comment {
    List<Comment> childComments = new ArrayList<>();
    String comment;

    public Comment(String comment) {
        this.comment = comment;
    }

    public void addChildComment(Comment c)
    {
        childComments.add(c);
    }
    public void removeChildComment(Comment c)
    {
        childComments.remove(c);
    }

    @Override
    public String toString() {
        return toString(0);
    }
    
    public String toString(int level) {
        String lvl="";
        for (int i = 0; i < level; i++) lvl+="-->";
        
        String returnString = "\n-->";
        returnString += lvl + comment;
        for(Comment c: childComments)
            returnString +=  c.toString(level+1);
        return returnString;
    }
    
}
