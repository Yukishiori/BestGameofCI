import core.GameObjectManager;
import core.Vector2D;
import game.text.DrawText;
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
        DrawText.drawText(this.graphics, "Score: " + GamePlayScene.SCORE, new Vector2D(600, 200));
        this.repaint();
    }
}

