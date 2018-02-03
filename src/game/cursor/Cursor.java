package game.cursor;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import game.player.Player;
import game.portal.MakePortal;
import game.wall.Wall;
import hit.HitObject;
import input.MouseMotionInput;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import utils.Mathx;

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

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }


    @Override
    public void getHit(GameObject gameObject) {

    }
}
