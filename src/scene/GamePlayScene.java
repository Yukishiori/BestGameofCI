package scene;

import core.GameObjectManager;
import game.background.Background;
import game.player.Player;

public class GamePlayScene implements Scene {
    @Override
    public void init() {
        setupBackround();
        setupPlayer();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupPlayer() {
        System.out.println("Wat");
        GameObjectManager.instance.recycle(Player.class);
    }

    private void setupBackround() {
        GameObjectManager.instance.recycle(Background.class);
    }


}
