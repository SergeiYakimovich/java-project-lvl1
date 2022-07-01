package hexlet.code;

import java.util.Random;
public class GcdGames {

    public static int nod(int n1, int n2) { // greatest common divisor
        int result = 1;
        int min =  n1 < n2 ? n1 : n2;
        for (int i = min; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void gcd(String name) {
        var text = "";
        final int three = 3;
        final int maxNumber = 99;
        int number1;
        int number2;
        int result = 0;
        String resultText;
        int countCorrect = 0;
        final Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < three; i++) {
            number1 = random.nextInt(maxNumber) + 1;
            number2 = random.nextInt(maxNumber) + 1;
            result = nod(number1, number2);
            resultText = Integer.toString(result);
            System.out.println("Question: " + number1 + " " + number2);
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
