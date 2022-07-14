package hexlet.code;

final class GcdGames extends Games {
    GcdGames() {
        setGameConditions("Find the greatest common divisor of given numbers.");
    }
    @Override
    public void prepare()  {

        for (int i = 0; i < GAMES_COUNT; i++) {
            int number1 = getRandom(MAX_NUMBER) + 1;
            int number2 = getRandom(MAX_NUMBER) + 1;
            int result = nod(number1, number2);
            setResultText(i, 0, Integer.toString(number1) + " " + Integer.toString(number2));
            setResultText(i, 1, Integer.toString(result));
        }
    }

    public static int nod(int n1, int n2) { // greatest common divisor
        int result = 1;
        int min =  n1 < n2 ? n1 : n2;
        for (int i = min; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

}
