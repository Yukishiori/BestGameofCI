package game.player.playerstate;

import core.FrameCounter;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import game.player.Player;
import game.player.playerstate.particle.SleepyParticle;

import java.util.Random;

public class Sleepy extends GameObject implements State {
    private Random random = new Random();

    @Override
    public void run(Player player) {
        SleepyParticle sleepyParticle = new SleepyParticle();
        GameObjectManager.instance.add(sleepyParticle);
        sleepyParticle.lifeTime = new FrameCounter(random.nextInt(15) + 5);
        sleepyParticle.position.set(player.position.x - 12, player.position.y - 12);
        sleepyParticle.velocity.set(-3, -3);
        player.velocity.set(0, 0);

    }

    @Override
    public void execute(Player player) {
        int i = random.nextInt(4);
//        System.out.println(i);
        if (i == 0) {
            player.velocity.set(0, random.nextInt(4) + 1);
        } else if (i == 1) {
            player.velocity.set(random.nextInt(4) + 1, 0);
        } else if (i == 2) {
            player.velocity.set(-1 * random.nextInt(4) - 1, 0);
        } else if (i == 3) {
            player.velocity.set(0, -1 * random.nextInt(4) - 1);
        }
    }
}
