/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.Scanner;

/**
 *
 * @author amand
 */
public class MenuSystem {

    private final DBConnector dbConnector;
    private final Scanner scanner;

    // Constructor
    public MenuSystem(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
        this.scanner = new Scanner(System.in);
    }

    // Method to display the main menu options
    public void displayMainMenu() {
        System.out.println("Welcome to the Course Management System!");
        System.out.println("Select an option:");
        System.out.println("1. Connect to Admin Account");
        System.out.println("2. Connect to Office Account");
        System.out.println("3. Connect to Lecturer Account");
        System.out.println("4. Exit Menu");
    }

// Method to handle user input and perform corresponding actions
    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMainMenu(); // Display main menu

            // Get user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Perform actions based on user input
            switch (choice) {
                case 1:
                    connectToAdmin();
                    break;
                case 2:
                    connectToOffice();
                    break;
                case 3:
                    connectToLecturer();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    // Method to connect to the Admin Account
    private void connectToAdminAccount(Scanner scanner) {
        System.out.println("Welcome to Admin Account");
        System.out.print("Please enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();
        // checking username and password
        if (username.equals("admin") && password.equals("java")) {
            System.out.println("Welcome to Admin account");
            // Display Admin menu
            displayAdminMenu();
        } else {
            System.out.println("Invalid username or password Please try again.");
        }
    }
    private void displayAdminMenu() {
        // Display Admin options
        System.out.println("Select an option:");
        System.out.println("1. Manage User Accounts");
        System.out.println("2. Change Username and Password");
        System.out.println("3. Return to Main Menu");

     int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Perform actions based on user input
        switch (choice) {
            case 1:
                manageUserAccounts();
                break;
            case 2:
                changeUsernameAndPassword();
                break;
            case 3:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private void connectToOffice() {
        // Check username and password
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("java")) {
            System.out.println("Welcome to Office Account");
            // Display Office menu
            displayOfficeMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void displayOfficeMenu() {
        // Implement Office menu options
        System.out.println("1 - Generate Courses Report");
        System.out.println("2 - Generate Students Report");
        System.out.println("3 - Generate Lecturers Report");
        System.out.println("4 - Change username and password");
        System.out.println("5 - Log out");
        int officeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        switch (officeChoice) {
            case 1:
                generateCoursesReport();
                break;
            case 2:
                generateStudentsReport();
                break;
            case 3:
                generateLecturersReport();
                break;
            case 4:
                changeUsernameAndPassword();
                break;
            case 5:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    private void connectToLecturer() {
        // Check username and password
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("java")) {
            System.out.println("Welcome to Lecturer Account");
            // Display Lecturer menu
            displayLecturerMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void displayLecturerMenu() {
        // Implement Lecturer menu options
        System.out.println("1 - Generate Lecturer Report");
        System.out.println("2 - Change username and password");
        int lecturerChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        switch (lecturerChoice) {
            case 1:
                generateLecturerReport();
                break;
            case 2:
                changeUsernameAndPassword();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void manageUserAccounts() {
        // Implement user account management functionality
        System.out.println("Managing user accounts...");
        // Add, modify, delete users logic here
    }
        
    private void changeUsernameAndPassword() {
    // Implement change username and password functionality
    System.out.println("Changing username and password...");
    // Logic to change username and password
}


    private void generateCoursesReport() {
        // Implement functionality to generate Courses Report
        System.out.println("Generating Courses Report...");
        // Retrieve data from database and format report
    }

    private void generateStudentsReport() {
        // Implement functionality to generate Students Report
        System.out.println("Generating Students Report...");
        // Retrieve data from database and format report
    }

    private void generateLecturersReport() {
        // Implement functionality to generate Lecturers Report
        System.out.println("Generating Lecturers Report...");
        // Retrieve data from database and format report
    }

    private void generateLecturerReport() {
        // Implement functionality to generate Lecturer Report for the logged-in lecturer
        System.out.println("Generating Lecturer Report...");
        // Retrieve data from database for the logged-in lecturer and format report
    }

    private void connectToAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  


}
