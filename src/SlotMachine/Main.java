package SlotMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************");
        System.out.println("SLOT MACHINE GAME");
        System.out.println("*****************");

        Scanner scanner = new Scanner(System.in);
        double betAmount;
        double goal = 1000;
        double balance = 500.0;
        double payout;
        boolean playAgain;
        String[] row;



        Menu menu = new Menu();

        do {
            menu.showBalance(balance, goal);
            do {
                betAmount = menu.requestAmount(scanner);
                balance = menu.substractBalance(balance, betAmount);
            }
            while (balance - betAmount < 0 || betAmount == 0);

            balance -= betAmount;

            menu.showBalance(balance, goal);

            row = menu.spinRow();
            payout = menu.winOrLose(row,betAmount);
            balance += payout;
            if (balance == 0) {
                break;
            }
            else if (balance >= goal) {
                break;
            }

            menu.showBalance(balance, goal);

            playAgain = menu.playAgain(scanner);

        } while (playAgain);

        if (balance >= goal) {
            System.out.println("YOU WON! " + "Your balance is: $" + balance);
        }
        else {
            System.out.println("Game over. " + "Your balance is: $" + balance);
        }




        scanner.close();
    }
}
