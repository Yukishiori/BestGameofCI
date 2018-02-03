package utils;

import core.Vector2D;

public class Mathx {
    public static int getDistance(Vector2D position1, Vector2D position2) {
        return (int) Math.sqrt((position1.x - position2.x) * (position1.x - position2.x)
                + (position1.y - position2.y) * (position1.y - position2.y));
    }
}
