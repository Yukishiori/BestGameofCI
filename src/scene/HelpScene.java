package scene;

import core.GameObjectManager;

public class HelpScene implements Scene {
    @Override
    public void init() {
//        GameObjectManager.instance.recycle()
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }
}
