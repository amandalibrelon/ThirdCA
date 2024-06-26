/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class MenuSystem {

    private final DBConnector dbConnector;
    private final Scanner scanner;
    private final PasswordManager passwordManager;
    private final UserManager userManager;
    private final ReportGenerator reportGenerator;
    private final DatabaseHandler databaseHandler;
   

    // Constructor
    public MenuSystem(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
        this.scanner = new Scanner(System.in);
        this.passwordManager = new PasswordManager(); // Initialize PasswordManager
        this.userManager = new UserManager(dbConnector);
        this.reportGenerator = new ReportGenerator();
        this.databaseHandler = new DatabaseHandler();
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

    private void connectToAdmin() {
        //logic to connect to the admin account
        System.out.println("Connecting to Admin Account...");
        connectToAdminAccount(scanner);
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
                generateLecturersReport();
                break;
            case 2:
                changeUsernameAndPassword();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private void manageUserAccounts() {
        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Add User");
            System.out.println("2. Modify User");
            System.out.println("3. Delete User");
            System.out.println("4. Return to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addUserToDatabase();
                    break;
                case 2:
                    modifyUserInDatabase();
                    break;
                case 3:
                    deleteUserFromDatabase();
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void addUserToDatabase() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter role:");
        String role = scanner.nextLine();

        UserManager userManager = new UserManager(dbConnector);
        userManager.addUserToDatabase(username, password, role);
    }

    // Method to modify a user in the database
    private void modifyUserInDatabase() {
        System.out.println("Enter username of user to modify:");
        String username = scanner.nextLine();
        System.out.println("Enter new password:");
        String newPassword = scanner.nextLine();
        System.out.println("Enter new role:");
        String newRole = scanner.nextLine();

        UserManager userManager = new UserManager(dbConnector);
        userManager.modifyUserInDatabase(username, newPassword, newRole);
    }

    // Method to delete a user from the database
    private void deleteUserFromDatabase() {
        System.out.println("Enter username of user to delete:");
        String username = scanner.nextLine();

        UserManager userManager = new UserManager(dbConnector);
        userManager.deleteUserFromDatabase(username);
    }

    private void changeUsernameAndPassword() {
        // Get user input for current username, new username, and password
        System.out.println("Enter current username:");
        String currentUsername = scanner.nextLine();
        System.out.println("Enter new username:");
        String newUsername = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        // Call changeUsername method of PasswordManager
        passwordManager.changeUsername(currentUsername, newUsername, password);
    }

 // Method to generate Courses Report
    private void generateCoursesReport() {
        // Retrieve courses data from the database
        List<Courses> courses = databaseHandler.retrieveCoursesFromDatabase();
        // Generate Courses Report
        reportGenerator.generateCoursesReport(courses, ReportGenerator.ReportFormat.CONSOLE);
    }

    // Method to generate Students Report
    private void generateStudentsReport() {
        // Retrieve students data from the database
        List<Students> students = databaseHandler.retrieveStudentsFromDatabase();
        // Generate Students Report
        reportGenerator.generateStudentsReport(students, ReportGenerator.ReportFormat.CONSOLE);
    }

    // Method to generate Lecturers Report
    private void generateLecturersReport() {
        // Retrieve lecturers data from the database
        List<Lecturers> lecturers = databaseHandler.retrieveLecturersFromDatabase();
        // Generate Lecturers Report
        reportGenerator.generateLecturersReport(lecturers, ReportGenerator.ReportFormat.CONSOLE);
    }
}
