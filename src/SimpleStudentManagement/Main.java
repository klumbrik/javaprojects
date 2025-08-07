package SimpleStudentManagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students =  new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            running = inputOptions(scanner, students);
        }






        scanner.close();
    }


    static public boolean inputOptions(Scanner scanner, ArrayList<Student> students) {
        int userInput = 0;

        while (!(userInput > 0 && userInput < 5)) {
            System.out.println("Student Management System");
            System.out.println("1.Add Student\n2.View All Students\n3.Delete by ID\n4.Exit");
            System.out.print("Enter your choice: ");

            try {
                userInput = scanner.nextInt();
                if (userInput < 0) {
                    System.out.println("Please enter a positive value");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a NUMBER from 1 to 4");
                userInput = 0;
                scanner.nextLine();
            }
        }

        switch (userInput) {
            case 1 -> addStudent(scanner, students);
            case 2 -> viewStudents(scanner, students);
            case 3 -> deleteFromList(scanner, students);
            case 4 -> {
                System.out.println("Goodbye!");
                return false;
            }


        }
        return true;
    }



    static void addStudent(Scanner scanner, ArrayList<Student> students) {
        String name = " ";
        int id = 0;
        scanner.nextLine();
        boolean loop = true;
        while (loop) {
            try {
                System.out.print("Enter student's name: ");

                name = scanner.nextLine();

                System.out.print("Enter student's ID: ");

                id = scanner.nextInt();

                if (id < 0) {
                    System.out.println("ID can't be negative");
                }
                else {
                    loop = false;
                }
                scanner.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer number only for ID");
                scanner.nextLine();
            }
        }
        Student newStudent = new Student(name, id);

        students.add(newStudent);

        System.out.println("*****************************");
        System.out.println("Student added!");
        System.out.println("*****************************");


    }


    static void viewStudents(Scanner scanner, ArrayList<Student> students) {
        System.out.println("*****************************");
        if (students.isEmpty()) {
            System.out.println("No students here yet. You should add them");
        }
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + " - Name: " + student.getName());
        }
        System.out.println("*****************************");

    }



    static void deleteFromList(Scanner scanner, ArrayList<Student> students) {
        int id;
        int quantity = 0;

        System.out.println("*****************************");
        if (students.isEmpty()) {
            System.out.println("Nothing to delete. Add some students first!");
        }
        else {
            System.out.println("Enter  the Student's ID");

            id = scanner.nextInt();

            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getId() == id) {
                    iterator.remove();
                    quantity++;
                }
            }
            if (quantity < 1) {
                System.out.println("Couldn't find a student with such ID");
            }
            else {
                System.out.println(quantity + " student(s) with such ID has(have) been deleted");
            }

        }
        System.out.println("*****************************");

    }
}


