package game.player;

import core.FrameCounter;
import core.GameObject;
import core.GameObjectManager;
import core.Vector2D;
import game.coins.Coin;
import game.fireworks.Fireworks;
import game.wall.Goal;
import game.wall.Wall;
import scene.GamePlayScene;
import tilemap.TileMap;

import java.util.Random;

public class GameObjectSpawner extends GameObject {
    private Random random = new Random();
    private boolean created = false;
    private FrameCounter frameCounter = new FrameCounter(300);
    private Fireworks fireworks = new Fireworks();
    public GameObjectSpawner() {

    }

    @Override
    public void run() {
        super.run();
        // playerSpawner

        Player player = GameObjectManager.instance.getPlayer();
//        if (player == null) {
//            player = GameObjectManager.instance.recycle(Player.class);
//        }
        if (!player.isAlive && GamePlayScene.playerLife > 0) {
            player.isAlive = true;
            player.position.set(this.position);
            player.velocity.set(2, 0);
        }

        // GoalSpawner
        if (GamePlayScene.CoinToNextLevel == 0 && !created) {
            if (frameCounter.run()) {
                Wall wall = TileMap.vector.get(random.nextInt(TileMap.vector.size() - 1));
                Goal goal = GameObjectManager.instance.recycle(Goal.class);
                goal.position.set(wall.position);
                goal.boxCollider.position.set(wall.position);
                created = true;
                frameCounter.reset();
            } else {
                fireworksrun();
            }
        }
        if (!Coin.instance.isAlive && GamePlayScene.CoinToNextLevel > 0) {
            Coin.instance = new Coin();
            GameObjectManager.instance.add(Coin.instance);
            Coin.instance.position.set(random.nextInt(680) + 60, random.nextInt(680) + 60);
        }
    }

    public void fireworksrun() {

        fireworks.config(new Vector2D(random.nextInt(800), random.nextInt(800)));
    }
}
