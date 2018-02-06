package game.player;

import constants.Constant;
import core.FrameCounter;
import core.GameObject;
import core.Vector2D;
import game.coins.Coin;
import game.player.playerstate.DecideState;
import game.player.playerstate.State;
import game.portal.PortalIn;
import game.portal.PortalOut;
import hitCore.HitObject;
import physics.BoxCollider;
import physics.PhysicBody;
import render.ImageRenderer;
import scene.GamePlayScene;

import java.util.Random;

public class Player extends GameObject implements PhysicBody, HitObject {

    public BoxCollider boxCollider;
    public Vector2D velocity = new Vector2D();
    private PlayerHitObject playerHitObject = new PlayerHitObject();
    private boolean stateChanged;
    private DecideState decideState = new DecideState();
    private Random random = new Random();
    private FrameCounter timeBeforeChangeState = new FrameCounter(random.nextInt(Constant.Player.TIME_BEFORE_CHANGE_STATE) + Constant.Player.PLUS_TIME);
    private FrameCounter DELAY_TIME = new FrameCounter(1);

    public Player() {
        this.renderer = new ImageRenderer(Constant.Player.PATH);
        this.isAlive = true;
        this.boxCollider = new BoxCollider(Constant.Player.WIDTH, Constant.Player.HEIGHT);
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(velocity);
        this.boxCollider.position.set(this.position);
        clampPlayer();
        playerHitObject.run(this);
        if (!stateChanged) {
            if (timeBeforeChangeState.run()) {
                State chosenState = decideState.run(this);
                timeBeforeChangeState.reset();
                timeBeforeChangeState = new FrameCounter(Constant.Player.PLUS_TIME);
                if (DELAY_TIME.run()) {
                    chosenState.execute(this);
                    stateChanged = true;
                    timeBeforeChangeState = new FrameCounter(random.nextInt(Constant.Player.TIME_BEFORE_CHANGE_STATE) + Constant.Player.PLUS_TIME);
                    DELAY_TIME.reset();
                }
            }
        }
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }

    @Override
    public void getHit(GameObject gameObject) {
        if (gameObject instanceof PortalIn) {
            if (PortalOut.instance.position != null) {
                this.position.set(PortalOut.instance.getCenterPosition());
                this.velocity.set(PortalOut.instance.transferVelocity);
                stateChanged = false;
                timeBeforeChangeState.reset();
            }
        } else if (gameObject instanceof Coin) {
            GamePlayScene.SCORE++;
        } else {
            this.isAlive = false;
        }
    }

    private void clampPlayer() {
        if (this.position.x == 0 || this.position.x == 800 || this.position.y == 0 || this.position.y == 800) {
            this.velocity = this.velocity.multiply(-1);
        }
    }
}
