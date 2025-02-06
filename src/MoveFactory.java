class MoveFactory {
    public static Move createMove(String moveType) {
        return switch (moveType.toLowerCase()) {
            case "rock" -> new Rock();
            case "paper" -> new Paper();
            case "scissors" -> new Scissors();
            default -> null;
        };
    }
}