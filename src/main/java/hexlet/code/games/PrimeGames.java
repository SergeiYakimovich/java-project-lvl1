package hexlet.code;

import java.util.Random;
public class PrimeGames {

    public static boolean isPrime(int n) {
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static String[] prime() {

        final int maxNumber = 100;
        final Random random = new Random();

        String[] resultText = new String[App.GAMESCOUNT * 2];

        for (int i = 0; i < App.GAMESCOUNT; i++) {
            int number = random.nextInt(maxNumber) + 2;
            resultText[2 * i] = Integer.toString(number);
            resultText[2 * i + 1] = isPrime(number) ? "yes" : "no";
        }
        return resultText;

    }

}
