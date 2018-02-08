package game.player.explosion;

import core.GameObjectManager;
import core.Vector2D;
import game.player.Player;

import java.util.Random;

public class PlayerExplode {
    Random random = new Random();

    public void config(Player player) {
        for (int i = 0; i <= 360; i += 360 / 50) {
            PlayerExplosionParticle playerExplosionParticle = new PlayerExplosionParticle();
            GameObjectManager.instance.add(playerExplosionParticle);
            playerExplosionParticle.position.set(player.position);
            playerExplosionParticle.velocity.set(new Vector2D(0, 1).rotate(i).multiply(random.nextInt(3) + 2));
        }
    }
}
