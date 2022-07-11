package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String name, String[][] resultGames) {

        int countCorrect = 0;
        for (var i = 0; i < App.GAMES_COUNT; i++) {
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
                break;
            }
        }
        if (countCorrect == App.GAMES_COUNT) {
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
