package game.fireworks;

import constants.Constant;
import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import render.ImageRenderer;

import java.util.Random;

public class FireWorksParticle extends GameObject {
    public FrameCounter lifeTime;
    public Vector2D velocity = new Vector2D();
    Random random = new Random();

    public FireWorksParticle() {
        this.renderer = new ImageRenderer(Constant.Fireworks.PATHS[random.nextInt(Constant.Fireworks.PATHS.length - 1)]);
    }

    @Override
    public void run() {
        super.run();
        if (this.lifeTime.run()) {
            this.isAlive = false;
        } else {
            this.position.addUp(this.velocity);
        }
    }
}
