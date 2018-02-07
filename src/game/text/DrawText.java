package game.text;

import core.GameObject;
import core.Vector2D;

import java.awt.*;

public class DrawText {
    public static void drawText(Graphics graphics, Color color, String string, Vector2D position) {
        graphics.setFont(new Font("Arial", Font.PLAIN, 18));
        graphics.setColor(color);
        graphics.drawString(string, (int) position.x, (int) position.y);
    }
}
