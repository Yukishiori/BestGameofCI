import input.MouseInput;
import input.MouseMotionInput;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    BufferedImage backBuffered;

    public GameCanvas() {
//        this.setPreferredSize(new Dimension(800,800));
        this.setupBackBuffered();
        this.setupCursor();
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(800, 800, BufferedImage.TYPE_4BYTE_ABGR);

    }
    public void setupCursor() {
        this.addMouseMotionListener(MouseMotionInput.instance);
        this.addMouseListener(MouseInput.instance);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered,0,0,null);
    }

    public void runAll() {

    }

    public void renderAll() {
        this.repaint();
    }

}

