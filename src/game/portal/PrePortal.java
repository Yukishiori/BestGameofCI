package game.portal;

import core.GameObject;
import core.GameObjectManager;
import render.ImageRenderer;

public class PrePortal extends GameObject {
    public static PrePortal instance = GameObjectManager.instance.recycle(PrePortal.class);
    public int face;
    private ImageRenderer vertImage = new ImageRenderer("Assets/preportal2hori.png");
    private ImageRenderer horiImage = new ImageRenderer("Assets/preportal2vert.png");

    public PrePortal() {

    }

    public void config(int face) {
        this.face = face;
        if (face == 2 || face == 4) {
            this.renderer = vertImage;
        } else if (face == 3 || face == 5) {
            this.renderer = horiImage;
        }
    }


}
