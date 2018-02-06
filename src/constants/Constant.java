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
        public static final String PATH = "Assets/cursor2.png";
        public static final int WIDTH = 30;
        public static final int HEIGHT = 30;

    }


    public static class PortalIn {
        //        public static final int WIDTH = 100;
//        public static final int HEIGHT = 25;
        public static String PATH_HORI = "Assets/portalin2_hori.png";
        public static String PATH_VERT = "Assets/portalin2_vert.png";
    }

    public static class PortalOut {
        public static String PATH_HORI = "Assets/portalout2_hori.png";
        public static String PATH_VERT = "Assets/portalout2_vert.png";
    }

    public static class Coin {
        public static String[] PATH = {
                "Assets/coin/coin2.png",
                "Assets/coin/coin4.png",
                "Assets/coin/coin_middle.png",
                "Assets/coin/coin3.png",
                "Assets/coin/coin_last.png"
        };
    }

    public static class Player {
        public static String PATH = "Assets/Player2.png";
    }

    public static class SparkleParticle {
        public static String[] PATHS = {
                "Assets/sparkle_partifcle1.png",
                "Assets/sparkle_particle2.png"
        };
    }
}
