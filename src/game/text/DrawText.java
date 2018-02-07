package game.text;

import core.GameObject;
import core.Vector2D;

import java.awt.*;

public class DrawText {
    public static void drawText(Graphics graphics, String string, Vector2D position) {
        graphics.setFont(new Font("Arial", Font.PLAIN, 18));
        graphics.setColor(Color.getHSBColor(220, 70, 41));
        graphics.drawString(string, (int) position.x, (int) position.y);
    }
}
