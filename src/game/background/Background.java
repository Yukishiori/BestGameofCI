package game.background;

import constants.Constant;
import core.GameObject;
import render.ImageRenderer;

import java.awt.*;

public class Background extends GameObject{
    public Background() {
        this.renderer = new ImageRenderer(Constant.Background.PATH);
        this.position.set(0,0);
    }

    @Override
    public void render(Graphics graphics) {
        super.render(graphics);
    }
}
