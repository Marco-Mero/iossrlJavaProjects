package iossrl.sassocartaforbice;

import java.util.Arrays;
import java.util.Scanner;

public class GameStart implements GameContext {
    private static String[] possibleChoices = { "multi", ESCAPE_STRING, "" };

    private static void chooseProgram(String choice, Scanner playerInput) {

        switch (choice) {
            case "multi":
                GameLogic multiMatch = new GameLogic(playerInput, "Giocatore 1", "Giocatore 2");
                multiMatch.playerMatch();
                break;

            case ESCAPE_STRING:
                break;

            case "":
                System.out.println(COMPUTER_OPPONENT);
                GameLogic singleMatch = new GameLogic(playerInput);
                singleMatch.playerMatch();
                break;
            default:
                System.out.println(SEPARATOR + "\nStringa non riconosciuta, riprovare:\n" + SEPARATOR);
        }

    }

    private static void enableClrScrn() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cls");
                builder.inheritIO().start().waitFor();
                System.setProperty("file.encoding", "UTF-8");
            } catch (Exception e) {
                System.out.println(
                        "Se le sequenze ANSI per la pulizia dello schermo non sono abilitate il gioco non funziona in modo ottimale. ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner playerInput = new Scanner(System.in)) {
            String chosenProgram = null;

            enableClrScrn();
            System.out.println(TITLE);
            System.out.println(GAME_RULES);

            do {
                System.out.println(CHOOSE_MODE_MSG);
                chosenProgram = playerInput.nextLine();
                chooseProgram(chosenProgram, playerInput);

            } while (!Arrays.asList(possibleChoices).contains(chosenProgram));

        }
        System.out.println("\n        ~~~ Game Over ~~~\n\nProgramma terminato.");
    }
}
