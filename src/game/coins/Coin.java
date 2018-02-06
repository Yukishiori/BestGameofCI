package game.coins;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import game.coins.explosion.SparkleParticle;
import game.coins.explosion.Sparkling;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.AnimationRenderer;
import render.ImageRenderer;

import java.util.Random;

public class Coin extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider = new BoxCollider(30, 30);
    private HitCoin hitCoin = new HitCoin();
    public static Coin instance = GameObjectManager.instance.recycle(Coin.class);

    public Coin() {
        this.renderer = new AnimationRenderer(true, 3, Constant.Coin.PATH);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        hitCoin.run(this);
        Sparkling sparkling = GameObjectManager.instance.recycle(Sparkling.class);
        sparkling.config(this);
    }

    @Override
    public void getHit(GameObject gameObject) {
        this.isAlive = false;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
