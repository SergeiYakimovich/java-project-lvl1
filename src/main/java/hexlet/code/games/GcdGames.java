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
    public static String[][] gcd() {

        final Random random = new Random();

        String[][] resultText = new String[App.GAMES_COUNT][2];

        for (int i = 0; i < App.GAMES_COUNT; i++) {
            int number1 = random.nextInt(App.MAX_NUMBER) + 1;
            int number2 = random.nextInt(App.MAX_NUMBER) + 1;
            int result = nod(number1, number2);
            resultText[i][0] = Integer.toString(number1) + " " + Integer.toString(number2);
            resultText[i][1] = Integer.toString(result);
        }
        return resultText;
    }

}
