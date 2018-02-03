package game.invisibleBlock;

import constants.Constant;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import game.portal.PortalInHorizontal;
import game.portal.PortalInVertical;
import hit.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;

import java.util.Vector;

public class InvisibleBlock extends GameObject implements PhysicBody, HitObject {
    public int type;
    public Vector2D placePosition = new Vector2D();
    private BoxCollider boxCollider = new BoxCollider(50, 50);
    private Vector<PortalInVertical> portalIns = new Vector<>();

    public InvisibleBlock() {
        this.renderer = new ImageRenderer("Assets/player.png");
        this.boxCollider.position.set(this.position);

    }
    /* 2.Face LEFT
        3.Face UP
        4.Face RIGHT
        5.Face DOWN
    */


    public void config() {

        switch (type) {
            case 2: {
                placePosition.set(this.position.x + 25, this.position.y);
                type = 1;
            }
            case 3: {
                placePosition.set(this.position.x, this.position.y - 25);
                type = 0;
            }
            case 4: {
                placePosition.set(this.position.x, this.position.y);
                type = 1;
            }
            case 5: {
                placePosition.set(this.position.x, this.position.y + Constant.Wall.HEIGHT);
                type = 0;
            }
        }
    }

    @Override
    public void getHit(GameObject gameObject) {
        if (portalIns.size() != 0) {
            if (portalIns.firstElement() != null) {
                portalIns.firstElement().isAlive = false;
            }
        } else {
            if (type == 1) {
                System.out.println(type);
                PortalInVertical portalInVertical = GameObjectManager.instance.recycle(PortalInVertical.class);
                portalInVertical.position.set(placePosition);
                portalIns.add(portalInVertical);
            } else {
                System.out.println(type);
                PortalInHorizontal portalInHorizontal = GameObjectManager.instance.recycle(PortalInHorizontal.class);
                portalInHorizontal.position.set(placePosition);
                portalIns.add(portalInHorizontal);
            }
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    public void portalCreate(int type) {
        PortalInVertical portalIn = GameObjectManager.instance.recycle(PortalInVertical.class);
        portalIn.type = type;
        portalIn.position = placePosition;
    }
}
