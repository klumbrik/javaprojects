package SimpleCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vars
        double value1;
        double value2;
        String[] operations = {"+", "-", "*", "^", "/"};
        String choice;


        //user message
        System.out.println("This is a calculator!");

        System.out.print("Enter value 1: ");
        value1 = scanner.nextDouble();

        System.out.print("Enter value 2: ");
        value2 = scanner.nextDouble();

        System.out.println("Choose one of these operations: ");
        for (String operation : operations) {
            System.out.print(operation + " ");
        }
        System.out.print("My choice is: ");
        scanner.nextLine();
        choice = scanner.nextLine();

        System.out.println("Your result is: " + calculate(value1, value2, choice));



        scanner.close();


        //execution

    }

    static double calculate(double value1, double value2, String choice) {
        double result = 0;

        switch (choice) {
            case "+" -> result = value1 + value2;
            case "-" -> result = value1 - value2;
            case "*" -> result = value1 * value2;
            case "/" -> result = value1 / value2;
            case "^" -> result = Math.pow(value1, value2);
            default -> System.out.println("invalid operation");
        }
        return result;
    }

}
