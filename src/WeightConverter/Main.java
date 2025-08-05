package WeightConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //variables
        int option;
        double enteredWeight;
        double newWeight;
        double kgMultiplyer = 2.2046226218488;
        double lbsMultiplyer =  0.45359237;
        boolean isValidChoice = false;
        //creating a scanner
        Scanner scanner = new Scanner(System.in);

        //initial user prompt
        System.out.println("Welcome to weight converter. Choose an option.");
        System.out.println("1 - kgs to lbs\n2 - lbs to kgs");

        //execution
        do {
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter the weight in kgs: ");
                enteredWeight = scanner.nextDouble();
                newWeight = enteredWeight * kgMultiplyer;
                isValidChoice = true;
                System.out.printf("%.2f kg in lbs is: %.2f", enteredWeight, newWeight);
            }
            else if (option == 2) {
                System.out.print("Enter the weight in lbs: ");
                enteredWeight = scanner.nextDouble();
                newWeight = enteredWeight * lbsMultiplyer;
                isValidChoice = true;
                System.out.printf("%.2f lbs in kg is: %.2f", enteredWeight, newWeight);
            }
            else {
                System.out.println("Invalid input. You should enter either 1 or 2\n");
            }
        }
        while (!isValidChoice);



        scanner.close();

    }

}
