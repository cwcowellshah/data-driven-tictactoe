package tictactoe.GameMechanics;

import java.util.Random;

public enum Player {
    X("X"),
    O("O"),
    Neither("_");

    /* initialize Random once as a static field to avoid super fast execution
       resulting in the same millisecond value used for several seeds. */
    private static Random rand = new Random(System.currentTimeMillis());
    private String displayString;

    private Player(String displayString) {
        this.displayString = displayString;
    }

    public static Player getRandomPlayer() {
        return rand.nextBoolean() ? Player.X : Player.O;
    }

    public static Player getOtherPlayer(Player player) {
        return player.equals(Player.X) ? Player.O : Player.X;
    }

    public String getDisplayString() {
        return this.displayString;
    }
}
