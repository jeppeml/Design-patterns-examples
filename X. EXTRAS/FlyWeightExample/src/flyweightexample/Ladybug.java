/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightexample;

import javafx.scene.image.Image;

/**
 *
 * @author Jeppe
 */
public class Ladybug {
    private Image img;
    private int size;

    public Ladybug() {
    }

    public Ladybug(Image img, int size) {
        this.img = img;
        this.size = size;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
