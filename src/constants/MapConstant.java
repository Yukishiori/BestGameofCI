package constants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MapConstant {
    public static class TileMap {

        //16x16

        public static final int[][] map1 = new int[][]{
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
                {3, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 1, 4, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 1, 4, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 1, 4, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {5, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 5},
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
        };

        public static final int[][] map0 = new int[][]{
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
                {3, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {5, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 5},
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0}
        };
        public static final int[][] map2 = new int[][]{
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
                {3, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 3, 3, 0, 0, 0, 0, 3, 3, 0, 0, 2, 1},
                {1, 4, 0, 2, 1, 1, 4, 0, 0, 2, 1, 1, 4, 0, 2, 1},
                {1, 4, 0, 2, 1, 1, 4, 0, 0, 2, 1, 1, 4, 0, 2, 1},
                {1, 4, 0, 0, 5, 5, 0, 0, 0, 0, 5, 5, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 3, 3, 0, 0, 0, 0, 3, 3, 0, 0, 2, 1},
                {1, 4, 0, 2, 1, 1, 4, 0, 0, 2, 1, 1, 4, 0, 2, 1},
                {1, 4, 0, 2, 1, 1, 4, 0, 0, 2, 1, 1, 4, 0, 2, 1},
                {1, 4, 0, 0, 5, 5, 0, 0, 0, 0, 5, 5, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {5, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 5},
                {0, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0},
        };
        public static final int[][] map3 = new int[][]{
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
                {3, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1},
                {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1},
                {1, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {5, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 5},
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0}
        };
        public static final int[][] map4 = new int[][]{
                {0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
                {2, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 9, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 2, 1, 1, 1, 1, 4, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 3, 0, 5, 5, 5, 5, 0, 3, 0, 0, 2, 1},
                {1, 4, 0, 2, 1, 4, 0, 0, 0, 0, 2, 1, 4, 0, 2, 1},
                {1, 4, 0, 2, 1, 4, 0, 0, 0, 0, 2, 1, 4, 0, 2, 1},
                {1, 4, 0, 2, 1, 4, 0, 0, 0, 0, 2, 1, 4, 0, 2, 1},
                {1, 4, 0, 2, 1, 4, 0, 0, 0, 0, 2, 1, 4, 0, 2, 1},
                {1, 4, 0, 0, 5, 0, 3, 3, 3, 3, 0, 5, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 2, 1, 1, 1, 1, 4, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 5, 5, 5, 5, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {5, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 5},
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0}
        };
        public static final int[][] map5 = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };

        public static final int[][] map6 = {
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0},
                {3, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 3, 3, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 9, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 2, 5, 5, 4, 0, 0, 0, 0, 2, 1},
                {5, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 5},
                {0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0}
        };
    }

    public static class MapData {
        public static int[] PLAYER_LIFE = {
                4, 6, 8, 9, 9, 9, 10
        };

        public static int[] COIN_TO_NEXT_LEVEL = {
                10, 13, 16, 19, 22, 25, 0
        };
    }
}
