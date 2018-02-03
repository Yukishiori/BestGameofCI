package input;

import core.Vector2D;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionInput implements MouseMotionListener {

    public static MouseMotionInput instance = new MouseMotionInput();
    public Vector2D position = new Vector2D();

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        System.out.println(e.getX() + " " + e.getY());
        this.position.set(e.getX(), e.getY());
    }
}
