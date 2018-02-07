package scene;

import core.GameObjectManager;
import game.background.Background;
import game.coins.Coin;
import game.coins.CoinSpawner;
import game.cursor.Cursor;
import game.player.Player;
import game.player.GameObjectSpawner;
import game.portal.PortalOut;
import game.portal.PrePortal;
import tilemap.TileMap;

public class GamePlayScene implements Scene {


    public static int SCORE = 0;
    public static int CoinToNextLevel = 10;
    @Override
    public void init() {
        setupBackround();
        setupPlayer();
        this.setupCursor();
        TileMap map = new TileMap();
        map.drawMap();
        PrePortal.instance.position.set(0, 0);
        PrePortal.instance.config(2);
        PortalOut.instance.position = null;
        setupCoinSpawner();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    private void setupPlayer() {

        Player player = GameObjectManager.instance.recycle(Player.class);
        player.position.set(200, 200);
        player.velocity.set(3, 0);
        GameObjectSpawner playerSpawner = GameObjectManager.instance.recycle(GameObjectSpawner.class);
//        Wall wall = GameObjectManager.instance.recycle(Wall.class);
//        wall.position.set(0, 0);
    }

    private void setupBackround() {
        GameObjectManager.instance.recycle(Background.class);
    }

    private void setupCursor() {
        GameObjectManager.instance.recycle(Cursor.class);
    }

    private void setupCoinSpawner() {
        CoinSpawner coinSpawner = GameObjectManager.instance.recycle(CoinSpawner.class);
        coinSpawner.run();
        Coin.instance.isAlive = false;
    }

}
