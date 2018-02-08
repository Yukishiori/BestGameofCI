package game.player.playerstate;

import core.FrameCounter;
import core.GameObjectManager;
import game.player.Player;

import java.util.Random;

public class DecideState {
    private Random random = new Random();

    public State run(Player player) {
        int i = random.nextInt(5) + 1;
        if (i == 1) {
            Angry angry = new Angry();
            angry.run(player);
            return angry;
        } else if (i == 2) {
            Sleepy sleepy = new Sleepy();
            sleepy.run(player);
            return sleepy;
        } else if (i == 3) {
            Rabu rabu = new Rabu();
            rabu.run(player);
            return rabu;
        } else {
            return null;
        }
    }
}
