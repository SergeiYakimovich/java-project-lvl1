package hexlet.code;

import java.util.Random;
public class ProgressionGames {
    public static final int PROGRES_SIZE = 10;
    public static void progression() {

        final Random random = new Random();
        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String name = App.greeting();

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.GAMES_COUNT; i++) {
            int firstNumber = random.nextInt(Engine.MAX_NUMBER);
            int addNumber = Math.abs(random.nextInt(Engine.MAX_NUMBER)) + 1;
            var progres = new int[PROGRES_SIZE];
            progres[0] = firstNumber;
            for (int j = 1; j < PROGRES_SIZE; j++) {
                progres[j] = progres[j - 1] + addNumber;
            }
            int positionOfAbsentNumber = random.nextInt(PROGRES_SIZE);
            int absentNumber = progres[positionOfAbsentNumber];
            String text = "";
            for (int j = 0; j < PROGRES_SIZE; j++) {
                if (j != positionOfAbsentNumber) {
                    text = text + progres[j];
                } else {
                    text = text + "..";
                }
                if (j != PROGRES_SIZE - 1) {
                    text = text + " ";
                }
            }

            resultText[i][0] = text;
            resultText[i][1] = Integer.toString(absentNumber);
        }
        Engine.playGame(name, resultText);
    }

}
