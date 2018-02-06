package game.coins.explosion;

import constants.Constant;
import core.FrameCounter;
import core.GameObject;
import render.ImageRenderer;

import java.util.Random;

public class SparkleParticle extends GameObject {
    public FrameCounter frameCounter = new FrameCounter(20);
    private String[] url = Constant.SparkleParticle.PATHS;
    private Random random = new Random();

    public SparkleParticle() {
        this.renderer = new ImageRenderer(this.url[random.nextInt(url.length)]);
//        System.out.println(this.url[random.nextInt(url.length)]);
    }

    @Override
    public void run() {
        super.run();
        if (frameCounter.run()) {
            this.isAlive = false;
        }
    }
}
