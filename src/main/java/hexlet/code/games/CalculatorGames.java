package hexlet.code;

final class CalculatorGames extends Games {

    CalculatorGames() {
        setGameConditions("What is the result of the expression?");
    }
    @Override
    public void prepare() {

        final int signNumber = 3;

        for (int i = 0; i < GAMES_COUNT; i++) {
            int number1 = getRandom(MAX_NUMBER);
            int number2 = getRandom(MAX_NUMBER);
            int sign = getRandom(signNumber);
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
            setResultText(i, 0, Integer.toString(number1) + signText + Integer.toString(number2));
            setResultText(i, 1, Integer.toString(result));
        }
    }

}
