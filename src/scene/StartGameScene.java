package scene;

import core.GameObjectManager;
import sceneComponent.changeLevelStuff.Button;
import sceneComponent.startgameStuff.BlankBackground;
import sceneComponent.startgameStuff.HelpButton;
import sceneComponent.startgameStuff.Logo;
import sceneComponent.startgameStuff.StartButton;

public class StartGameScene implements Scene {
    @Override
    public void init() {
        GameObjectManager.instance.recycle(BlankBackground.class);
        GameObjectManager.instance.recycle(Logo.class);
        GameObjectManager.instance.recycle(StartButton.class);
        GameObjectManager.instance.recycle(HelpButton.class);
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
