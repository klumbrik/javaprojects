package ContactBook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Contact> contacts = new HashMap<>();
        boolean running = true;


        while (running) {
            running = showMenu(scanner, contacts);
        }
    }

    static boolean showMenu(Scanner scanner, HashMap<String, Contact> contacts) {
        System.out.println("==== Contact Book ====");
        System.out.println("1.Add contact\n2.View all\n3.Search by name\n4.Delete by name\n5.Exit");

        int userInput = getIntInput(scanner);

        switch (userInput) {
            case 1 -> addContact(scanner, contacts);
            case 2 -> viewContact(contacts);
            case 3 -> searchContact(scanner, contacts);
            case 4 -> deleteContact(scanner, contacts);
            case 5 -> {
                System.out.println("Goodbye!");
                return false;
            }
            default -> System.out.println("Invalid input");
        }
        return true;
    }


    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number (1-5).");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void addContact(Scanner scanner, HashMap<String, Contact> contacts) {
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine().trim();

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        Contact contact = new Contact(name, phone, email);

        contacts.put(name, contact);

        System.out.println("Contact added!");
    }


    private static void viewContact(HashMap<String, Contact> contacts) {
        System.out.println("===== All Contacts =====");
        if (contacts.isEmpty()) {
            System.out.println("No contacts here. You should add them.");
        }
        else {
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }



    private static void searchContact(Scanner scanner, HashMap<String, Contact> contacts){
        scanner.nextLine();
        System.out.println("Enter the name to search");

        String name = scanner.nextLine().trim();
        Contact contact = contacts.get(name);

        if (contact != null) {
            System.out.print("Contact found - ");
            System.out.println(contact);
        }
        else {
            System.out.println("Contact not found");
        }
    }


    private static void deleteContact(Scanner scanner, HashMap<String, Contact> contacts){
        scanner.nextLine();
        System.out.println("Enter the name to delete");

        String name = scanner.nextLine().trim();

        if (contacts.remove(name) != null) {
            System.out.println("Contact deleted");
        }
        else {
            System.out.println("Contact with such name not found");
        }
    }
}


