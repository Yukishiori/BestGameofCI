package game.player.playerstate;

import game.player.Player;

public interface State {
    void run(Player player);

    void execute(Player player);

    void infiniteEXE(Player player);

    void end(Player player);
}
