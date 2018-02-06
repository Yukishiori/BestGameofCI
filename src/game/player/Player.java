package game.player;

import constants.Constant;
import core.GameObject;
import core.Vector2D;
import game.coins.Coin;
import game.portal.PortalIn;
import game.portal.PortalOut;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.GamePlayScene;

public class Player extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider;
    public Vector2D velocity = new Vector2D();
    private PlayerHitObject playerHitObject = new PlayerHitObject();

    public Player() {
        this.renderer = new ImageRenderer(Constant.Player.PATH);
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
        if (gameObject instanceof PortalIn) {
            if (PortalOut.instance.position != null) {
                this.position.set(PortalOut.instance.getCenterPosition());
                this.velocity.set(PortalOut.instance.transferVelocity);
            }
        } else if (gameObject instanceof Coin) {
            GamePlayScene.SCORE++;
        } else {
            this.isAlive = false;
        }

    }
}
