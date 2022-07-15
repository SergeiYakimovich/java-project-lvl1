package hexlet.code;

import java.util.Random;
public class EvenGames {
    public static void even() {

        final Random random = new Random();
        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String name = App.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Engine.GAMES_COUNT; i++) {
            int number = random.nextInt(Engine.MAX_NUMBER);
            resultText[i][0] = Integer.toString(number);
            resultText[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(name, resultText);
    }

}
