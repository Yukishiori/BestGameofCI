package game.player;

import game.coins.Coin;
import game.portal.PortalIn;
import game.wall.Wall;
import hitCore.RunHitObject;
import movingplaform.MovingPlatform;

public class PlayerHitObject {
    private RunHitObject[] arrays;

    public PlayerHitObject() {
        this.arrays = new RunHitObject[]{
                new RunHitObject(Wall.class),
                new RunHitObject(PortalIn.class),
                new RunHitObject(Coin.class),
                new RunHitObject(MovingPlatform.class)
//                new RunHitObject(PortalIn.class)
        };
    }

    public void run(Player player) {
        for (RunHitObject runHitObject : arrays) {
            runHitObject.run(player);
        }
    }
}
