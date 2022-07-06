package hexlet.code;

import java.util.Random;
public class EvenGames {
    public static String[] even() {
        final int maxNumber = 1000;
        final Random random = new Random();

        String[] resultText = new String[App.GAMESCOUNT * 2];

        for (int i = 0; i < App.GAMESCOUNT; i++) {
            int number = random.nextInt(maxNumber);
            resultText[2 * i] = Integer.toString(number);
            resultText[2 * i + 1] = number % 2 == 0 ? "yes" : "no";
        }
        return resultText;
    }

}
