package iossrl.sassocartaforbice;

public interface GameContext {
    static final String ESCAPE_STRING = "quit";
    static final int POINTS_TO_WIN = 3;

    static final String TITLE = "~~~ ~~~ ~~~ ~~~ ~~~ ~~~\n|| Sasso, carta, forbice\n~~~ ~~~ ~~~ ~~~ ~~~ ~~~\n";
    static final String SEPARATOR = "\n- - - - - - - - - - - - - - - - - - -\n";
    static final String CHOOSE_MODE_MSG = "~~~ Digitare multi per il multiplayer;\n~~~ Premere invio per sfidare il computer;\n~~~ Digitare 'quit' in qualunque momento per terminare il programma.\n";
    static final String GAME_RULES = "'Carta' batte 'Sasso' che batte 'Forbice' che batte 'Carta'\n";
    static final String COMPUTER_OPPONENT = "~~~Computer selezionato come avversario. Buona fortuna!~~~";
}
