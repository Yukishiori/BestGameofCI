package scene;

import core.GameObjectManager;
import sceneComponent.ReplayButton;
import sceneComponent.startgameStuff.Gameover;
import sceneComponent.startgameStuff.Logo;

public class GameOverScene implements Scene {
    @Override
    public void init() {
        GameObjectManager.instance.recycle(Gameover.class);
        ReplayButton replayButton = GameObjectManager.instance.recycle(sceneComponent.ReplayButton.class);
        replayButton.position.set(350, 670);
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
