package hexlet.code;

import java.util.Random;
public class ProgressionGames {

    public static void progression(String name) {
        var text = "";
        final int three = 3;
        final int maxNumber = 100;
        final int progresSize = 10;
        int firstNumber;
        int addNumber;
        int resultNumber;
        int result = 0;
        String resultText;
        int countCorrect = 0;
        final Random random = new Random();
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < three; i++) {
            firstNumber = random.nextInt(maxNumber);
            addNumber = Math.abs(random.nextInt(maxNumber)) + 1;
            var progres = new int[progresSize];
            progres[0] = firstNumber;
            for (int j = 1; j < progresSize; j++) {
                progres[j] = progres[j - 1] + addNumber;
            }
            resultNumber = random.nextInt(progresSize);
            result = progres[resultNumber];
            resultText = Integer.toString(result);
            System.out.print("Question:");
            for (int j = 0; j < progresSize; j++) {
                if (j != resultNumber) {
                    System.out.print(" " + progres[j]);
                } else {
                    System.out.print(" ..");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            text = Cli.getChoiceText();
            if (text.equals(resultText)) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("'" + text + "'" + " is wrong answer ;(. Correct answer was '" + resultText + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (countCorrect == three) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
