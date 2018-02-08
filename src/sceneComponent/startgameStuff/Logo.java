package sceneComponent.startgameStuff;

import constants.Constant;
import core.GameObject;
import render.ImageRenderer;

public class Logo extends GameObject {
    public Logo() {
        this.renderer = new ImageRenderer(Constant.Logo.PATH);
    }
}
