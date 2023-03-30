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
public class ImgNode extends GraphicNode{
    private Image img;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public ImgNode(Image img, GraphicsContext gc) {
        super(gc);
        this.img = img;
    }

    public ImgNode(Image img, GraphicsContext gc, GraphicNode... children) {
        super(gc, children);
        this.img = img;
    }
    
    public ImgNode(Image img, GraphicsContext gc, int x, int y) {
        super(gc, x, y);
        this.img = img;
    }

    public ImgNode(Image img, GraphicsContext gc, int x, int y, GraphicNode... children) {
        super(gc, x, y, children);
        this.img = img;
    }
    
    @Override
    public void drawNodes() {
        if (img != null)
            graphicContext.drawImage(img, super.getX(), super.getY());
        
        
        super.drawChildren();
    }
    
}
