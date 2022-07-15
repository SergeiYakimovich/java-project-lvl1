package hexlet.code;

import java.util.Random;
public class PrimeGames {

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
    public static void prime() {

        final Random random = new Random();
        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String name = App.greeting();

        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        for (int i = 0; i < Engine.GAMES_COUNT; i++) {
            int number = random.nextInt(Engine.MAX_NUMBER) + 2;
            resultText[i][0] = Integer.toString(number);
            resultText[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.playGame(name, resultText);
    }

}
