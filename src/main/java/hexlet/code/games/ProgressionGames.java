package hexlet.code;

import java.util.Random;
public class ProgressionGames {

    public static String[] progression() {

        final int maxNumber = 100;
        final int progresSize = 10;
        final Random random = new Random();

        String[] resultText = new String[App.GAMESCOUNT * 2];

        for (int i = 0; i < App.GAMESCOUNT; i++) {
            int firstNumber = random.nextInt(maxNumber);
            int addNumber = Math.abs(random.nextInt(maxNumber)) + 1;
            var progres = new int[progresSize];
            progres[0] = firstNumber;
            for (int j = 1; j < progresSize; j++) {
                progres[j] = progres[j - 1] + addNumber;
            }
            int resultNumber = random.nextInt(progresSize);
            int result = progres[resultNumber];
            String text = "";
            for (int j = 0; j < progresSize; j++) {
                if (j != resultNumber) {
                    text = text + progres[j];
                } else {
                    text = text + "..";
                }
                if (j != progresSize - 1) {
                    text = text + " ";
                }
            }

            resultText[2 * i] = text;
            resultText[2 * i + 1] = Integer.toString(result);
        }
        return resultText;
    }

}
