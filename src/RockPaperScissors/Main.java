package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] choices = {"rock", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continuePlaying;



        System.out.println("************************");
        System.out.println("ROCK PAPER SCISSORS GAME");
        System.out.println("************************");

        do {
            String computerChoice;
            String userChoice = "";



            System.out.print("Enter your move: rock/paper/scissors: ");
            while (!(userChoice.equalsIgnoreCase("rock")) &&
                    !(userChoice.equalsIgnoreCase("paper")) &&
                    !(userChoice.equalsIgnoreCase("scissors"))) {
                userChoice = scanner.nextLine();
                if (!(userChoice.equalsIgnoreCase("rock")) &&
                        !(userChoice.equalsIgnoreCase("paper")) &&
                        !(userChoice.equalsIgnoreCase("scissors"))) {
                    System.out.println("Invalid choice. Enter one of the named options.");
                }
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("You: " + userChoice + " |VS| Computer: " + computerChoice);


            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("*It's a tie*");
            }
            //all win conditions
            else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock") ||
                    userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors") ||
                    userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
                System.out.println("*You win!*");
            } else {
                System.out.println("*You lose!*");
            }


            continuePlaying = "";
            while (!continuePlaying.equalsIgnoreCase("y") &&
                    (!continuePlaying.equalsIgnoreCase("n"))) {
                System.out.println("Play again? (y/n)");
                continuePlaying = scanner.nextLine();

                if (!continuePlaying.equalsIgnoreCase("y") &&
                        (!continuePlaying.equalsIgnoreCase("n"))){
                    System.out.println("invalid choice. Enter y or n");
                }
            }


        } while (!continuePlaying.equalsIgnoreCase("n"));

        System.out.println("Okay, bye!");
        scanner.close();

    }
}
