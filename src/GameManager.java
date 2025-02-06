class GameManager {
    private static GameManager instance;

    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public String determineWinner(Move p1, Move p2) {
        return p1.beats(p2) ? "Player 1 Wins!" : p2.beats(p1) ? "Player 2 Wins!" : "It's a tie!";
    }
}