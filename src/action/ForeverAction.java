package action;

import core.GameObject;

public class ForeverAction implements Action {

    private Action action;

    public ForeverAction(Action action) {
        this.action = action;
    }

    @Override
    public boolean run(GameObject owner) {
//        System.out.println("Ưhat" +
//                "");
        if(this.action.run(owner)) action.reset();
        return false;
    }

    @Override
    public void reset() {
//        this.action.reset();
    }
}
