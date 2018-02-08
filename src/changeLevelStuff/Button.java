package changeLevelStuff;

import constants.Constant;
import core.GameObject;
import hitCore.HitObject;
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
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        if (MouseMotionInput.instance.position.x >= this.boxCollider.position.x - this.boxCollider.width / 2 &&
                MouseMotionInput.instance.position.x <= this.boxCollider.position.x + this.boxCollider.width / 2 &&
                MouseMotionInput.instance.position.y <= this.boxCollider.position.y + this.boxCollider.height / 2 &&
                MouseMotionInput.instance.position.y >= this.boxCollider.position.y - this.boxCollider.height / 2) {
//            System.out.println("bITHC");
            if (MouseInput.instance.rightMouse) {
                SceneManager.instance.changeScene(new GamePlayScene());
                MouseInput.instance.rightMouse = false;
            }
        }
    }
}
