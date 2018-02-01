package scene;

import core.GameObjectManager;
import game.background.Background;
import game.player.Player;
import tilemap.Map;

public class GamePlayScene implements Scene {
    @Override
    public void init() {
        setupBackround();
        setupPlayer();
        Map map = new Map();
        map.drawMap();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupPlayer() {

        GameObjectManager.instance.recycle(Player.class);
    }

    private void setupBackround() {
        GameObjectManager.instance.recycle(Background.class);
    }


}
