package game.background;

import core.GameObject;
import render.ImageRenderer;

import java.awt.*;

public class Background extends GameObject{
    public Background() {
        this.renderer = new ImageRenderer("Assets/background2.png");
        this.position.set(0,0);
    }

    @Override
    public void render(Graphics graphics) {
        super.render(graphics);
    }
}
