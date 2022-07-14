package hexlet.code;

final class PrimeGames extends Games {

    PrimeGames() {
        setGameConditions("Answer 'yes' if the number is prime, otherwise answer 'no'.");
    }

    @Override
    public void prepare() {

        for (int i = 0; i < GAMES_COUNT; i++) {
            int number = getRandom(MAX_NUMBER) + 2;
            setResultText(i, 0, Integer.toString(number));
            setResultText(i, 1, isPrime(number) ? "yes" : "no");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}
