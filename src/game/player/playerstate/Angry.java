package game.player.playerstate;

import core.FrameCounter;
import core.GameObject;
import core.GameObjectManager;
import game.coins.Coin;
import game.player.Player;
import game.player.playerstate.particle.AngryParticle;

import java.util.Random;

public class Angry implements State {
    private Random random = new Random();

    @Override
    public void run(Player player) {
        AngryParticle angryParticle = new AngryParticle();
        GameObjectManager.instance.add(angryParticle);
        angryParticle.lifeTime = new FrameCounter(random.nextInt(10) + 30);
        angryParticle.position.set(player.position.x + random.nextInt(25), player.position.y - 20);
        angryParticle.velocity.set(player.velocity);

    }

    @Override
    public void execute(Player player) {
        for (int i = 0; i < 2; i++) {
            AngryParticle angryParticle = new AngryParticle();
            GameObjectManager.instance.add(angryParticle);
            angryParticle.lifeTime = new FrameCounter(random.nextInt(15) + 30);
            angryParticle.position.set(player.position.x - i * 5, player.position.y - i * 3);
        }
        player.velocity.set((Coin.instance.position.subtract(player.position)).normalize().multiply(5));
    }

    @Override
    public void infiniteEXE(Player player) {

    }

    @Override
    public void end(Player player) {
    }
}
