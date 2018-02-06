package movingplaform;

import game.wall.Wall;
import hitCore.RunHitObject;

public class MovingPlatformHit {
    private RunHitObject[] runHitObjects;

    public MovingPlatformHit() {
        this.runHitObjects = new RunHitObject[]{
                new RunHitObject(Wall.class)
        };
    }

    public void run(MovingPlatform movingPlatform) {
        for (RunHitObject runHitObject : runHitObjects) {
            runHitObject.run(movingPlatform);
        }
    }
}
