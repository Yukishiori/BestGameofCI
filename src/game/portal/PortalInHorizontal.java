package game.portal;

import constants.Constant;
import physics.BoxCollider;
import render.ImageRenderer;

public class PortalInHorizontal extends PortalInVertical {

    public PortalInHorizontal() {
        this.renderer = new ImageRenderer(Constant.PortalIn.PATH_HORI);
        this.boxCollider = new BoxCollider(25, 100);
    }

    @Override
    public void run() {
        super.run();
    }
}
