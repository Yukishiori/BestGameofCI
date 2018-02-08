package scene;

import sceneComponent.changeLevelStuff.Button;
import core.GameObjectManager;

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
        Button button = GameObjectManager.instance.recycle(Button.class);
        button.position.set(200, 300);
    }

}
