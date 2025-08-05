package SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class Menu {


    double requestAmount(Scanner scanner) {
        double betAmount;

        System.out.println("Enter your bet amount: ");

        betAmount = scanner.nextDouble();

        return betAmount;
    }

    void showBalance(double balance, double goal) {
        System.out.println("Your balance now is $" + balance);
        System.out.println("You need to reach $" + goal + " to win!");
        System.out.println("Symbols: 💖, 🐉, 🧨, 🎁, ✨");
    }



    double substractBalance(double balance, double betAmount) {
        if (betAmount == 0) {
            System.out.println("You can't bet 0");
        }
        else if (betAmount <= balance) {
                System.out.println("You're betting: $" + betAmount);
        } else {
            System.out.println("insufficient balance");
        }
        return balance;
    }


    String[] spinRow() {

        Random random = new Random();
        System.out.println();
        System.out.println("*****************");
        System.out.println("Spinning...");
        String[] symbols = {"💖", "🐉", "🧨", "🎁", "✨"};
        String[] row = new String[3];

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(0, 5)];
        }

        System.out.println(" " + String.join("|", row));


        return row;
    }

    double winOrLose(String[] row, double bet) {
        double payout = 0;
        if (row[0].equals(row[1]) || (row[1].equals(row[2]))) {
            if ((row[1].equals(row[2])) && (row[0].equals(row[1])) ){
                switch (row[0]) {
                    case "💖" -> {
                        payout = bet * 2;
                        System.out.println("You won x2!");
                    }
                    case "🐉" -> {
                        payout = bet * 3;
                        System.out.println("You won x3!");
                    }
                    case "🧨" -> {
                        payout = bet * 4;
                        System.out.println("You won x4");
                    }
                    case "🎁" -> {
                        payout = bet * 5;
                        System.out.println("You won x5!");
                    }
                    case "✨" -> {
                        payout = bet * 10;
                        System.out.println("You won x10!");
                    }
                }
            }
            else {
                System.out.println("You won x1.5!");
                payout = bet * 1.5;
                System.out.println();
            }
        }
        else {
            System.out.println("Sorry, you lost this one");
        }
        System.out.println("*****************");
        System.out.println();

        return payout;
    }

    boolean playAgain(Scanner scanner) {
        System.out.println("Do you wish to spin more? (y/n)");
        String playerChoice = " ";
        do {
            playerChoice = scanner.next();
            if (playerChoice.equalsIgnoreCase("y")) {
                return true;
            }
            else if (playerChoice.equalsIgnoreCase("n")) {
                return false;
            }
            else {
                System.out.println("You should enter either y or n");
            }
        } while (!playerChoice.equalsIgnoreCase("y") && !playerChoice.equalsIgnoreCase("n"));

        return false;
    }

}