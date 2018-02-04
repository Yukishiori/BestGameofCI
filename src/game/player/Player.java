package game.player;

import core.GameObject;
import core.Vector2D;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import javax.swing.*;

public class Player extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider;
    public static Vector2D velocity = new Vector2D();
    private HitWall hitWall = new HitWall();
    public Player() {
        this.renderer = new ImageRenderer("Assets/player.png");
        this.isAlive = true;
        this.position.set(400, 380);
        this.boxCollider = new BoxCollider(50,50);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.addUp(this.position);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return null;
    }

    @Override
    public void getHit(GameObject gameObject) {
//        System.out.println("ff");
        this.isAlive = false;

    }
}
