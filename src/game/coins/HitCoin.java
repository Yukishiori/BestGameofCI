package game.coins;

import constants.Constant;
import game.wall.Wall;
import hitCore.RunHitObject;

public class HitCoin {
    private RunHitObject[] runHitObjects;

    public HitCoin() {
        runHitObjects = new RunHitObject[]{
                new RunHitObject(Wall.class)
        };
    }

    public void run(Coin coin) {
        for (RunHitObject runHitObject : runHitObjects) {
            runHitObject.run(coin);
        }
    }
}
