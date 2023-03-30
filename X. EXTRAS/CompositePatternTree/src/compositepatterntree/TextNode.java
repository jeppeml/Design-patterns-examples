/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import compositepatterntree.GraphicNode;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author Jeppe
 */
public class TextNode extends GraphicNode{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public TextNode(String str, GraphicsContext gc, int x, int y, GraphicNode... children) {
        super(gc, x, y, children);
        this.str = str;
    }

    public TextNode(String str, GraphicsContext gc, int x, int y) {
        super(gc, x, y);
        this.str = str;
    }

    public TextNode(String str, GraphicsContext gc, GraphicNode... children) {
        super(gc, children);
        this.str = str;
    }

    public TextNode(String str, GraphicsContext gc) {
        super(gc);
        this.str = str;
    }

  
    @Override
    public void drawNodes() {
        if (!str.isEmpty())
            graphicContext.fillText(str, super.getX(), super.getY());
        
        super.drawChildren();
    }
    
}    

