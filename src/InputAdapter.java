class InputAdapter {
    public static Move getMoveFromInput(String input) {
        return MoveFactory.createMove(input);
    }
}