package ShoppingCartProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String item;
        int quantity;
        double price;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("How many items would you like to buy? ");
        quantity = scanner.nextInt();

        System.out.print("What is the price for one? ");
        price = scanner.nextDouble();

        result = quantity * price;

        System.out.println();
        System.out.println("You've bought " + quantity + " " + item + "/s");
        System.out.printf("Your total price is $%.1f", result);


        scanner.close();

    }
}
