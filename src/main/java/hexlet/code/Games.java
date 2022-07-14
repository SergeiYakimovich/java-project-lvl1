package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public static final int GAMES_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    private static String[][] resultText = new String[GAMES_COUNT][2];
    private static String name;
    private static String gameConditions;

    private static Random random = new Random();

    public final void play() {
        name = greeting();
        prepare();
        System.out.println(gameConditions);
        playGame();
    }
    public void prepare() {
    }
    public static void playGame() {
        int countCorrect = 0;
        for (var i = 0; i < GAMES_COUNT; i++) {
            System.out.println("Question: " + resultText[i][0]);
            System.out.print("Your answer: ");
            String text = getChoiceText();
            if (text.equals(resultText[i][1])) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("'" + text + "'" + " is wrong answer ;(. Correct answer was '"
                        + resultText[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        if (countCorrect == GAMES_COUNT) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static String getChoiceText() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        return str;
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

    public Games() {
    }

    public static void setName(String str) {
        Games.name = str;
    }

    public static void setGameConditions(String str) {
        Games.gameConditions = str;
    }

    public static int getRandom(int n) {
        return random.nextInt(n);
    }

    public static void setResultText(int i, int j, String str) {
        Games.resultText[i][j] = str;
    }

}
