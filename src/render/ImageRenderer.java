package render;

import utils.Utils;
import core.Vector2D;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageRenderer implements Renderer{
    private BufferedImage image;
    public ImageRenderer(String url) {
        this.image = Utils.loadImage(url);
    }
    @Override
    public void render(Graphics graphics, Vector2D position) {
        graphics.drawImage(this.image,(int)position.x, (int)position.y,null);
    }
}
