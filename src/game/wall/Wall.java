package game.wall;

import constants.Constant;
import core.GameObject;
import core.Vector2D;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

public class Wall extends GameObject implements PhysicBody, HitObject {
    public BoxCollider boxCollider = new BoxCollider(Constant.Wall.WIDTH, Constant.Wall.HEIGHT);
    public Vector2D centerPosition = new Vector2D();

    public Wall() {
        this.renderer = new ImageRenderer(Constant.Wall.PATH);
        this.boxCollider.position.set(this.position);
//        this.centerPosition.set(this.boxCollider.position.x + Constant.Wall.WIDTH / 2, this.boxCollider.position.y + Constant.Wall.HEIGHT / 2);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void getHit(GameObject gameObject) {

    }

}
