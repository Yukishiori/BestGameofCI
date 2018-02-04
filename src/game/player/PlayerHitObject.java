package game.player;

import game.portal.PortalIn;
import game.wall.Wall;
import hit.RunHitObject;

public class PlayerHitObject {
    private RunHitObject[] arrays;

    public PlayerHitObject() {
        this.arrays = new RunHitObject[]{
                new RunHitObject(Wall.class),
                new RunHitObject(PortalIn.class)
//                new RunHitObject(PortalIn.class)
        };
    }

    public void run(Player player) {
        for (RunHitObject runHitObject : arrays) {
            runHitObject.run(player);
        }
    }
}
