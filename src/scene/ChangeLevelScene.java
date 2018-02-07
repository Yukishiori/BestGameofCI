package scene;

import core.GameObjectManager;
import game.player.Player;

public class ChangeLevelScene implements Scene {

    @Override
    public void init() {
        setupPlayer();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupPlayer() {
        Player player = GameObjectManager.instance.recycle(Player.class);
        player.position.set(1, 370);
        player.velocity.set(2, 0);
    }
}
