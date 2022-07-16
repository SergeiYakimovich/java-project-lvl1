package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int GAMES_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    public static void playGame(String rulesText, String[][] resultGames) {

        String name = App.greeting();
        System.out.println(rulesText);

        int countCorrect = 0;
        for (var i = 0; i < GAMES_COUNT; i++) {
            System.out.println("Question: " + resultGames[i][0]);
            System.out.print("Your answer: ");
            String text = getChoiceText();
            if (text.equals(resultGames[i][1])) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                System.out.println("'" + text + "'" + " is wrong answer ;(. Correct answer was '"
                        + resultGames[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        if (countCorrect == GAMES_COUNT) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int getRandom(int max) {
        final Random random = new Random();
        return random.nextInt(max);
    }
    public static String getChoiceText() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        return str;
    }

}
