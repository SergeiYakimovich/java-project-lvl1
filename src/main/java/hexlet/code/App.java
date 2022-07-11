package hexlet.code;

import java.util.List;
import java.util.Scanner;
public class App {

    public static final int EXIT_NUMBER = 0;
    public static final int GREETING_NUMBER = 1;
    public static final int EVEN_GAME_NUMBER = 2;
    public static final int CALCULATOR_GAME_NUMBER = 3;
    public static final int GCD_GAME_NUMBER = 4;
    public static final int PROGRESSION_GAME_NUMBER = 5;
    public static final int PRIME_GAME_NUMBER = 6;
    public static final int GAMES_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    public static final int PROGRES_SIZE = 10;

    private static String[][] resultGames = new String[GAMES_COUNT][2];
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choiceNumber = getChoiceNumber();
        if (choiceNumber == EXIT_NUMBER) {
            return;
        }

        String name = greeting();
        if (choiceNumber == GREETING_NUMBER) {
            return;
        }

        switch (choiceNumber) {
            case EVEN_GAME_NUMBER:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                resultGames = EvenGames.even();
                break;
            case CALCULATOR_GAME_NUMBER:
                System.out.println("What is the result of the expression?");
                resultGames = CalculatorGames.calculator();
                break;
            case GCD_GAME_NUMBER:
                System.out.println("Find the greatest common divisor of given numbers.");
                resultGames = GcdGames.gcd();
                break;
            case PROGRESSION_GAME_NUMBER:
                System.out.println("What number is missing in the progression?");
                resultGames = ProgressionGames.progression();
                break;
            case PRIME_GAME_NUMBER:
                System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
                resultGames = PrimeGames.prime();
                break;
            default : break;
        }

        Engine.playGame(name, resultGames);

    }

    public static String greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, " + str + "!");
        return str;
    }
    public static int getChoiceNumber() {
        Scanner sc = new Scanner(System.in);
        do {
            String str = sc.next();
            str = str.trim();
            if (str.length() == 1) {
                List<Character> number = List.of('0', '1', '2', '3', '4', '5', '6');
                if (number.contains(str.charAt(0))) {
                    return number.indexOf(str.charAt(0));
                }
            }
        } while (true);
    }

}
