package game.coins.explosion;

import core.FrameCounter;
import core.GameObject;
import core.GameObjectManager;
import game.coins.Coin;

import java.util.Random;

public class Sparkling extends GameObject {
    private Random random = new Random();
    private FrameCounter frameCounter;

    public Sparkling() {
        frameCounter = new FrameCounter(random.nextInt(100));

    }

    public void config(Coin coin) {

//        if (frameCounter.run()) {
        SparkleParticle sparkleParticle = GameObjectManager.instance.recycle(SparkleParticle.class);
        sparkleParticle.position.set(random.nextInt(120) + coin.position.x - 60, random.nextInt(120) + coin.position.y - 60);
//            System.out.println(sparkleParticle.position.x + " " + sparkleParticle.position.y);
//            sparkleParticle.position.set(0,0);
//            frameCounter.reset();
//        }
    }
}
