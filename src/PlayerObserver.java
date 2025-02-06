class PlayerObserver implements GameObserver {
    public void notifyPlayers(String result) {
        System.out.println("Result: " + result);
    }
}