package sceneComponent;

import core.GameObject;
import input.MouseInput;
import input.MouseMotionInput;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.GamePlayScene;
import scene.SceneManager;
import scene.StartGameScene;

public class ReplayButton extends GameObject implements PhysicBody {
    BoxCollider boxCollider = new BoxCollider(120, 80);

    public ReplayButton() {
        this.renderer = new ImageRenderer("Assets/replay.png");
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        if (MouseMotionInput.instance.position.x >= this.boxCollider.position.x &&
                MouseMotionInput.instance.position.x <= this.boxCollider.position.x + this.boxCollider.width &&
                MouseMotionInput.instance.position.y <= this.boxCollider.position.y + this.boxCollider.height &&
                MouseMotionInput.instance.position.y >= this.boxCollider.position.y) {
            this.renderer = new ImageRenderer("Assets/replay (1).png");
            if (MouseInput.instance.leftMouse) {
                SceneManager.instance.changeScene(new StartGameScene());
                MouseInput.instance.leftMouse = false;
                GamePlayScene.STAGE = -1;
                GamePlayScene.playerLife = 1;
            }
        } else {
            this.renderer = new ImageRenderer("Assets/replay.png");
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return null;
    }
}
