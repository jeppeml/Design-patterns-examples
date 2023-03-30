/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Jeppe
 */
public abstract class GraphicNode {
    List<GraphicNode> children = new ArrayList();
    GraphicsContext graphicContext;
    private int x,y;

    public GraphicNode(GraphicsContext gc) {
        graphicContext = gc;
        this.x = 0;
        this.y = 0;
    }
    
    public GraphicNode(GraphicsContext gc, int x, int y) {
        this(gc);
        this.x = x;
        this.y = y;
    }

    public GraphicNode(GraphicsContext gc, GraphicNode... children) {
        this(gc);
        this.children = new ArrayList<>(Arrays.asList(children));
    }
    
    public GraphicNode(GraphicsContext gc, int x, int y, GraphicNode... children) {
        this(gc,x,y);
        this.children = new ArrayList<>(Arrays.asList(children));
    }
    
    public abstract void drawNodes();
    
    private void recalculateChildrenXY()
    {
        for (int i = 0; i < children.size(); i++) {
            GraphicNode currentChild = children.get(i);
            currentChild.setY(this.getY()+30);
            
            int xSpace = this.getX() - 100;
            if (children.size()>1)
               xSpace += (200/(children.size()-1))*i ;
            
            currentChild.setX(xSpace);
        }
    }
    
    public void addChild(GraphicNode... child)
    {
        children.addAll(Arrays.asList(child));
        recalculateChildrenXY();
    }

    public boolean removeChild(GraphicNode child)
    {
        boolean ret = children.remove(child);
        recalculateChildrenXY();
        return ret;
    }
    
    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    private void setY(int y) {
        this.y = y;
    }

    
    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    private void setX(int x) {
        this.x = x;
    }
    
    protected void drawChildren() {
        for (GraphicNode graphicNode : children) {
            graphicContext.strokeLine(this.getX(), this.getY(), graphicNode.getX(), graphicNode.getY());;
            graphicNode.drawNodes();
        }
    }

}
