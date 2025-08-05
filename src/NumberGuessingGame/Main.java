package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //vars
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        int userGuess = 0;
        int theNumber = random.nextInt(1, 101);


        System.out.println("Welcome to Number Guessing Game!");

        do {
            System.out.printf("Enter a number between %d and %d: ", lowerBound, upperBound);

            userGuess = scanner.nextInt();

            if (userGuess > theNumber) {
                System.out.println(userGuess + " is too high");
            }
            else if (userGuess < theNumber) {
                System.out.println(userGuess + " is too low");
            }
            else {
                System.out.println("Absolutely correct! The number is " + theNumber + "!");
            }
        }
        while (!(userGuess == theNumber));

    }


}
