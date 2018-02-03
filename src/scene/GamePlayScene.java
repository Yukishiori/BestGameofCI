package scene;

import core.GameObjectManager;
import game.background.Background;
import game.cursor.Cursor;
import game.player.Player;
import game.wall.Wall;
import tilemap.TileMap;

public class GamePlayScene implements Scene {
    @Override
    public void init() {
        setupBackround();
        setupPlayer();
        this.setupCursor();
        TileMap map = new TileMap();
        map.drawMap();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupPlayer() {

        GameObjectManager.instance.recycle(Player.class);
        Wall wall = GameObjectManager.instance.recycle(Wall.class);
        wall.position.set(0, 0);
    }

    private void setupBackround() {
        GameObjectManager.instance.recycle(Background.class);
    }

    private void setupCursor() {
        GameObjectManager.instance.recycle(Cursor.class);
    }

}
