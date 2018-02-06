package movingplaform;

import core.GameObject;
import core.Vector2D;
import game.wall.Wall;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

public class MovingPlatform extends GameObject implements HitObject, PhysicBody {
    //    private ImageRenderer horiImage = new ImageRenderer("");
//    private ImageRenderer vertImage = new ImageRenderer("");
    public BoxCollider boxCollider;
    public Vector2D velocity = new Vector2D();

    public MovingPlatform() {

    }

    public void config(int type) {
//        if (type == )
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);

    }

    @Override
    public void getHit(GameObject gameObject) {
        if (gameObject instanceof Wall) {
            this.velocity.multiply(-1);
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
