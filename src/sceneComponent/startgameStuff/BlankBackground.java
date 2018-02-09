package sceneComponent.startgameStuff;

import core.GameObject;
import render.ImageRenderer;

public class BlankBackground extends GameObject {
    public BlankBackground() {
        this.renderer = new ImageRenderer("Assets/background2.png");
    }
}
