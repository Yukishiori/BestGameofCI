package sceneComponent.changeLevelStuff;

import constants.Constant;
import core.GameObject;
import input.MouseInput;
import input.MouseMotionInput;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.GamePlayScene;
import scene.SceneManager;

public class Button extends GameObject implements PhysicBody {
    public BoxCollider boxCollider = new BoxCollider(50, 50);

    public Button() {
        this.renderer = new ImageRenderer(Constant.Wall.PATH);
        this.position.set(200, 700);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        if (MouseMotionInput.instance.position.x >= this.boxCollider.position.x &&
                MouseMotionInput.instance.position.x <= this.boxCollider.position.x + this.boxCollider.width &&
                MouseMotionInput.instance.position.y <= this.boxCollider.position.y + this.boxCollider.height &&
                MouseMotionInput.instance.position.y >= this.boxCollider.position.y) {

            if (MouseInput.instance.leftMouse) {
                SceneManager.instance.changeScene(new GamePlayScene());
                MouseInput.instance.leftMouse = false;
            }
        }
    }
}
