package hexlet.code;

import java.util.Scanner;
public class App {

    public static final int EXITNUMBER = 0;
    public static final int GREETINGNUMBER = 1;
    public static final int EVENGAMENUMBER = 2;
    public static final int CALCULATORGAMENUMBER = 3;
    public static final int GCDGAMENUMBER = 4;
    public static final int PROGRESSIONGAMENUMBER = 5;
    public static final int PRIMEGAMENUMBER = 6;
    public static final int GAMESCOUNT = 3;
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

        int choiceNumber = getChoiceNumber();
        if (choiceNumber == EXITNUMBER) {
            return;
        }
        String name = greeting();
        if (choiceNumber != GREETINGNUMBER) {
            Engine.playGame(name, choiceNumber);
        }

    }

    public static String greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, " + str + "!");
        return str;
    }
    public static int getChoiceNumber() {

        Scanner sc = new Scanner(System.in);
        do {
            String str = sc.next();
            str = str.trim();
            if (str.length() == 1) {
                switch (str.charAt(0)) {
                    case '0' : return EXITNUMBER;
                    case '1' : return GREETINGNUMBER;
                    case '2' : return EVENGAMENUMBER;
                    case '3' : return CALCULATORGAMENUMBER;
                    case '4' : return GCDGAMENUMBER;
                    case '5' : return PROGRESSIONGAMENUMBER;
                    case '6' : return PRIMEGAMENUMBER;
                    default :
                }
            }
        } while (true);
    }

}
