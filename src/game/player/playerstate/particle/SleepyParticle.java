package game.player.playerstate.particle;

import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import render.ImageRenderer;

public class SleepyParticle extends GameObject {
    public Vector2D velocity = new Vector2D();
    public FrameCounter lifeTime;

    public SleepyParticle() {
        this.renderer = new ImageRenderer("Assets/sleepy.png");
    }

    @Override
    public void run() {
        super.run();
        if (lifeTime.run()) {
            this.isAlive = false;
        } else {
            this.position.addUp(this.velocity);
        }
    }
}
