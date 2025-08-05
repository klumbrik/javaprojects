package CompoundInterestCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Variables
        double principal = 0;
        double rate = 0;
        int years = 0;
        double amount = 0;

        //Enter values
        System.out.print("Enter the principal value: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (%): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        //calculating
        amount = principal * Math.pow((1 + rate), years);

        System.out.printf("The final amount after %d years is %f", years, amount);

        //closing the scanner
        scanner.close();
    }
}
