package scene;

import sceneComponent.changeLevelStuff.Button;
import core.GameObjectManager;
import sceneComponent.startgameStuff.StartButton;

public class ChangeLevelScene implements Scene {

    @Override
    public void init() {
        setupButton();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupButton() {
        StartButton button = GameObjectManager.instance.recycle(StartButton.class);
        button.position.set(350, 350);
    }

}
