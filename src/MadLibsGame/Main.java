package MadLibsGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an verb with -ing. (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter one more adjective (description): ");
        adjective3 = scanner.nextLine();

        scanner.close();

        System.out.println();

        System.out.println("Today I went to a " + adjective1 + " zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3 + "!");

    }
}
