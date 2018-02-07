package game.player;

import core.GameObject;
import core.GameObjectManager;
import game.wall.Goal;
import game.wall.Wall;
import scene.GamePlayScene;
import tilemap.TileMap;

import java.util.Random;

public class GameObjectSpawner extends GameObject {
    private Random random = new Random();
    private boolean created = false;

    public GameObjectSpawner() {

    }

    @Override
    public void run() {
        super.run();
        // playerSpawner
        Player player = GameObjectManager.instance.getPlayer();
        if (player.isAlive == false) {
            player.isAlive = true;
            player.position.set(200, 200);
            player.velocity.set(2, 0);
        }

        // GoalSpawner
        if (GamePlayScene.CoinToNextLevel == 0 && !created) {
            Wall wall = TileMap.vector.get(random.nextInt(TileMap.vector.size() - 1));
            Goal goal = GameObjectManager.instance.recycle(Goal.class);
            goal.position.set(wall.position);
            goal.boxCollider.position.set(wall.position);
            created = true;
        }
    }
}
