package hexlet.code;

import java.util.Random;
public class EvenGames {
    public static String[][] even() {

        final Random random = new Random();

        String[][] resultText = new String[App.GAMES_COUNT][2];

        for (int i = 0; i < App.GAMES_COUNT; i++) {
            int number = random.nextInt(App.MAX_NUMBER);
            resultText[i][0] = Integer.toString(number);
            resultText[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        return resultText;
    }

}
