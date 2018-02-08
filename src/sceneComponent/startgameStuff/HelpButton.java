package sceneComponent.startgameStuff;

import core.GameObject;
import input.MouseInput;
import input.MouseMotionInput;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.GamePlayScene;
import scene.HelpScene;
import scene.SceneManager;

public class HelpButton extends GameObject implements PhysicBody {
    public BoxCollider boxCollider = new BoxCollider(120, 80);

    public HelpButton() {
        this.renderer = new ImageRenderer("Assets/helpBtn.png");
        this.position.set(450, 600);
    }

    @Override
    public void run() {
        super.run();

        this.boxCollider.position.set(this.position);
        if (MouseMotionInput.instance.position.x >= this.boxCollider.position.x &&
                MouseMotionInput.instance.position.x <= this.boxCollider.position.x + this.boxCollider.width &&
                MouseMotionInput.instance.position.y <= this.boxCollider.position.y + this.boxCollider.height &&
                MouseMotionInput.instance.position.y >= this.boxCollider.position.y) {
            this.renderer = new ImageRenderer("Assets/helpBtn2.png");
            if (MouseInput.instance.leftMouse) {
                SceneManager.instance.changeScene(new HelpScene());
                MouseInput.instance.leftMouse = false;
            }
        } else {
            this.renderer = new ImageRenderer("Assets/helpBtn.png");
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
