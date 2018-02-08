package scene;

import core.GameObjectManager;
import sceneComponent.startgameStuff.Logo;

public class StartGameScene implements Scene {
    @Override
    public void init() {
        GameObjectManager.instance.recycle(Logo.class);
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
