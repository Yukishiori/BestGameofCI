package scene;

import core.GameObjectManager;
import game.background.Background;
import game.coins.Coin;
import game.coins.CoinSpawner;
import game.cursor.Cursor;
import game.player.Player;
import game.player.GameObjectSpawner;
import game.portal.PortalIn;
import game.portal.PortalOut;
import game.portal.PrePortal;
import tilemap.TileMap;

public class GamePlayScene implements Scene {

    public static int STAGE = 0;
    public static int SCORE = 0;
    public static int CoinToNextLevel = 10;
    @Override
    public void init() {
        setupBackround();
        this.setupCursor();
        setupPlayer();
//        PrePortal.instance.position.set(0, 0);
//        PrePortal.instance.config(2);
        setupCoinSpawner();
        setupMap();
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
    }

    private void setupBackround() {
        GameObjectManager.instance.recycle(Background.class);
    }

    private void setupCursor() {
        GameObjectManager.instance.recycle(Cursor.class);
        PrePortal.instance = GameObjectManager.instance.recycle(PrePortal.class);
//        if (PortalOut.instance.isAlive = false) {
//            PortalOut.instance = GameObjectManager.instance.recycle(PortalOut.class);
//            PortalIn.instance = GameObjectManager.instance.recycle(PortalIn.class);
//        }
    }

    private void setupCoinSpawner() {
//        Coin.instance = GameObjectManager.instance.recycle(Coin.class);
//        Coin.instance.position.set(600,600);
        CoinSpawner coinSpawner = GameObjectManager.instance.recycle(CoinSpawner.class);
        coinSpawner.run();
    }

    private void setupMap() {
        TileMap.instance.map = TileMap.instance.mapList.elementAt(STAGE);
        TileMap.instance.drawMap();
    }

}
