package hexlet.code;
public class CalculatorGames {
    public static final int NUMBER_OF_SIGNS = 3;
    public static final String[] SIGN_TEXT = {" + ", " - ", " * "};
    public static void calculator() {

        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String rulesText = "What is the result of the expression?";

        for (int i = 0; i < Engine.GAMES_COUNT; i++) {
            int number1 = Engine.getRandom(Engine.MAX_NUMBER);
            int number2 = Engine.getRandom(Engine.MAX_NUMBER);
            int signNumber = Engine.getRandom(NUMBER_OF_SIGNS);
            int result = 0;
            switch (signNumber) {
                case 0 :
                    result = number1 + number2;
                    break;
                case 1 :
                    result = number1 - number2;
                    break;
                case 2 :
                    result = number1 * number2;
                    break;
                default : break;
            }
            resultText[i][0] = Integer.toString(number1) + SIGN_TEXT[signNumber] + Integer.toString(number2);
            resultText[i][1] = Integer.toString(result);
        }
        Engine.playGame(rulesText, resultText);
    }

}
