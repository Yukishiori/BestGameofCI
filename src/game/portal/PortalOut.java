package game.portal;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import java.util.Random;
import java.util.Vector;

public class PortalOut extends GameObject implements HitObject, PhysicBody {
    public static PortalOut instance;
    public Vector2D transferVelocity;
    private ImageRenderer vertImage = new ImageRenderer(Constant.PortalOut.PATH_VERT);
    private ImageRenderer horiImage = new ImageRenderer(Constant.PortalOut.PATH_HORI);
    public BoxCollider boxCollider;
    private int face;
    public PortalOut() {
        this.transferVelocity = new Vector2D();

    }

    public void config(int face) {
        Random random = new Random();
        this.face = face;
        if (face == 2) {
            this.boxCollider = new BoxCollider(25, 50);
            this.boxCollider.position.set(this.position);
            this.renderer = vertImage;
            this.transferVelocity.set(-1 * random.nextInt(5) - 2, 0);

        } else if (face == 4) {
            this.boxCollider = new BoxCollider(25, 50);
            this.boxCollider.position.set(this.position);
            this.renderer = vertImage;
            this.transferVelocity.set(random.nextInt(5) + 2, 0);
        } else if (face == 3) {
            this.boxCollider = new BoxCollider(50, 25);
            this.boxCollider.position.set(this.position);
            this.renderer = horiImage;
            this.transferVelocity.set(0, -1 * random.nextInt(5) - 2);
        } else if (face == 5) {
            this.boxCollider = new BoxCollider(50, 25);
            this.boxCollider.position.set(this.position);
            this.renderer = horiImage;
            this.transferVelocity.set(0, random.nextInt(5) + 2);
        }
    }

    public Vector2D getCenterPosition() {
        if (this.face == 2) {
            return new Vector2D(this.position.x - 6, this.position.y + 10);
        } else if (this.face == 3) {
            return new Vector2D(this.position.x + 10, this.position.y - 6);
        } else if (this.face == 4) {
            return new Vector2D(this.position.x + 6, this.position.y + 10);
        } else if (this.face == 5) {
            return new Vector2D(this.position.x + 10, this.position.y + 6);
        }
        return null;
    }

    @Override
    public void getHit(GameObject gameObject) {

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
