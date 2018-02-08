package game.player.playerstate;

import core.FrameCounter;
import core.GameObjectManager;
import core.Vector2D;
import game.player.Player;
import game.player.playerstate.particle.HeartParticle;
import game.player.playerstate.particle.SleepyParticle;
import input.MouseMotionInput;

import java.util.Random;

public class Rabu implements State {
    FrameCounter executeTime = new FrameCounter(120);
    private Random random = new Random();

    @Override
    public void run(Player player) {
        for (int i = 0; i < 2; i++) {

            HeartParticle heartParticle = new HeartParticle();
            GameObjectManager.instance.add(heartParticle);
            heartParticle.lifeTime = new FrameCounter(random.nextInt(15) + 30);
            heartParticle.position.set(player.position.x - 10, player.position.y - 10);
            heartParticle.velocity.set(i * -3 - 2, i * -3 - 2);
        }
    }

    @Override
    public void execute(Player player) {
        for (int i = 0; i < 3; i++) {
            HeartParticle heartParticle = new HeartParticle();
            GameObjectManager.instance.add(heartParticle);
            heartParticle.lifeTime = new FrameCounter(random.nextInt(15) + 30);
            heartParticle.position.set(player.position.x - i * 10, player.position.y - 10);
            heartParticle.velocity.set(i * -3 - 2, i * -3 - 2);

            // repeatable

        }
    }

    @Override
    public void infiniteEXE(Player player) {
        player.velocity.set((MouseMotionInput.instance.position.subtract(player.position)).normalize().multiply(5));

    }

    @Override
    public void end(Player player) {
        player.velocity.set((MouseMotionInput.instance.position.subtract(player.position)).normalize().multiply(3));
    }
}
