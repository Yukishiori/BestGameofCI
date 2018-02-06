package game.player.playerstate;

import core.FrameCounter;
import core.GameObjectManager;
import game.player.Player;

import java.util.Random;

public class DecideState {
    private Random random = new Random();

    public State run(Player player) {
        switch (random.nextInt(5) + 1) {
            case 1: {
                Angry angry = new Angry();
                angry.run(player);
                return angry;
            }
            case 2: {
                Sleepy sleepy = new Sleepy();
                sleepy.run(player);
                return sleepy;
            }
        }
        return null;
    }

}
