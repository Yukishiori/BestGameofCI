package game.player.playerstate.particle;

import core.GameObject;
import render.ImageRenderer;

public class DrunkParticle extends GameObject {
    public DrunkParticle() {
        this.renderer = new ImageRenderer("Assets/state/drunk.png");
    }

}
