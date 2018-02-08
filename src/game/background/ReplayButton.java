package game.background;

import core.GameObject;
import input.MouseInput;
import input.MouseMotionInput;
import render.ImageRenderer;
import scene.GamePlayScene;
import scene.SceneManager;

public class ReplayButton extends GameObject {
    public ImageRenderer imageRendererReplay = new ImageRenderer("Assets/replay1.png");
    public ImageRenderer imageRendererReplayHover = new ImageRenderer("Assets/replay.png");
    public ReplayButton() {
        this.renderer = imageRendererReplay;
        this.position.set(400, 400);
    }

    @Override
    public void run() {
        super.run();
        if( MouseMotionInput.instance.position.x <= 220 && MouseMotionInput.instance.position.x >= 140  &&
                MouseMotionInput.instance.position.y >= 260 &&  MouseMotionInput.instance.position.y <= 325) {
            this.renderer = imageRendererReplayHover;
            if(MouseInput.instance.mousePressed) {
                SceneManager.instance.changeScene(new GamePlayScene());
            }
        } else {
            this.renderer = imageRendererReplay;
        }
    }
}
