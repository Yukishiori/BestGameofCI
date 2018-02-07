import core.FrameCounter;
import core.GameObjectManager;
import core.Vector2D;
import game.coins.HitCoin;
import game.player.Player;
import game.text.DrawText;
import input.MouseInput;
import input.MouseMotionInput;
import scene.ChangeLevelScene;
import scene.GamePlayScene;
import scene.SceneManager;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {

    BufferedImage backBuffered;
    Graphics graphics;
    FrameCounter timeShowTarget = new FrameCounter(10);

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
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void runAll() {
        GameObjectManager.instance.runAll();
        SceneManager.instance.changeSceneIfNeeded();

    }

    public void renderAll() {
        GameObjectManager.instance.renderAll(this.graphics);
        showScoreBoard();

        if (Player.HITCOIN) {
            showCoinLeft();
            if (timeShowTarget.run()) {
                Player.HITCOIN = false;
                timeShowTarget.reset();
            }
        }
        this.repaint();
    }

    public void showCoinLeft() {
        Player player = GameObjectManager.instance.getPlayer();
        DrawText.drawText(graphics, Color.RED, "+1", player.position.add(-10, -10));
    }

    private void showScoreBoard() {
        DrawText.drawText(graphics, Color.blue, " Score : " + GamePlayScene.SCORE * 100, new Vector2D(0, 20));
        DrawText.drawText(graphics, Color.orange, Integer.toString(GamePlayScene.CoinToNextLevel), new Vector2D(705, 20));
        DrawText.drawText(graphics, Color.BLACK, " coin left", new Vector2D(725, 20));
    }
}

