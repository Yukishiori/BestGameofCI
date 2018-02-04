package constants;

public class Constant {
    public static class Windows {
        public static final int WIDTH = 800;
        public static final int HEIGHT = 800;
        public static final int DELAY_NANO_SECOND = 17_000_000;
    }

    public static class Wall {
        public static final int WIDTH = 50;
        public static final int HEIGHT = 50;
        public static final String PATH = "Assets/Wall.png";
    }

    public static class Cursor {
        public static final String PATH = "Assets/cursor.png";
        public static final int WIDTH = 30;
        public static final int HEIGHT = 30;

    }

    public static class TileMap {
        public static final int[][] map1 = new int[][]{
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        };
    }

    public static class PortalIn {
        //        public static final int WIDTH = 100;
//        public static final int HEIGHT = 25;
        public static String PATH_HORI = "Assets/portalin2_hori.png";
        public static String PATH_VERT = "Assets/portalin2_vert.png";
    }
}
