package hexlet.code;

final class ProgressionGames extends Games {

    public static final int PROGRES_SIZE = 10;

    ProgressionGames() {
        setGameConditions("What number is missing in the progression?");
    }

    @Override
    public void prepare()  {

        for (int i = 0; i < GAMES_COUNT; i++) {
            int firstNumber = getRandom(MAX_NUMBER);
            int addNumber = getRandom(MAX_NUMBER) + 1;
            var progres = new int[PROGRES_SIZE];
            progres[0] = firstNumber;
            for (int j = 1; j < PROGRES_SIZE; j++) {
                progres[j] = progres[j - 1] + addNumber;
            }
            int positionOfAbsentNumber = getRandom(PROGRES_SIZE);
            int absentNumber = progres[positionOfAbsentNumber];
            String text = "";
            for (int j = 0; j < PROGRES_SIZE; j++) {
                if (j != positionOfAbsentNumber) {
                    text = text + progres[j];
                } else {
                    text = text + "..";
                }
                if (j != PROGRES_SIZE - 1) {
                    text = text + " ";
                }
            }

            setResultText(i, 0, text);
            setResultText(i, 1, Integer.toString(absentNumber));
        }
    }

}
