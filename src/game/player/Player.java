package game.player;

import core.GameObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import javax.swing.*;

public class Player extends GameObject implements PhysicBody{

    public BoxCollider boxCollider;

    public Player() {
        this.renderer = new ImageRenderer("Assets/player.png");
        this.isAlive = true;
        this.position.set(200, 200);
        this.boxCollider = new BoxCollider(50,50);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return null;
    }

}
