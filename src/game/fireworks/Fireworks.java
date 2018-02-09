package game.fireworks;

import core.FrameCounter;
import core.GameObjectManager;
import core.Vector2D;

import java.util.Random;

public class Fireworks {
    Random random = new Random();

    public void config(Vector2D position) {
        for (int i = 0; i <= 360; i += 360 / (random.nextInt(20) + 10)) {
            FireWorksParticle fireWorksParticle = new FireWorksParticle();
            GameObjectManager.instance.add(fireWorksParticle);
            fireWorksParticle.position.set(position);
            fireWorksParticle.lifeTime = new FrameCounter(random.nextInt(30) + 10);
            fireWorksParticle.velocity.set(new Vector2D(0, 1).rotate(i).multiply(random.nextInt(3) + 2));
        }
    }
}
