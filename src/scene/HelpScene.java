package scene;

import core.GameObjectManager;
import sceneComponent.ReplayButton;
import sceneComponent.startgameStuff.BlankBackground;
import sceneComponent.startgameStuff.Scroll;

public class HelpScene implements Scene {
    @Override
    public void init() {
        GameObjectManager.instance.recycle(BlankBackground.class);
        Scroll scroll = GameObjectManager.instance.recycle(Scroll.class);
        scroll.position.set(100, 0);
        ReplayButton replayButton = GameObjectManager.instance.recycle(ReplayButton.class);
        replayButton.position.set(0, 700);
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
