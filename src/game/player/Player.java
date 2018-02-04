package game.player;

import core.GameObject;
import core.Vector2D;
import game.portal.PortalIn;
import game.portal.PortalOut;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

public class Player extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider;
    public Vector2D velocity = new Vector2D();
    private PlayerHitObject playerHitObject = new PlayerHitObject();

    public Player() {
        this.renderer = new ImageRenderer("Assets/Player2.png");
        this.isAlive = true;
        this.boxCollider = new BoxCollider(30, 30);
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(velocity);
        this.boxCollider.position.set(this.position);
        playerHitObject.run(this);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void getHit(GameObject gameObject) {
//        System.out.println("ff");
        System.out.println("Lul");
        if (gameObject instanceof PortalIn) {
            if (PortalOut.instance.position != null) {
                this.position.set(PortalOut.instance.getCenterPosition());
                this.velocity.set(PortalOut.instance.transferVelocity);
            }
        } else {
            this.isAlive = false;
        }

    }
}
