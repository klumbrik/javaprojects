package DiceRoller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rollTimes;
        char userChoice = ' ';
        Scanner scanner = new Scanner(System.in);



        System.out.println("**********************");
        System.out.println("     *DICE ROLLER*    ");
        System.out.println("**********************");

        while (userChoice != 'n') {
            System.out.print("How many dice do you want to roll? ");

            rollTimes = scanner.nextInt();

            System.out.println("\nLET'S ROCK!\n");




            for (int i = 1; i <= rollTimes; i++) {
                Die die = new Die();
                die.Roll();
            }

            System.out.print("\nDo you want to roll more? (y/n) ");

            userChoice = scanner.next().toLowerCase().charAt(0);

        }
        System.out.println("Alright, that was fun!");
        scanner.close();

//add timers?

    }
}
