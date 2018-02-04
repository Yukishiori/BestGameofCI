package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.awt.event.MouseEvent.BUTTON1;
import static java.awt.event.MouseEvent.BUTTON3;

public class MouseInput implements MouseListener {

    public static MouseInput instance = new MouseInput();

    public boolean mouseClicked;
    public boolean mousePressed;
    public boolean mouseReleased;
    public boolean mouseEntered;
    public boolean mouseExited;
    public boolean rightMouse;
    public boolean leftMouse;

    @Override
    public void mouseClicked(MouseEvent e) {


//        if (e.getButton() == 1) {
//            leftMouse = true;
//            rightMouse = false;
//        } else if (e.getButton() == 3) {
//            leftMouse = false;
//            rightMouse = true;
//        }
        this.mouseClicked = true;
        this.mousePressed = false;
        this.mouseReleased = false;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (BUTTON1 == e.getButton()) {
            leftMouse = true;
        }
        if (BUTTON3 == e.getButton()) {
            rightMouse = true;
        }
//        this.rightMouse = false;
//        this.leftMouse = false;
        this.mouseClicked = false;
        this.mousePressed = true;
        this.mouseReleased = false;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.mouseClicked = false;
        this.mousePressed = false;
        this.mouseReleased = true;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseEntered = true;
        this.mouseExited = false;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseEntered = false;
        this.mouseExited = true;
    }
}
