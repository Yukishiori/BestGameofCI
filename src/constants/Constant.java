package constants;

import core.Vector2D;

public class Constant {
    public static class Windows {
        public static final int WIDTH = 800;
        public static final int HEIGHT = 800;
        public static final int DELAY_NANO_SECOND = 17_000_000;
    }

    public static class Wall {
        public static final int WIDTH = 50;
        public static final int HEIGHT = 50;
        public static final String PATH = "ChienAssets/wall.png";
    }

    public static class Cursor {
        public static final String PATH = "Assets/cursor/cursor2.png";
        public static final int WIDTH = 30;
        public static final int HEIGHT = 30;

    }


    public static class PortalIn {
        public static String PATH_HORI = "Assets/portal/portalin2_hori.png";
        public static String PATH_VERT = "Assets/portal/portalin2_vert.png";
    }

    public static class PortalOut {
        public static String PATH_HORI = "Assets/portal/portalout2_hori.png";
        public static String PATH_VERT = "Assets/portal/portalout2_vert.png";
    }

    public static class PrePortal {
        public static final String PATH_HORI = "Assets/portal/preportal_2_hori.png";
        public static final String PATH_VERT = "Assets/portal/preportal_2_vert.png";
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
        public static String PATH = "Assets/ball.png";
        public static final int TIME_BEFORE_CHANGE_STATE = 80;
        public static final int PLUS_TIME = 45;
        public static final int WIDTH = 30;
        public static final int HEIGHT = 30;
        public static final int PORTAL_TIME_OUT_TIME = 15;
    }

    public static class SparkleParticle {
        public static String[] PATHS = {
                "Assets/sparkle_partifcle1.png",
                "Assets/sparkle_particle2.png"
        };
    }

    public static class PlayerExplosionParticle {
        public static String[] PATHS = {
                "Assets/playerParticle /New Piskel.png",
                "Assets/playerParticle /New Piskel (1).png",
                "Assets/playerParticle /New Piskel (2).png",
                "Assets/playerParticle /New Piskel (3).png",
                "Assets/playerParticle /New Piskel (4).png"
        };
    }

    public static class Background {
        public static final String PATH = "ChienAssets/bg.png";
    }

    public static class Sound {
        public static final String BGM = "";
        public static final String[] WARP_SFX = {
                "Soundtrack/piano1.wav",
                "Soundtrack/piano2.wav",
                "Soundtrack/piano3.wav",
                "Soundtrack/piano4.wav",
                "Soundtrack/piano5.wav",
                "Soundtrack/piano6.wav",
                "Soundtrack/piano7.wav",
                "Soundtrack/piano8.wav",
                "Soundtrack/piano9.wav",
                "Soundtrack/piano10.wav",
                "Soundtrack/piano11.wav",
                "Soundtrack/piano12.wav",
                "Soundtrack/piano13.wav",
                "Soundtrack/piano14.wav"
        };
        public static final String BROKEN = "Soundtrack/Broken_Glass_Sounds_-_Most_recent_6.wav";
    }

    public static class Logo {
        public static final String PATH = "Assets/Logo.png";
    }

}

