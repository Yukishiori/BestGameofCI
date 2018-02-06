package game.portal;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import render.ImageRenderer;

import java.util.Random;
import java.util.Vector;

public class PortalOut extends GameObject {
    public static PortalOut instance = GameObjectManager.instance.recycle(PortalOut.class);
    public Vector2D transferVelocity;
    private ImageRenderer vertImage = new ImageRenderer(Constant.PortalOut.PATH_VERT);
    private ImageRenderer horiImage = new ImageRenderer(Constant.PortalOut.PATH_HORI);
    private int face;
    public PortalOut() {
        this.transferVelocity = new Vector2D();

    }

    public void config(int face) {
        Random random = new Random();
        this.face = face;
        if (face == 2) {
            this.renderer = vertImage;
            this.transferVelocity.set(-1 * random.nextInt(5) - 2, 0);
        } else if (face == 4) {
            this.renderer = vertImage;
            this.transferVelocity.set(random.nextInt(5) + 2, 0);
        } else if (face == 3) {
            this.renderer = horiImage;
            this.transferVelocity.set(0, -1 * random.nextInt(5) - 2);
        } else if (face == 5) {
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

}
