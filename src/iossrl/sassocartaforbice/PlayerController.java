package iossrl.sassocartaforbice;

import java.util.Scanner;

public class PlayerController implements GameContext {
    private static final int NAME_LENGTH = 13;
    private String name;
    private int score;
    private Move move;
    private Scanner inputParser;

    public PlayerController(String name, Scanner inputParser) {
        this.name = name;
        this.score = 0;
        this.move = null;
        this.inputParser = inputParser;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Move getMove() {
        return move;
    }

    public String getMoveName() {
        return move.name().toLowerCase();
    }

    public void tellScore() {
        System.out.print(String.format("%-" + NAME_LENGTH + "s", name).substring(0, NAME_LENGTH) + score);
    }

    public void score() {
        score++;
    }

    public void setRandomMove() {
        move = Move.randomMove();
    }

    public void setMove(Move myMove) {
        move = myMove;
    }

    public void wins() {
        System.out.println("      ~~~ " + name + " vince ~~~");
    }

    public boolean isNamed(String paragon) {
        return name.equalsIgnoreCase(paragon);
    }

    public void promptMove() {
        System.out.println("~ " + name + ":  [Sasso, carta, forbice]?");
        this.move = getMoveFromInput();
    }

    public Move getMoveFromInput() {
        String inputMove = inputParser.nextLine();
        Move move = Move.fromString(inputMove);
        if (move != null)
            return move;
        else if (inputMove == ESCAPE_STRING)
            return null;
        System.out.println(" ~ Input imprevisto, ammessi: sasso, carta o forbice ");
        return getMoveFromInput();
    }
}