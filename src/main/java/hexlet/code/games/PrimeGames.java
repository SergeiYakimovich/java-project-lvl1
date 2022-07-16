package hexlet.code;
public class PrimeGames {
    public static void prime() {

        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String rulesText = "Answer 'yes' if the number is prime, otherwise answer 'no'.";

        for (int i = 0; i < Engine.GAMES_COUNT; i++) {
            int number = Engine.getRandom(Engine.MAX_NUMBER) + 2;
            resultText[i][0] = Integer.toString(number);
            resultText[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(rulesText, resultText);
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
