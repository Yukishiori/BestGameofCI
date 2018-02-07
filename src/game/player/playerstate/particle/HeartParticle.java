package game.player.playerstate.particle;

import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import render.ImageRenderer;

public class HeartParticle extends GameObject {
    public Vector2D velocity = new Vector2D();
    public FrameCounter lifeTime;

    public HeartParticle() {
        this.renderer = new ImageRenderer("Assets/state/heart.png");
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
