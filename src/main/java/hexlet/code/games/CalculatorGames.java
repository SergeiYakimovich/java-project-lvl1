package hexlet.code;

import java.util.Random;
public class CalculatorGames {

    public static void calculator() {

        final int maxNumber = 100;
        final int signNumber = 3;
        final Random random = new Random();
        int number1 = random.nextInt(maxNumber);
        int number2 = random.nextInt(maxNumber);
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

        App.setResultText(Integer.toString(result));
        App.setQuestionText(Integer.toString(number1) + signText + Integer.toString(number2));

    }

}
