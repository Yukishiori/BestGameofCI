package game.cursor;

import constants.Constant;
import core.GameObject;
import game.portal.PortalIn;
import game.portal.PortalOut;
import game.portal.PrePortal;
import hit.HitObject;
import input.MouseInput;
import input.MouseMotionInput;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

public class Cursor extends GameObject implements PhysicBody, HitObject {
    public BoxCollider boxCollider = new BoxCollider(Constant.Cursor.WIDTH, Constant.Cursor.HEIGHT);
    //    public static Cursor instance = new Cursor();
//    private MakePortal makePortal = new MakePortal();
    private HitInvisibleBlock hitInvisibleBlock = new HitInvisibleBlock();

    public Cursor() {

        this.renderer = new ImageRenderer(Constant.Cursor.PATH);


    }

    @Override
    public void run() {
        this.position.set(MouseMotionInput.instance.position);
        this.boxCollider.position.set(this.position);
//        this.makePortal.run();
        hitInvisibleBlock.run(this);
        this.makePortal();
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }


    @Override
    public void getHit(GameObject gameObject) {

    }

    private void makePortal() {

        if (MouseInput.instance.leftMouse && PrePortal.instance.position != null) {
            PortalIn.instance.position.set(PrePortal.instance.position);
            PortalIn.instance.config(PrePortal.instance.face);
            MouseInput.instance.leftMouse = false;
        }
        if (MouseInput.instance.rightMouse && PrePortal.instance.position != null) {
            PortalOut.instance.position.set(PrePortal.instance.position);
            PortalOut.instance.config(PrePortal.instance.face);
            MouseInput.instance.rightMouse = false;
        }
    }
}
