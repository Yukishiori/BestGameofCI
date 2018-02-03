package game.portal;

import constants.Constant;
import core.GameObject;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import java.awt.*;


public class PortalInVertical extends GameObject implements HitObject, PhysicBody {
    public BoxCollider boxCollider = new BoxCollider(100, 25);
    public int type;


    public PortalInVertical() {
        this.renderer = new ImageRenderer(Constant.PortalIn.PATH_VERT);
        this.boxCollider.position.set(this.position);
    }

    @Override
    public void run() {

    }

    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
