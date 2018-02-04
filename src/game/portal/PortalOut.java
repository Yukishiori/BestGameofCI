package game.portal;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import render.ImageRenderer;

import java.util.Vector;

public class PortalOut extends GameObject {
    public static PortalOut instance = GameObjectManager.instance.recycle(PortalOut.class);
    public Vector2D transferVelocity;
    private ImageRenderer vertImage = new ImageRenderer(Constant.PortalOut.PATH_VERT);
    private ImageRenderer horiImage = new ImageRenderer(Constant.PortalOut.PATH_HORI);

    public PortalOut() {
        this.transferVelocity = new Vector2D();
    }

    public void config(int face) {
        if (face == 2) {
            this.renderer = vertImage;
            this.transferVelocity.set(-3, 0);
        } else if (face == 4) {
            this.renderer = vertImage;
            this.transferVelocity.set(3, 0);
        } else if (face == 3) {
            this.renderer = horiImage;
            this.transferVelocity.set(0, -3);
        } else if (face == 5) {
            this.renderer = horiImage;
            this.transferVelocity.set(0, 3);
        }

    }
//    public Vector2D getCenterPosition() {
//        return this.position +
//    }

}
