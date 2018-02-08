package scene;

import core.GameObjectManager;
import game.background.ReplayButton;
import sceneComponent.startgameStuff.Logo;

public class GameOverScene implements Scene {
    @Override
    public void init() {
        GameObjectManager.instance.recycle(ReplayButton.class);
        GameObjectManager.instance.recycle(Logo.class);
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
