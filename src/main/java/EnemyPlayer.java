import java.util.stream.IntStream;

public class EnemyPlayer {

    public static char[][] gameBoard;

    public EnemyPlayer() {
        gameBoard = new char[10][];
        IntStream.range(0, 10)
                .forEach(i -> gameBoard[i] = new char[]{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'});
    }

    public static char[][] getGameBoard() {
        return gameBoard;
    }
}
