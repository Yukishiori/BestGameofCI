package game.player;

import constants.Constant;
import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import game.coins.Coin;
import game.player.explosion.PlayerExplode;
import game.player.playerstate.DecideState;
import game.player.playerstate.State;
import game.portal.PortalIn;
import game.portal.PortalOut;
import game.text.DrawText;
import game.wall.Wall;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.GamePlayScene;
import scene.SceneManager;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider;
    public Vector2D velocity = new Vector2D();
    private PlayerHitObject playerHitObject = new PlayerHitObject();
    private boolean stateChanged;
    private DecideState decideState = new DecideState();
    private Random random = new Random();
    private FrameCounter timeBeforeChangeState = new FrameCounter(random.nextInt(Constant.Player.TIME_BEFORE_CHANGE_STATE) + Constant.Player.PLUS_TIME);
    public static boolean HITCOIN = false;
    private FrameCounter DELAY_TIME = new FrameCounter(60);
    private FrameCounter DELAY_TIME_BEFORE_END = new FrameCounter(DELAY_TIME.max + 120);
    private FrameCounter RUN_TIME = new FrameCounter(120);
    private State chosenState;
    private boolean EXECUTED;
    private boolean ENDED;
    private boolean RUNNING;
    private boolean CanGoInPortal = true;
    private FrameCounter PORTAL_TIME_OUT = new FrameCounter(Constant.Player.PORTAL_TIME_OUT_TIME);
    private PlayerExplode playerExplode = new PlayerExplode();
//    public static Vector2D position = new Vector2D();

    public Player() {
        this.renderer = new ImageRenderer(Constant.Player.PATH);
        this.isAlive = true;
        this.boxCollider = new BoxCollider(Constant.Player.WIDTH, Constant.Player.HEIGHT);
    }

    @Override
    public void run() {
        super.run();
        if (PORTAL_TIME_OUT.run()) {
            CanGoInPortal = true;
        }
        this.position.addUp(velocity);
        this.boxCollider.position.set(this.position);
        clampPlayer();
        playerHitObject.run(this);

        if (timeBeforeChangeState.run()) {
            if (!stateChanged) {
                this.chosenState = decideState.run(this);
                stateChanged = true;
            }
            if (chosenState != null) {
                if (DELAY_TIME.run() && !EXECUTED) {
                    EXECUTED = true;
                    chosenState.execute(this);
                }
                if (DELAY_TIME.run() && RUNNING) {
                    chosenState.infiniteEXE(this);
                    if (RUN_TIME.run()) {
                        RUNNING = false;
                    }
                }
                if (DELAY_TIME_BEFORE_END.run() && !ENDED) {
                    ENDED = true;
                    chosenState.end(this);
                }
            }
        }
        if (this.position.x <= 0 || this.position.y <= 0 || this.position.x >= Constant.Windows.WIDTH || this.position.y >= Constant.Windows.HEIGHT) {
            this.isAlive = false;

            //dangerous!!!!
            SceneManager.instance.changeScene(new GamePlayScene());


        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void getHit(GameObject gameObject) {
        if (gameObject instanceof PortalIn && CanGoInPortal) {
            if (PortalOut.instance.position != null) {
                this.position.set(PortalOut.instance.getCenterPosition());
                this.velocity.set(PortalOut.instance.transferVelocity);
                stateChanged = false;
                timeBeforeChangeState.reset();
                DELAY_TIME.reset();
                DELAY_TIME_BEFORE_END.reset();
                RUN_TIME.reset();
                EXECUTED = false;
                ENDED = false;
                RUNNING = true;
                CanGoInPortal = false;
                PORTAL_TIME_OUT.reset();
            }
        } else if (gameObject instanceof PortalOut && CanGoInPortal) {
            if (PortalIn.instance.position != null) {
                this.position.set(PortalIn.instance.getCenterPosition());
                this.velocity.set(PortalIn.instance.transferVelocity);
                stateChanged = false;
                timeBeforeChangeState.reset();
                DELAY_TIME.reset();
                DELAY_TIME_BEFORE_END.reset();
                RUN_TIME.reset();
                EXECUTED = false;
                ENDED = false;
                RUNNING = true;
                CanGoInPortal = false;
                PORTAL_TIME_OUT.reset();
            }
        } else if (gameObject instanceof Coin) {
            GamePlayScene.CoinToNextLevel--;
            this.HITCOIN = true;
            GamePlayScene.SCORE++;
        } else if (gameObject instanceof Wall) {
            this.isAlive = false;
            playerExplode.config(this);
        }
    }

    private void clampPlayer() {
        if (this.position.x == 0 || this.position.x == 800 || this.position.y == 0 || this.position.y == 800) {
            this.velocity = this.velocity.multiply(-1);
        }
    }


}
