package hexlet.code;

import java.util.Random;
public class CalculatorGames {

    public static String[][] calculator() {

        final int signNumber = 3;
        final Random random = new Random();

        String[][] resultText = new String[App.GAMES_COUNT][2];

        for (int i = 0; i < App.GAMES_COUNT; i++) {

            int number1 = random.nextInt(App.MAX_NUMBER);
            int number2 = random.nextInt(App.MAX_NUMBER);
            int sign = random.nextInt(signNumber);
            String signText = "";
            int result = 0;
            switch (sign) {
                case 0 :
                    signText = " + ";
                    result = number1 + number2;
                    break;
                case 1 :
                    signText = " - ";
                    result = number1 - number2;
                    break;
                case 2 :
                    signText = " * ";
                    result = number1 * number2;
                    break;
                default : break;
            }
            resultText[i][0] = Integer.toString(number1) + signText + Integer.toString(number2);
            resultText[i][1] = Integer.toString(result);
        }
        return resultText;
    }

}
