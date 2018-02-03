package core;

import action.Action;
import render.Renderer;

import java.awt.*;
import java.util.Vector;

public class GameObject {
    public Vector2D position;
    public boolean isAlive;
    protected Renderer renderer;
    private Vector<Action> actions;
    private Vector<Action> newActions;

    public GameObject() {
        this.position = new Vector2D();
        this.isAlive = true;
        this.actions = new Vector<>();
        this.newActions = new Vector<>();
    }
    public void run() {
        this.actions.removeIf(action -> action.run(this));
        this.actions.addAll(newActions);
        newActions.clear();
    }
    public void reset() {
        this.actions.removeAllElements();
    }
    public void render(Graphics graphics){
        if (renderer != null) {
            this.renderer.render(graphics,this.position);
        }
    }

    public void add(Action action){
        this.newActions.add(action);
    }
    public void clear() {
        this.actions.clear();
        this.newActions.clear();
    }
}
