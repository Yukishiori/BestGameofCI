package game.player.playerstate;

import core.FrameCounter;
import core.GameObject;
import core.GameObjectManager;
import game.coins.Coin;
import game.player.Player;
import game.player.playerstate.particle.AngryParticle;

import java.util.Random;

public class Angry extends GameObject implements State {
    private Random random = new Random();

    @Override
    public void run(Player player) {
        AngryParticle angryParticle = new AngryParticle();
        GameObjectManager.instance.add(angryParticle);
        angryParticle.lifeTime = new FrameCounter(random.nextInt(10) + 3);
        angryParticle.position.set(player.position.x + random.nextInt(25), player.position.y - 20);
        angryParticle.velocity.set(player.velocity);

    }

    @Override
    public void execute(Player player) {
        player.velocity.set((Coin.instance.position.subtract(player.position)).normalize().multiply(7));
    }
}
