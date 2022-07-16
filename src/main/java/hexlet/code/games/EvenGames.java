package hexlet.code;
public class EvenGames {
    public static void even() {

        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String rulesText = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.GAMES_COUNT; i++) {
            int number = Engine.getRandom(Engine.MAX_NUMBER);
            resultText[i][0] = Integer.toString(number);
            resultText[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(rulesText, resultText);
    }

}
