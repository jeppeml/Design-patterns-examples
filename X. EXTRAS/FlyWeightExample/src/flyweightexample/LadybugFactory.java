/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightexample;

import java.util.HashMap;
import javafx.scene.image.Image;

/**
 *
 * @author Jeppe
 */
public class LadybugFactory {
    private final HashMap<Integer, Ladybug> lbCache = new HashMap();
    private final String imageURL;

    public LadybugFactory(String imageURL) {
        this.imageURL = imageURL;
    }
        
    public Ladybug create(int size){
        Ladybug lb = lbCache.get(size);
        
        if(lb == null)
        {
            Image img = new Image(imageURL, size, size, true, true);
            lb = new Ladybug(img, size);
            lbCache.put(size, lb);
        }
        return lb;
    }
}
