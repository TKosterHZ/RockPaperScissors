import java.util.Scanner;

class GameFacade {
    private final GameManager gameManager;
    private final Scanner scanner;

    public GameFacade() {
        gameManager = GameManager.getInstance();
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        PlayerObserver observer = new PlayerObserver();

        Move p1 = getValidMove("Player 1");
        Move p2 = getValidMove("Player 2");

        String result = gameManager.determineWinner(p1, p2);
        observer.notifyPlayers(result);
    }

    private Move getValidMove(String playerName) {
        Move move;
        do {
            System.out.println(playerName + ", enter move (Rock, Paper, Scissors): ");
            move = InputAdapter.getMoveFromInput(scanner.nextLine());
            if (move == null) {
                System.out.println("Invalid move! Please enter Rock, Paper, or Scissors.");
            }
        } while (move == null);
        return move;
    }
}