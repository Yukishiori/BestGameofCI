package scene;

public class SceneManager {
    public static SceneManager instance = new SceneManager();
    public static Scene currentScene;
    private Scene nextScene;

    public void changeScene(Scene scene) {
        this.nextScene = scene;
    }

    public void changeSceneIfNeeded() {
        if (nextScene != null) {
            if (currentScene != null) {
                currentScene.deinit();
            }
            nextScene.init();
            this.currentScene = this.nextScene;
            nextScene = null;
        }
    }
}
