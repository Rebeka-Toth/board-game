import character.Hero;
import character.MonsterArmy;
import board.Board;

public class GameSetup {

    private Board board;
    private Hero hero;
    private MonsterArmy monsterArmy;

    public static final int START_LEVEL = 0;
    public static final int START_FIELD = -1;

    public GameSetup(char[][] boardSetup, boolean isFieldTypeVisible) {
        this.board = new Board(boardSetup);
        this.monsterArmy = new MonsterArmy(board);
        this.hero = new Hero(START_LEVEL, START_FIELD);
        this.hero.printGameCharacter();
        this.board.printBoard(isFieldTypeVisible);
        if (isFieldTypeVisible) {
            this.monsterArmy.printMonsterArmy();
        }
    }

}