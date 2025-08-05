package TemperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //variables


        double userTemperature;
        double finalTemperature;
        String unit;

        Scanner scanner = new Scanner(System.in);
        // welcome message
        System.out.println("Welcome to temperature converter!");
        System.out.print("Convert to Celsius (C) or Fahrenheit (F)? (Type in C/F): ");

        unit = scanner.next().toUpperCase();


        //converting
        System.out.print("Enter your temperature value: ");
        userTemperature = scanner.nextDouble();
        //ternary operator
        finalTemperature = (unit.equalsIgnoreCase("C") ? (((userTemperature - 32) * 5) / 9) : ((userTemperature * 5) / 9) + 32);

        System.out.printf("The result is %.2f°%s!", finalTemperature, unit);



        scanner.close();




    }
}
