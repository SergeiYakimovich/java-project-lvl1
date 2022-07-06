package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static String greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, " + str + "!");
        return str;
    }

}
