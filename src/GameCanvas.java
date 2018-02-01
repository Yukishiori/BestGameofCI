import core.GameObjectManager;
import input.MouseInput;
import input.MouseMotionInput;
import scene.GamePlayScene;
import scene.SceneManager;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    BufferedImage backBuffered;
    Graphics graphics;

    public GameCanvas() {
//        this.setPreferredSize(new Dimension(800,800));
        this.setupBackBuffered();
        this.setupCursor();
        SceneManager.instance.changeScene(new GamePlayScene());
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(800, 800, BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();

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
        GameObjectManager.instance.runAll();
        SceneManager.instance.changeSceneIfNeeded();

    }

    public void renderAll() {
        GameObjectManager.instance.renderAll(this.graphics);
        this.repaint();
    }

}

