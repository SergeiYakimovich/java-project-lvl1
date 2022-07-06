package hexlet.code;

import java.util.Random;
public class EvenGames {
    public static void even() {
        final int maxNumber = 1000;
        final Random random = new Random();
        int number = random.nextInt(maxNumber);

        App.setResultText(number % 2 == 0 ? "yes" : "no");
        App.setQuestionText(Integer.toString(number));

    }

}
