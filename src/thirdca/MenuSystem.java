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

    MenuSystem(DBConnector dbConnector) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private MenuSystem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Method to display the main menu options
    public void displayMainMenu() {
        System.out.println("Welcome to the Course Management System!");
        System.out.println("Select an option:");
        System.out.println("1. Generate Reports");
        System.out.println("2. Manage User Accounts");
        System.out.println("3. Change Password");
        System.out.println("4. Exit");
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
                    generateReports();
                    break;
                case 2:
                    manageUserAccounts();
                    break;
                case 3:
                    changePassword();
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

    // Method to generate reports
    private void generateReports() {
        // Implement report generation functionality
        System.out.println("Generating reports...");
    }

    // Method to manage user accounts
    private void manageUserAccounts() {
        // Implement user account management functionality
        System.out.println("Managing user accounts...");
    }

    // Method to change password
    private void changePassword() {
        // Implement password change functionality
        System.out.println("Changing password...");
    }

    // Main method to run the menu system
    public static void main(String[] args) {
        MenuSystem menuSystem = new MenuSystem();
        menuSystem.handleUserInput();
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}