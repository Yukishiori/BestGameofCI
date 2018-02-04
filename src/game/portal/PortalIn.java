package game.portal;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import java.awt.*;

public class PortalIn extends GameObject implements PhysicBody, HitObject {
    public static PortalIn instance = GameObjectManager.instance.recycle(PortalIn.class);
    private ImageRenderer vertImage = new ImageRenderer(Constant.PortalIn.PATH_VERT);
    private ImageRenderer horiImage = new ImageRenderer(Constant.PortalIn.PATH_HORI);
    public BoxCollider boxCollider;
    public PortalIn() {

    }

    public void config(int face) {
        if (face == 2 || face == 4) {
            this.renderer = vertImage;
            this.boxCollider = new BoxCollider(25, 50);
            this.boxCollider.position.set(this.position);
        } else if (face == 3 || face == 5) {
            this.renderer = horiImage;
            this.boxCollider = new BoxCollider(50, 25);
            this.boxCollider.position.set(this.position);
        }
    }


    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
