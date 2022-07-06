package hexlet.code;

import java.util.Random;
public class ProgressionGames {

    public static void progression() {

        final int maxNumber = 100;
        final int progresSize = 10;
        int firstNumber;
        int addNumber;
        int resultNumber;
        int result = 0;

        final Random random = new Random();
        firstNumber = random.nextInt(maxNumber);
        addNumber = Math.abs(random.nextInt(maxNumber)) + 1;
        var progres = new int[progresSize];
        progres[0] = firstNumber;
        for (int j = 1; j < progresSize; j++) {
            progres[j] = progres[j - 1] + addNumber;
        }
        resultNumber = random.nextInt(progresSize);
        result = progres[resultNumber];
        App.setResultText(Integer.toString(result));
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
        App.setQuestionText(text);
    }

}
