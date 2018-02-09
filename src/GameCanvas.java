import core.FrameCounter;
import core.GameObjectManager;
import core.Vector2D;
import game.coins.HitCoin;
import game.fireworks.Fireworks;
import game.player.Player;
import game.text.DrawText;
import input.MouseInput;
import input.MouseMotionInput;
import scene.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GameCanvas extends JPanel {

    BufferedImage backBuffered;
    Graphics graphics;
    FrameCounter timeShowTarget = new FrameCounter(10);
    FrameCounter frameCounter = new FrameCounter(220);
    Random random = new Random();
    public GameCanvas() {
        this.setupBackBuffered();
        this.setupCursor();
        SceneManager.instance.changeScene(new StartGameScene());

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
        if (GamePlayScene.STAGE > -1) {
            gameOverRun();
            showScoreBoard();
        }

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
        DrawText.drawText(graphics, Color.YELLOW, "+1", player.position.add(-10, -10));
    }

    private void showScoreBoard() {
        DrawText.drawText(graphics, Color.blue, " Score : " + GamePlayScene.SCORE * 100, new Vector2D(0, 20));
        if (GamePlayScene.CoinToNextLevel <= 0) {
            DrawText.drawText(graphics, Color.WHITE, "0", new Vector2D(705, 20));
        } else {
            DrawText.drawText(graphics, Color.orange, Integer.toString(GamePlayScene.CoinToNextLevel), new Vector2D(705, 20));
        }
        DrawText.drawText(graphics, Color.WHITE, " coin left", new Vector2D(725, 20));

        //player life
        DrawText.drawText(graphics, Color.RED, "Life : " + Integer.toString(GamePlayScene.playerLife), new Vector2D(10, 780));
    }

    public void gameOverRun() {
        if (GamePlayScene.playerLife == 0 && GamePlayScene.STAGE > -1) {
            if (frameCounter.run()) {
                SceneManager.instance.changeScene(new GameOverScene());
                frameCounter.reset();
            }
        }
    }


}

