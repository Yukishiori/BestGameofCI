package game.coins;

import action.*;
import core.GameObject;
import core.GameObjectManager;
import game.coins.explosion.Sparkling;

import java.util.Random;
import java.util.Vector;

public class CoinSpawner extends GameObject {
    //    private FrameCounter frameCounter = new FrameCounter();
    private Vector<Coin> vector = new Vector<>();
    private Random random = new Random();

    public CoinSpawner() {

    }

    @Override
    public void run() {
        super.run();
        if (!Coin.instance.isAlive) {
            Coin.instance.isAlive = true;
            Coin.instance.position.set(random.nextInt(700) + 50, random.nextInt(700) + 50);
        }
    }
    //    @Override
//    public void run() {
//        super.run();
//        vector.removeIf(coin1 -> coin1.isAlive == false);
//    }
//    private Action checkCoinAlive = new ActionAdapter() {
//        @Override
//        public boolean run(GameObject owner) {
//            if (vector.size() == 0) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        @Override
//        public void reset() {
//            super.reset();
//        }
//    };

//    private Action spawnCoin = new ActionAdapter() {
//        @Override
//        public boolean run(GameObject owner) {
//            Coin coin = GameObjectManager.instance.recycle(Coin.class);
//            coin.position.set(random.nextInt(700) + 50, random.nextInt(700) + 50);
//            Sparkling sparkling = new Sparkling();
//            GameObjectManager.instance.add(sparkling);
////            sparkling.position.set(coin.position);
////            sparkling.position.set(200, 200);
//            sparkling.config(coin);
////            sparkling.isAlive = false;
//            vector.add(coin);
//            return true;
//        }

//        @Override
//        public void reset() {
//            super.reset();
//        }
//    };

//    public void config() {
//        this.add(new ForeverAction(new SequenceAction(
//                new WaitAction(10),
//                checkCoinAlive,
//                spawnCoin
//        )));
//    }
}
