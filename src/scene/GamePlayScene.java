package scene;

import constants.MapConstant;
import core.GameObjectManager;
import game.background.Background;
import game.coins.Coin;
import game.cursor.Cursor;
import game.portal.PortalIn;
import game.portal.PortalOut;
import game.portal.PrePortal;
import tilemap.TileMap;

public class GamePlayScene implements Scene {

    public static int STAGE = -1;
    public static int SCORE = 0;
    public static int CoinToNextLevel = 10;
    public static int playerLife;
    @Override
    public void init() {
        STAGE++;
        setupBackround();
        this.setupCursor();
//        PrePortal.instance.position.set(0, 0);
//        PrePortal.instance.config(2);
        resetScore();
        setupCoinSpawner();
        setupMap();
//        setupPlayer();
    }

    @Override
    public void deinit() {
        GameObjectManager.instance.clear();
    }

    public void resetScore() {
        this.CoinToNextLevel = MapConstant.MapData.COIN_TO_NEXT_LEVEL[STAGE];
        this.playerLife = MapConstant.MapData.PLAYER_LIFE[STAGE];
    }

//    private void setupPlayer() {
//        Player player = GameObjectManager.instance.recycle(Player.class);
//        player.position.set(200, 200);
//        player.velocity.set(3, 0);
//        player.isAlive = false;
//        GameObjectSpawner playerSpawner = GameObjectManager.instance.recycle(GameObjectSpawner.class);
//    }

    private void setupBackround() {
        GameObjectManager.instance.recycle(Background.class);
    }

    private void setupCursor() {
        GameObjectManager.instance.recycle(Cursor.class);
        PrePortal.instance = GameObjectManager.instance.recycle(PrePortal.class);
        PortalOut.instance = GameObjectManager.instance.recycle(PortalOut.class);
        PortalOut.instance.position.set(-100, -100);
        PortalOut.instance.config(2);
        PortalIn.instance = GameObjectManager.instance.recycle(PortalIn.class);
        PortalIn.instance.position.set(-100, -100);
        PortalIn.instance.config(2);

    }

    private void setupCoinSpawner() {
        Coin.instance = GameObjectManager.instance.recycle(Coin.class);
        Coin.instance.position.set(500, 600);
    }

    private void setupMap() {
        TileMap.instance.map = TileMap.instance.mapList.elementAt(STAGE);
        TileMap.instance.drawMap();
    }
}
