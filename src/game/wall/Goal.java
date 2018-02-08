package game.wall;

import core.GameObject;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.ChangeLevelScene;
import scene.SceneManager;
import tilemap.TileMap;

import java.util.Random;

public class Goal extends GameObject implements PhysicBody, HitObject {
    public BoxCollider boxCollider = new BoxCollider(51, 51);

    public Goal() {
        this.renderer = new ImageRenderer("Assets/goal.png");
    }

    @Override
    public void getHit(GameObject gameObject) {
        SceneManager.instance.changeScene(new ChangeLevelScene());
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
