package hexlet.code;
class App {
    public static void main(String[] args) {
        var name = "my guest"; // имя игрока
        int chioceNumber; // выбор игрока

        do {
          chioceNumber = Cli.getChoiceNumber();
            switch (chioceNumber) {
                case 1 : {
                    name = Cli.greeting();
                    break;
                }
                case 2 : {
                    name = Cli.greeting();
                    Games.even(name);
                    break;
                }
                case 3 : {
                    name = Cli.greeting();
                    Games.calculator(name);
                    break;
                }
                case 4 : {
                    name = Cli.greeting();
                    Games.gcd(name);
                    break;
                }
            }
        } while (chioceNumber != 0);
        Cli.bye(name);
    }

}
