package hexlet.code;

import java.util.Random;
public class EvenGames {

    public static void even(String name) {
        var text = "";
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
            System.out.println("Question: " + number + " ");
            System.out.print("Your answer: ");
            text = Cli.getChoiceText();
            if ((text.equals("yes") && isNumberEven) || (text.equals("no") && !isNumberEven)) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("Wrong!");
            }
        }
        if (countCorrect == three) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

}
