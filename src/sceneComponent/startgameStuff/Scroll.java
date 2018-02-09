package sceneComponent.startgameStuff;

import core.GameObject;
import render.ImageRenderer;

public class Scroll extends GameObject {
    public Scroll() {
        this.renderer = new ImageRenderer("Assets/Scroll_PNG_Clipart_Image.png");
    }
}
