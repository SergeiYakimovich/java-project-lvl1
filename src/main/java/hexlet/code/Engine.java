package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String[] resultGames = new String[App.GAMESCOUNT * 2];

    public static void setResultGames(String[] result) {
        resultGames = result;
    }
    public static void playGame(String name, int choiceNumber) {

        switch (choiceNumber) {
            case App.EVENGAMENUMBER:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                setResultGames(EvenGames.even());
                break;
            case App.CALCULATORGAMENUMBER:
                System.out.println("What is the result of the expression?");
                setResultGames(CalculatorGames.calculator());
                break;
            case App.GCDGAMENUMBER:
                System.out.println("Find the greatest common divisor of given numbers.");
                setResultGames(GcdGames.gcd());
                break;
            case App.PROGRESSIONGAMENUMBER:
                System.out.println("What number is missing in the progression?");
                setResultGames(ProgressionGames.progression());
                break;
            case App.PRIMEGAMENUMBER:
                System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
                setResultGames(PrimeGames.prime());
                break;
            default : break;
        }

        int countCorrect = 0;
        for (var i = 0; i < App.GAMESCOUNT; i++) {
            System.out.println("Question: " + resultGames[2 * i]);
            System.out.print("Your answer: ");
            String text = getChoiceText();
            if (text.equals(resultGames[2 * i + 1])) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("'" + text + "'" + " is wrong answer ;(. Correct answer was '"
                        + resultGames[2 * i + 1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (countCorrect == App.GAMESCOUNT) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static String getChoiceText() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        return str;
    }

}
