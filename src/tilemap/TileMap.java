package tilemap;

import constants.Constant;
import constants.MapConstant;
import core.GameObjectManager;
import game.invisibleBlock.InvisibleBlock;
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
    }

    public void drawMap() {
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
