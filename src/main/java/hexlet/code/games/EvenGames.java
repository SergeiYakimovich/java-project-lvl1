package hexlet.code;

import java.util.Random;
public class EvenGames {

    public static void even(String name) {
        var text = "";
        var resultText = "";
        final int three = 3;
        final int maxNumber = 1000;
        int number;
        int countCorrect = 0;
        boolean isNumberEven;
        final Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < three; i++) {
            number = random.nextInt(maxNumber);
            isNumberEven = number % 2 == 0 ? true : false;
            resultText = isNumberEven ? "yes" : "no";
            System.out.println("Question: " + number + " ");
            System.out.print("Your answer: ");
            text = Cli.getChoiceText();
            if ((text.equals(resultText) && isNumberEven) || (text.equals(resultText) && !isNumberEven)) {
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
