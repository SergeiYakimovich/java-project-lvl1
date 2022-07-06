package hexlet.code;

import java.util.Scanner;

class App {

    public static final int EXITNUMBER = 0;
    public static final int GREETINGNUMBER = 1;
    private static final int EVENGAMENUMBER = 2;
    private static final int CALCULATORGAMENUMBER = 3;
    private static final int GCDGAMENUMBER = 4;
    private static final int PROGRESSIONGAMENUMBER = 5;
    private static final int PRIMEGAMENUMBER = 6;

    private static String questionText;
    private static String resultText;

    public static void setQuestionText(String str) {
        questionText = str;
    }

    public static void setResultText(String str) {
        resultText = str;
    }

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
        if (choiceNumber == EXITNUMBER) {
            return;
        }
        String name = greeting();
        if (choiceNumber != GREETINGNUMBER) {
            playGame(name, choiceNumber);
        }

    }

    public static void playGame(String name, int choiceNumber) {

        String[] conditions = {"", "",
            "Answer 'yes' if the number is even, otherwise answer 'no'.",
            "What is the result of the expression?",
            "Find the greatest common divisor of given numbers.",
            "What number is missing in the progression?",
            "Answer 'yes' if the number is prime, otherwise answer 'no'."};
        System.out.println(conditions[choiceNumber]);
        int countCorrect = 0;
        final int gamesCount = 3;
        for (var i = 0; i < gamesCount; i++) {
            switch (choiceNumber) {
                case EVENGAMENUMBER:
                    EvenGames.even();
                    break;
                case CALCULATORGAMENUMBER:
                    CalculatorGames.calculator();
                    break;
                case GCDGAMENUMBER:
                    GcdGames.gcd();
                    break;
                case PROGRESSIONGAMENUMBER:
                    ProgressionGames.progression();
                    break;
                case PRIMEGAMENUMBER:
                    PrimeGames.prime();
                    break;
                default : break;
            }
            System.out.println("Question: " + questionText);
            System.out.print("Your answer: ");
            String text = getChoiceText();
            if (text.equals(resultText)) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("'" + text + "'" + " is wrong answer ;(. Correct answer was '" + resultText + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (countCorrect == gamesCount) {
            System.out.println("Congratulations, " + name + "!");
        }
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
                switch (str.charAt(0)) {
                    case '0' : return EXITNUMBER;
                    case '1' : return GREETINGNUMBER;
                    case '2' : return EVENGAMENUMBER;
                    case '3' : return CALCULATORGAMENUMBER;
                    case '4' : return GCDGAMENUMBER;
                    case '5' : return PROGRESSIONGAMENUMBER;
                    case '6' : return PRIMEGAMENUMBER;
                    default :
                }
            }
        } while (true);
    }

    public static String getChoiceText() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        return str;
    }

}
