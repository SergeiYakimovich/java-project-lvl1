package hexlet.code;

import java.util.Random;
public class GcdGames {

    public static int nod(int n1, int n2) { // greatest common divisor
        int result = 1;
        int min =  n1 < n2 ? n1 : n2;
        for (int i = min; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void gcd() {

        final int maxNumber = 99;
        final Random random = new Random();
        int number1 = random.nextInt(maxNumber) + 1;
        int number2 = random.nextInt(maxNumber) + 1;
        int result = nod(number1, number2);

        App.setResultText(Integer.toString(result));
        App.setQuestionText(Integer.toString(number1) + " " + Integer.toString(number2));
    }

}
