package game.portal;

import constants.Constant;
import core.GameObject;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import java.awt.*;

public class PortalIn extends GameObject implements PhysicBody, HitObject {
    public static PortalIn instance = new PortalIn();
    private ImageRenderer vertImage = new ImageRenderer(Constant.PortalIn.PATH_VERT);
    private ImageRenderer horiImage = new ImageRenderer(Constant.PortalIn.PATH_HORI);

    public PortalIn() {

    }

    public void config(int face) {
        if (face == 2 || face == 4) {
            this.renderer = vertImage;
        } else if (face == 3 || face == 5) {
            this.renderer = horiImage;
        }
    }


    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return null;
    }
}
