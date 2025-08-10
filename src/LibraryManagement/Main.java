package LibraryManagement;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    static ArrayList<Book> library = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add some sample books
        library.add(new Book("1984", "George Orwell", Genre.FICTION, true));
        library.add(new Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, true));

        // Main menu
        boolean running = true;
        while (running) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. View all books");
            System.out.println("2. Search books by genre");
            System.out.println("3. Add a new book");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> viewAllBooks();
                case 2 -> searchByGenre();
                case 3 -> addBook();
                case 4 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
        System.out.println("Exiting Library. Goodbye!");
    }

    static void viewAllBooks() {
        library.forEach(System.out::println);
    }

    static void searchByGenre() {
        System.out.println("Enter genre (FICTION, SCIENCE, HISTORY, FANTASY, BIOGRAPHY):");
        String genreInput = scanner.nextLine().toUpperCase();

        try {
            Genre genre = Genre.valueOf(genreInput);
            List<Book> filtered = library.stream()
                    .filter(book -> book.getGenre() == genre)
                    .collect(Collectors.toList());

            if (filtered.isEmpty()) {
                System.out.println("No books found in this genre.");
            } else {
                filtered.forEach(System.out::println);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid genre.");
        }
    }

    static void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter genre: ");
        Genre genre;
        try {
            genre = Genre.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid genre. Book not added.");
            return;
        }

        library.add(new Book(title, author, genre, true));
        System.out.println("Book added!");
    }
}


