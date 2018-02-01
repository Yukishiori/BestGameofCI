import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    BufferedImage backBuffered;

    public GameCanvas() {
        this.setPreferredSize(new Dimension(800,800));
        this.setVisible(true);
        this.setupBackBuffered();
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(800, 800, BufferedImage.TYPE_4BYTE_ABGR);

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

