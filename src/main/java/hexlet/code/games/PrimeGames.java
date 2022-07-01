package hexlet.code;

import java.util.Random;
public class PrimeGames {

    public static boolean isPrime(int n) {
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void prime(String name) {
        var text = "";
        var resultText = "";
        final int three = 3;
        final int maxNumber = 100;
        int number;
        int countCorrect = 0;
        boolean isNumberPrime;
        final Random random = new Random();
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        for (var i = 0; i < three; i++) {
            number = random.nextInt(maxNumber) + 2;
            isNumberPrime = isPrime(number);
            resultText = isNumberPrime ? "yes" : "no";
            System.out.println("Question: " + number + " ");
            System.out.print("Your answer: ");
            text = Cli.getChoiceText();
            if ((text.equals("yes") && isNumberPrime) || (text.equals("no") && !isNumberPrime)) {
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
