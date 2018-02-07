package game.player.explosion;

import constants.Constant;
import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import render.ImageRenderer;

import java.util.Random;

public class PlayerExplosionParticle extends GameObject {
    public Vector2D velocity = new Vector2D();
    private Random random = new Random();
    public FrameCounter lifeTime = new FrameCounter(random.nextInt(50) + 10);
    private Vector2D GRAVITY = new Vector2D();

    public PlayerExplosionParticle() {
        this.renderer = new ImageRenderer(Constant.PlayerExplosionParticle.PATHS[random.nextInt(Constant.PlayerExplosionParticle.PATHS.length)]);
        GRAVITY.set(0, 0);
    }

    @Override
    public void run() {
        super.run();
        if (lifeTime.run()) {
            this.isAlive = false;
        } else {
//            GRAVITY.addUp(0,1);
            this.position.addUp(this.velocity);
        }
    }
}
