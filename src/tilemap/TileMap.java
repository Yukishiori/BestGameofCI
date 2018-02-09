package tilemap;

import constants.Constant;
import constants.MapConstant;
import core.GameObjectManager;
import core.Vector2D;
import game.invisibleBlock.InvisibleBlock;
import game.player.GameObjectSpawner;
import game.player.Player;
import game.wall.Goal;
import game.wall.Wall;

import java.util.Vector;

public class TileMap {
    public static TileMap instance = new TileMap();
    public static Vector<Wall> vector;
    public Vector<int[][]> mapList = new Vector<>();
    public int[][] map;

    public TileMap() {
        this.vector = new Vector<>();
        mapList.add(MapConstant.TileMap.map0);
        mapList.add(MapConstant.TileMap.map1);
        mapList.add(MapConstant.TileMap.map2);
        mapList.add(MapConstant.TileMap.map3);
        mapList.add(MapConstant.TileMap.map4);
        mapList.add(MapConstant.TileMap.map5);
    }

    public void drawMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[j][i] == 1) {
                    Wall wall = GameObjectManager.instance.recycle(Wall.class);
                    wall.position.set(i * 50, j * 50);
                    this.vector.add(wall);
                } else if (map[j][i] == 9) {
                    setupPlayerSpawner(new Vector2D(i * 50, j * 50));
                } else if (map[j][i] == 8) {
                    Goal goal = GameObjectManager.instance.recycle(Goal.class);

                    goal.position.set(i * 50, j * 50);
                    goal.boxCollider.position.set(i * 50, j * 50);
                } else if (map[j][i] > 1) {
                    InvisibleBlock invisibleBlock = GameObjectManager.instance.recycle(InvisibleBlock.class);
                    invisibleBlock.position.set(i * 50, j * 50);
                    invisibleBlock.config(map[j][i]);
                }
            }
        }
    }

    private void setupPlayerSpawner(Vector2D position) {
        GameObjectSpawner playerSpawner = GameObjectManager.instance.recycle(GameObjectSpawner.class);
        playerSpawner.position.set(position);
        Player player = GameObjectManager.instance.recycle(Player.class);
        player.position.set(position);
        player.velocity.set(2, 0);
    }
}
