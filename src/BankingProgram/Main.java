package BankingProgram;

import java.util.Scanner;

public class Main {

    static double Balance = 0;

    public static void main(String[] args) {

        System.out.println("BANKING PROGRAM");
        System.out.println("***************************************");
        System.out.println("Hello, what would you like to do today?");
        mainMenu();
    }


    static void mainMenu() {

        //vars
        Scanner scanner = new Scanner(System.in);
        char userContinue = ' ';

        //user message
        while (userContinue != 'n') {
            System.out.println("***************************************");
            System.out.println("1 - show balance\n2 - deposit to account\n3 - withdraw money");
            System.out.print("My choice is: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> displayBalance();
                case 2 -> {
                    System.out.println("***************************************");
                    System.out.print("Enter your deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                }
                case 3 -> {
                    System.out.println("***************************************");
                    System.out.print("Enter your withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);

                }
                default -> System.out.print("invalid option");
            }

            //ask if user wants to continue

            System.out.println("Continue? (y/n)");
            userContinue = scanner.next().toLowerCase().charAt(0);


        }

        System.out.println("Thanks for banking with us!");
        System.out.println("***************************************");

        scanner.close();

    }



    static void displayBalance() {
        System.out.println("***************************************");
        System.out.printf("Cool, your balance is: $%.2f\n", Balance);
        System.out.println("***************************************");
    }

    static void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("the amount can't be negative or zero");
        }
        else {
            Balance += amount;
            System.out.println("Balance topped up successfully!");
        }

    }

    static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("the amount can't be negative or zero");
        }
        else if (Balance - amount < 0) {
            System.out.println("insufficient funds");
        }
        else {
            Balance -= amount;
            System.out.println("Withdrawn successfully!");
        }
    }
}

