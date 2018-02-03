package game.portal;

import core.GameObjectManager;
import core.Vector2D;

import java.util.Vector;

public class MakePortal {
    public static Vector<PortalInVertical> vector = new Vector();
    public static boolean horizontalPortal;
    private Vector2D chosenPosition = new Vector2D();
    private Vector2D prePosition = new Vector2D();
    private PortalInVertical portalIn = GameObjectManager.instance.recycle(PortalInVertical.class);

    //    private int hori = 0; //-1 up , 1 down
//    private int vert = 0; //-1 left, 1 right
    public MakePortal() {

    }

    public void run() {


//        checkNearest();
//        checkPortalFace();
//
////        if (vector.size() == 0 ) {
//        if (hori != 0) {
//            switch (hori) {
//                case 1:
//                    prePosition = chosenPosition.add(new Vector2D(Constant.Wall.WIDTH / 2 + 13, 0 ));
//                case -1:
//                    prePosition = chosenPosition.subtract(new Vector2D(Constant.Wall.WIDTH / 2 + 13, 0));
//            }
//            horizontalPortal = true;
//
//        }
//        if (vert != 0) {
//            switch (vert) {
//                case 1:
//                    prePosition = chosenPosition.subtract(new Vector2D(0, Constant.Wall.WIDTH / 2 + 13));
//                case -1:
//                    prePosition = chosenPosition.add(new Vector2D(0, Constant.Wall.WIDTH / 2 + 13));
//
//            }
//            horizontalPortal = false;
//        }
//        portalIn.position.set(prePosition);
//        }
    }

//    public void checkNearest() {
//
//        int min = 999;
//        int distance;
//        for (Wall wall : tilemap.TileMap.vector) {
//            wall.setCenterPosition(wall.position);
//            distance = Mathx.getDistance(MouseMotionInput.instance.position, wall.centerPosition);
//            if (distance <= min) {
//                chosenPosition = wall.position;
//                min = distance;
//            }
//        }
//    }
//
//    public void checkPortalFace() {
//
//        int subtractedY = (int) MouseMotionInput.instance.position.y - (int)chosenPosition.y;
//        if (subtractedY <= 0) {
//            this.vert = 1;
//        } else {
//            this.vert = -1;
//        }
//
//
//        int subtractedX = (int) MouseMotionInput.instance.position.x - (int)chosenPosition.x;
//        if (subtractedX >= 0) {
//            this.hori = 1;
//        } else {
//            this.hori = -1;
//        }
//
//
//        if (subtractedX * subtractedX >= subtractedY * subtractedY) {
//            this.hori = 0;
//        } else {
//            this.vert = 0;
//        }
//    }
}
