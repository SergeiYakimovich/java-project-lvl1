package hexlet.code;

final class EvenGames extends Games {
    EvenGames() {
        setGameConditions("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    @Override
    public void prepare() {

        for (int i = 0; i < GAMES_COUNT; i++) {
            int number = getRandom(MAX_NUMBER);
            setResultText(i, 0, Integer.toString(number));
            setResultText(i, 1, number % 2 == 0 ? "yes" : "no");
        }
    }

}
