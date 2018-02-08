package game.coins.explosion;

import constants.Constant;
import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import render.ImageRenderer;

import java.util.Random;

public class SparkleParticle extends GameObject {
    private String[] url = Constant.SparkleParticle.PATHS;
    private Random random = new Random();
    public Vector2D velocity = new Vector2D();
    private FrameCounter frameCounter = new FrameCounter(random.nextInt(15) + 5);
    public SparkleParticle() {
        this.renderer = new ImageRenderer(this.url[random.nextInt(url.length)]);
//        System.out.println(this.url[random.nextInt(url.length)]);

    }

    @Override
    public void run() {
        super.run();
        if (frameCounter.run()) {
            this.isAlive = false;
        } else {
            this.position.addUp(this.velocity);
        }
    }
}
