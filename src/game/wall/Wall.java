package game.wall;

import core.GameObject;
import physics.BoxCollider;
import render.ImageRenderer;

public class Wall extends GameObject {
    public BoxCollider boxCollider = new BoxCollider(50, 50);

    public Wall() {
        this.renderer = new ImageRenderer("Assets/Wall.png");
        this.boxCollider.position.set(this.position);
    }

}
