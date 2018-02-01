import input.MouseInput;
import input.MouseMotionInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame {

    private long lastTime = 0;
    GameCanvas gameCanvas = new GameCanvas();

    public GameWindow() {
//        this.getContentPane().setPreferredSize(new Dimension(800,800));
//        this.pack();
        this.setSize(800, 800);
        this.add(gameCanvas);
        this.event();
        this.setVisible(true);
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

    public void gameLoop() {
        while (true) {
            long currentTime = System.nanoTime();
            if (currentTime - lastTime >= 17_000_000) {
                this.gameCanvas.runAll();
                this.gameCanvas.renderAll();
                this.lastTime = currentTime;
            }
        }

    }
}
