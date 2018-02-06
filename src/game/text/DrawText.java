package game.text;

import core.GameObject;
import core.Vector2D;

import java.awt.*;

public class DrawText {
    public static void drawText(Graphics graphics, String string, Vector2D position) {
        graphics.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        graphics.setColor(Color.BLACK);
        graphics.drawString(string, (int) position.x, (int) position.y);
    }
}
