package hexlet.code;
class App {
    public static void main(String[] args) {
        var name = "my guest"; // имя игрока
        int chioceNumber; // выбор игрока
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        do {
            chioceNumber = Cli.getChoiceNumber();
            switch (chioceNumber) {
                case 1 :
                    name = Cli.greeting();
                    break;
                case 2 :
                    name = Cli.greeting();
                    EvenGames.even(name);
                    break;
                case three :
                    name = Cli.greeting();
                    CalculatorGames.calculator(name);
                    break;
                case four :
                    name = Cli.greeting();
                    GcdGames.gcd(name);
                    break;
                case five :
                    name = Cli.greeting();
                    ProgressionGames.progression(name);
                    break;
                case six :
                    name = Cli.greeting();
                    PrimeGames.prime(name);
                    break;
                default : break;
            }
        } while (chioceNumber != 0);
        Cli.bye(name);
    }

}
