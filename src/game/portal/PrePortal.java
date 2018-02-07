package game.portal;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import render.ImageRenderer;

public class PrePortal extends GameObject {
    public static PrePortal instance;
    public int face;
    private ImageRenderer vertImage = new ImageRenderer(Constant.PrePortal.PATH_VERT);
    private ImageRenderer horiImage = new ImageRenderer(Constant.PrePortal.PATH_HORI);

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
