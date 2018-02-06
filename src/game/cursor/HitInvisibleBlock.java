package game.cursor;

import game.invisibleBlock.InvisibleBlock;
import hitCore.RunHitObject;

public class HitInvisibleBlock {
    private RunHitObject[] arrays;

    public HitInvisibleBlock() {
        this.arrays = new RunHitObject[]{
                new RunHitObject(InvisibleBlock.class)
        };
    }

    public void run(Cursor cursor) {

        for (RunHitObject runHitObject : arrays) {
            runHitObject.run(cursor);
        }
    }
}
