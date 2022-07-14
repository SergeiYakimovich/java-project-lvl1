package hexlet.code;

import java.util.Scanner;
public class App {

    public static final int EXIT_NUMBER = 0;
    public static final int GREETING_NUMBER = 1;
    public static final int EVEN_GAME_NUMBER = 2;
    public static final int CALCULATOR_GAME_NUMBER = 3;
    public static final int GCD_GAME_NUMBER = 4;
    public static final int PROGRESSION_GAME_NUMBER = 5;
    public static final int PRIME_GAME_NUMBER = 6;
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() > 1) {
            return;
        }
        int choiceNumber = Character.getNumericValue(str.charAt(0));

        if (choiceNumber == EXIT_NUMBER) {
            return;
        }

        Games newGame;
        switch (choiceNumber) {
            case GREETING_NUMBER :
                Games.greeting();
                return;
            case EVEN_GAME_NUMBER:
                newGame = new EvenGames();
                break;
            case CALCULATOR_GAME_NUMBER:
                newGame = new CalculatorGames();
                break;
            case GCD_GAME_NUMBER:
                newGame = new GcdGames();
                break;
            case PROGRESSION_GAME_NUMBER:
                newGame = new ProgressionGames();
                break;
            case PRIME_GAME_NUMBER:
                newGame = new PrimeGames();
                break;
            default : return;
        }
        newGame.play();
    }

}
