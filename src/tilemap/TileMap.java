package tilemap;

import constants.Constant;
import core.GameObjectManager;
import game.invisibleBlock.InvisibleBlock;
import game.wall.Wall;

import java.util.Vector;

public class TileMap {
    public static Vector<Wall> vector;
    public int[][] map;

    public TileMap() {
        this.map = Constant.TileMap.map1;
        this.vector = new Vector<>();
    }

    public void drawMap() {
//        System.out.println("u draw ?");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[j][i] == 1) {
                    Wall wall = GameObjectManager.instance.recycle(Wall.class);
                    wall.position.set(i * 50, j * 50);
                    this.vector.add(wall);
                } else if (map[j][i] > 1) {
                    InvisibleBlock invisibleBlock = GameObjectManager.instance.recycle(InvisibleBlock.class);
                    invisibleBlock.position.set(i * 50, j * 50);
                    invisibleBlock.config(map[j][i]);
                }
            }
        }
    }
}
