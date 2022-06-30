package hexlet.code;

import java.util.Random;
public class CalculatorGames {

    public static void calculator(String name) {
        var text = "";
        final int three = 3;
        final int maxNumber = 100;
        int number1;
        int number2;
        int sign;
        String signText = "";
        int result = 0;
        String resultText;
        int countCorrect = 0;
        final Random random = new Random();
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < three; i++) {
            number1 = random.nextInt(maxNumber);
            number2 = random.nextInt(maxNumber);
            sign = random.nextInt(three);
            switch (sign) {
                case 0 :
                    signText = " + ";
                    result = number1 + number2;
                    break;
                case 1 :
                    signText = " - ";
                    result = number1 - number2;
                    break;
                case 2 :
                    signText = " * ";
                    result = number1 * number2;
                    break;
                default : break;
            }
            resultText = Integer.toString(result);
            System.out.println("Question: " + number1 + signText + number2);
            System.out.print("Your answer: ");
            text = Cli.getChoiceText();
            if (text.equals(resultText)) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println(text + " is wrong answer :(. Correct answer was " + resultText);
                System.out.println("Let's try again, " + name + "!");
            }
        }
        if (countCorrect == three) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

}
