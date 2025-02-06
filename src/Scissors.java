class Scissors implements Move {
    public boolean beats(Move other) {
        return other instanceof Paper;
    }
}