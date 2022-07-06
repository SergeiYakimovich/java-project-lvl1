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
    public static void prime() {

        final int maxNumber = 100;
        final Random random = new Random();
        int number = random.nextInt(maxNumber) + 2;

        App.setResultText(isPrime(number) ? "yes" : "no");
        App.setQuestionText(Integer.toString(number));

    }

}
