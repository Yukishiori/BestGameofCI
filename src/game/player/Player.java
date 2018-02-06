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
    private FrameCounter frameCounter = new FrameCounter(random.nextInt(60) + 30);
    private FrameCounter DELAY_TIME = new FrameCounter(1);

    public Player() {
        this.renderer = new ImageRenderer(Constant.Player.PATH);
        this.isAlive = true;
        this.boxCollider = new BoxCollider(30, 30);
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(velocity);
        this.boxCollider.position.set(this.position);

        playerHitObject.run(this);
        if (!stateChanged) {
            if (frameCounter.run()) {
                State chosenState = decideState.run(this);
                frameCounter.reset();
                frameCounter = new FrameCounter(45);
//                chosenState.execute(this);
                if (DELAY_TIME.run()) {
                    chosenState.execute(this);
                    stateChanged = true;
                    frameCounter = new FrameCounter(random.nextInt(60) + 30);
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
            }
        } else if (gameObject instanceof Coin) {
            GamePlayScene.SCORE++;
        } else {
            this.isAlive = false;
        }
    }
}
