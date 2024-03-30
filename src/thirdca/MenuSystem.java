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

    // Constructor
    public MenuSystem(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    // Method to display the main menu options
    public void displayMainMenu() {
        System.out.println("Welcome to the Course Management System!");
        System.out.println("Press 1 - to connect to Admin Account");
        System.out.println("Press 2 - to connect to Office Account");
        System.out.println("Press 3 - to connect to Lecturer Account");
        System.out.println("Press 4 - to exit menu");
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

    private void connectToAdmin() {
        // Check username and password
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("java")) {
            System.out.println("Welcome to Admin account");
            // Display Admin menu
            displayAdminMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void connectToOffice() {
        // Check username and password
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("java")) {
            System.out.println("Welcome to Office Account");
            // Display Office menu
            displayOfficeMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void connectToLecturer() {
        // Check username and password
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("java")) {
            System.out.println("Welcome to Lecturer Account");
            // Display Lecturer menu
            displayLecturerMenu();
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void displayAdminMenu() {
        // Implement Admin menu options
        System.out.println("Press 1 - to manage user accounts");
        System.out.println("Press 2 - to change username and password");
        int adminChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        switch (adminChoice) {
            case 1:
                manageUserAccounts();
                break;
            case 2:
                changeUsernameAndPassword();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void displayOfficeMenu() {
        // Implement Office menu options
        System.out.println("Press 1 - to generate Courses Report");
        System.out.println("Press 2 - to generate Students Report");
        System.out.println("Press 3 - to generate Lecturers Report");
        System.out.println("Press 4 - to change username and password");
        System.out.println("Press 5 - to log out");
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

    private void displayLecturerMenu() {
        // Implement Lecturer menu options
        System.out.println("Press 1 - to generate Lecturer Report");
        System.out.println("Press 2 - to change username and password");
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

   
    

}