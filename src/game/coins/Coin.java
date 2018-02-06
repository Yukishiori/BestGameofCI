package game.coins;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import game.coins.explosion.SparkleParticle;
import game.coins.explosion.Sparkling;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import java.util.Random;

public class Coin extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider = new BoxCollider(30, 30);
    private HitCoin hitCoin = new HitCoin();
    private Random random = new Random();

    public Coin() {
        this.renderer = new ImageRenderer(Constant.Coin.PATH);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        hitCoin.run(this);
        Sparkling sparkling = GameObjectManager.instance.recycle(Sparkling.class);
        sparkle();
    }

    @Override
    public void getHit(GameObject gameObject) {
        this.isAlive = false;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    public void sparkle() {
        SparkleParticle sparkleParticle = GameObjectManager.instance.recycle(SparkleParticle.class);
        sparkleParticle.position.set(random.nextInt(120) + this.position.x - 60, random.nextInt(120) + this.position.y - 60);
    }
}
