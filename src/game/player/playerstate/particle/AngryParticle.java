package game.player.playerstate.particle;

import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import game.player.Player;
import render.ImageRenderer;

public class AngryParticle extends GameObject {
    public FrameCounter lifeTime;
    public Vector2D velocity = new Vector2D();

    public AngryParticle() {
        this.renderer = new ImageRenderer("Assets/angery.png");
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
