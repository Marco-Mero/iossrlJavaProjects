package iossrl.sassocartaforbice;

import java.util.Random;

public enum Move {
    SASSO,
    CARTA,
    FORBICE;

    public boolean beats(Move opponentMove) {
        switch (this) {
            case SASSO:
                return opponentMove == Move.FORBICE;
            case CARTA:
                return opponentMove == Move.SASSO;
            case FORBICE:
                return opponentMove == Move.CARTA;
            default:
                throw new IllegalArgumentException("Unhandled values for the inputted moves.");
        }
    }

    public static Move fromString(String move) {
        move = move.replaceAll("[\\W]", move);
        if (move.contains("sasso"))
            return Move.SASSO;
        if (move.contains("carta"))
            return Move.CARTA;
        if (move.contains("forbic"))
            return Move.FORBICE;
        return null;
    }

    public static Move randomMove() {
        return Move.values()[new Random().nextInt(Move.values().length)];
    }

    public String toPrintString() {
        return this.name().toLowerCase();
    }
}
