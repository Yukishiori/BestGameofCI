package game.coins.explosion;

import core.FrameCounter;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import game.coins.Coin;

import java.util.Random;

public class Sparkling extends GameObject {
    private Random random = new Random();
    private FrameCounter frameCounter;

    public Sparkling() {
        frameCounter = new FrameCounter(random.nextInt(20));

    }

    public void config(Coin coin) {

        if (frameCounter.run()) {
            for (int i = 0; i < random.nextInt(2) + 1; i++) {
                SparkleParticle particle = new SparkleParticle();
                GameObjectManager.instance.add(particle);
                particle.position.set(random.nextInt(60) + coin.position.x - 30, random.nextInt(60) + coin.position.y - 30);
                particle.velocity.set(new Vector2D(random.nextInt(1), random.nextInt(1)));
            }
        }

//            sparkleParticle.position.set(0,0);
//            frameCounter.reset();
//        }
    }
}
