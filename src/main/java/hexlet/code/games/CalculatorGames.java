package hexlet.code;

import java.util.Random;
public class CalculatorGames {

    public static void calculator() {

        final int signNumber = 3;
        final Random random = new Random();
        String[][] resultText = new String[Engine.GAMES_COUNT][2];
        String name = App.greeting();

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.GAMES_COUNT; i++) {

            int number1 = random.nextInt(Engine.MAX_NUMBER);
            int number2 = random.nextInt(Engine.MAX_NUMBER);
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
        Engine.playGame(name, resultText);
    }

}
