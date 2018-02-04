import constants.Constant;
import input.MouseInput;
import input.MouseMotionInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class GameWindow extends JFrame {

    private long lastTime = 0;
    GameCanvas gameCanvas = new GameCanvas();

    public GameWindow() {
        this.getContentPane().setPreferredSize(new Dimension(Constant.Windows.WIDTH, Constant.Windows.HEIGHT));
        this.pack();
        this.add(gameCanvas);
        this.event();
        this.setVisible(true);
        hideCursor();
    }

    private void event() {
        //mouse input in gameCanvas for precision
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }

    private void hideCursor() {
        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
        this.getContentPane().setCursor(cursor);
    }

    public void gameLoop() {
        while (true) {
            long currentTime = System.nanoTime();
            if (currentTime - lastTime >= Constant.Windows.DELAY_NANO_SECOND) {
                this.gameCanvas.runAll();
                this.gameCanvas.renderAll();
                this.lastTime = currentTime;
            }
        }

    }
}
