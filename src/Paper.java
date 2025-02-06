class Paper implements Move {
    public boolean beats(Move other) {
        return other instanceof Rock;
    }
}