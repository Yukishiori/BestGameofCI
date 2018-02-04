package game.player;

import game.wall.Wall;
import hit.RunHitObject;

public class HitWall {
    private RunHitObject[] arrays;

    public HitWall() {
        this.arrays = new RunHitObject[]{
                new RunHitObject(Wall.class),
//                new RunHitObject(PortalIn.class)
        };
    }

    public void run(Player player) {
        for (RunHitObject runHitObject : arrays) {
            runHitObject.run(player);
        }
    }
}
