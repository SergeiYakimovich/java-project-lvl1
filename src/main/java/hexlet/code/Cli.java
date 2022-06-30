package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, " + str + "!");
        return str;
    }

    public static void bye(String str) {
        System.out.println("Bye, " + str + "!");
        System.out.println("Thanks for playing Brain Games!");
    }

    public static void ShowGamesList() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    public static int getChoiceNumber() {
        Scanner sc = new Scanner(System.in);
        do {
            ShowGamesList();
            String str = sc.next();
            str = str.trim();
            if (str.length() ==1 ) {
                switch (str.charAt(0)) {
                    case '0' : return 0;
                    case '1' : return 1;
                    case '2' : return 2;
                    case '3' : return 3;
                }
            }
            System.out.println("Wrong choice. Be attentive and try again, please.");
        } while (true);
    }

    public static String getChoiceText() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        return str;
    }

}
