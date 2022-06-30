package hexlet.code;

import java.util.Random;
public class Games {

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
        int number;
        int countCorrect = 0;
        boolean isNumberPrime;
        final Random random = new Random();
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            number = random.nextInt(100) + 2;
            isNumberPrime = isPrime(number);
            System.out.println("Question: " + number + " ");
            System.out.print("Your answer: ");
            text = Cli.getChoiceText();
            if ((text.equals("yes") && isNumberPrime) || (text.equals("no") && !isNumberPrime)) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("Wrong!");
            }
        }
        if (countCorrect == 3) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

    public static void progression(String name) {
        var text = "";
        int firstNumber;
        int addNumber;
        int resultNumber;
        int result = 0;
        String resultText;
        int countCorrect = 0;
        final Random random = new Random();
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < 3; i++) {
            firstNumber = random.nextInt(100);
            addNumber = Math.abs(random.nextInt(99)) + 1;
            var progres = new int[10];
            progres[0] = firstNumber;
            for (int j = 1; j < 10; j++) {
                progres[j] = progres[j - 1] + addNumber;
            }
            resultNumber = random.nextInt(10);
            result = progres[resultNumber];
            resultText = Integer.toString(result);
            System.out.print("Question: ");
            for (int j = 0; j < 10; j++) {
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
                System.out.println(text + " is wrong answer :(. Correct answer was " + resultText);
                System.out.println("Let's try again, " + name + "!");
            }
        }
        if (countCorrect == 3) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

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
        int number1;
        int number2;
        int result = 0;
        String resultText;
        int countCorrect = 0;
        final Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < 3; i++) {
            number1 = random.nextInt(99) + 1;
            number2 = random.nextInt(99) + 1;
            result = nod(number1, number2);
            resultText = Integer.toString(result);
            System.out.println("Question: " + number1 + " " + number2);
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
        if (countCorrect == 3) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

    public static void calculator(String name) {
        var text = "";
        int number1;
        int number2;
        int sign;
        String signText = "";
        int result = 0;
        String resultText;
        int countCorrect = 0;
        final Random random = new Random();
        System.out.println("What is the result of the expression?");
        for (var i = 0; i < 3; i++) {
            number1 = random.nextInt(100);
            number2 = random.nextInt(100);
            sign = random.nextInt(3);
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
        if (countCorrect == 3) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

    public static void even(String name) {
        var text = "";
        int number;
        int countCorrect = 0;
        boolean isNumberEven;
        final Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            number = random.nextInt(1000);
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
        if (countCorrect == 3) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Be more attractive, " + name + "!");
        }
    }

}
