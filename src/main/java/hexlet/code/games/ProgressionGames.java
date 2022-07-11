package hexlet.code;

import java.util.Random;
public class ProgressionGames {

    public static String[][] progression() {

        final Random random = new Random();

        String[][] resultText = new String[App.GAMES_COUNT][2];

        for (int i = 0; i < App.GAMES_COUNT; i++) {
            int firstNumber = random.nextInt(App.MAX_NUMBER);
            int addNumber = Math.abs(random.nextInt(App.MAX_NUMBER)) + 1;
            var progres = new int[App.PROGRES_SIZE];
            progres[0] = firstNumber;
            for (int j = 1; j < App.PROGRES_SIZE; j++) {
                progres[j] = progres[j - 1] + addNumber;
            }
            int positionOfAbsentNumber = random.nextInt(App.PROGRES_SIZE);
            int result = progres[positionOfAbsentNumber];
            String text = "";
            for (int j = 0; j < App.PROGRES_SIZE; j++) {
                if (j != positionOfAbsentNumber) {
                    text = text + progres[j];
                } else {
                    text = text + "..";
                }
                if (j != App.PROGRES_SIZE - 1) {
                    text = text + " ";
                }
            }

            resultText[i][0] = text;
            resultText[i][1] = Integer.toString(result);
        }
        return resultText;
    }

}
