package game.coins;

import action.*;
import core.GameObject;
import core.GameObjectManager;

import java.util.Random;
import java.util.Vector;

public class CoinSpawner extends GameObject {
    //    private FrameCounter frameCounter = new FrameCounter();
    private Vector<Coin> vector = new Vector<>();
    private Random random = new Random();
    private Action checkCoinAlive = new ActionAdapter() {

        @Override
        public boolean run(GameObject owner) {
            vector.removeIf(coin1 -> coin1.isAlive == false);
            if (vector.size() == 0) {
                System.out.println("bitch");
                return true;
            } else {
//                vector.removeAllElements();
                return false;
            }
        }

        @Override
        public void reset() {
            super.reset();
        }
    };
    private Action spawnCoin = new ActionAdapter() {
        @Override
        public boolean run(GameObject owner) {
            System.out.println("spawned");
            Coin coin = GameObjectManager.instance.recycle(Coin.class);
            coin.position.set(random.nextInt(700) + 50, random.nextInt(700) + 50);
            vector.add(coin);
            return true;
        }

        @Override
        public void reset() {
            super.reset();
        }
    };

    public CoinSpawner() {

    }

    public void config() {
        this.add(new ForeverAction(new SequenceAction(
                new WaitAction(10),
                checkCoinAlive,
                spawnCoin
        )));
    }
}
