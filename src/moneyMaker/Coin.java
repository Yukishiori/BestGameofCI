package moneyMaker;

import constants.Constant;
import core.GameObject;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

public class Coin extends GameObject implements PhysicBody, HitObject {

    public Coin() {
        this.renderer = new ImageRenderer(Constant.Coin.PATH);
    }

    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return null;
    }
}
