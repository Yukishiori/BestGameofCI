package game.invisibleBlock;

import core.GameObject;
import game.portal.PrePortal;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;

public class InvisibleBlock extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider;
    public int type;
    public InvisibleBlock() {
//        this.renderer = new ImageRenderer("Assets/player.png");
        this.boxCollider = new BoxCollider(50, 50);
    }

    @Override
    public void run() {
        super.run();

    }

    @Override
    public void getHit(GameObject gameObject) {
        movePortal(this.type);
    }

    private void movePortal(int type) {
        if (type == 2) {
            PrePortal.instance.position.set(this.position.x + 25, this.position.y);
            PrePortal.instance.config(type);
        } else if (type == 3) {
            PrePortal.instance.position.set(this.position.x, this.position.y + 25);
            PrePortal.instance.config(type);
        } else if (type == 4) {
            PrePortal.instance.position.set(this.position.x, this.position.y);
            PrePortal.instance.config(type);
        } else if (type == 5) {
            PrePortal.instance.position.set(this.position.x, this.position.y);
            PrePortal.instance.config(type);
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    public void config(int type) {
        this.type = type;
        this.boxCollider.position.set(this.position);
    }
}
