package render;


import core.FrameCounter;
import core.Vector2D;
import utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimationRenderer implements Renderer {

    private boolean isRepeat;
    private List<BufferedImage> list;
    private int currentIndex;
    private FrameCounter frameCounter;
    public boolean disable;

    public AnimationRenderer(boolean isRepeat, int timeInterval, String... urls) {
        this.isRepeat = isRepeat;
        this.list = new ArrayList<>();
        Arrays.asList(urls).stream().forEach(url -> {
            list.add(Utils.loadImage(url));
        });
        this.frameCounter = new FrameCounter(timeInterval);
        this.disable = false;
    }

    @Override
    public void render(Graphics graphics, Vector2D position) {
        if (this.disable) return;
        BufferedImage image = this.list.get(this.currentIndex);
        graphics.drawImage(image, (int) position.x, (int) position.y, null);
        if (this.currentIndex == this.list.size() - 1 && !this.isRepeat) {
            this.disable = true;
        } else {
            if (this.frameCounter.run()) {
                this.changeFrame();
                this.frameCounter.reset();
            }
        }
    }

    private void changeFrame() {
        if (this.currentIndex >= this.list.size() - 1) {
            this.currentIndex = 0;
        } else {
            this.currentIndex += 1;
        }
    }

    public void reset() {
        this.currentIndex = 0;
    }
}
