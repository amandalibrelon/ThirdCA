/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PasswordManager {
    private Map<String, String> userCredentials; // Map to store username-password pairs

    public PasswordManager() {
        userCredentials = new HashMap<>();
    }

    // Method to authenticate a user
    public boolean authenticateUser(String username, String password) {
        String storedPassword = userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    // Method to add a new user
    public void addUser(String username, String password) {
        userCredentials.put(username, password);
    }

    // Method to change a user's password
    public void changePassword(String username, String currentPassword, String newPassword) {
        if (authenticateUser(username, currentPassword)) {
            userCredentials.put(username, newPassword);
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Failed to change password. Invalid current password.");
        }
    }

    // Method to change a user's username
    public void changeUsername(String currentUsername, String newUsername, String password) {
        if (authenticateUser(currentUsername, password)) {
            String userPassword = userCredentials.remove(currentUsername);
            userCredentials.put(newUsername, userPassword);
            System.out.println("Username changed successfully!");
        } else {
            System.out.println("Failed to change username. Invalid password.");
        }
    }

    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager();

        // Add some users (for demo purposes)
        passwordManager.addUser("admin", "java");
        passwordManager.addUser("office", "password123");
        passwordManager.addUser("lecturer", "securepass");

        Scanner scanner = new Scanner(System.in);

        // Ask user to enter username and password
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        // Authenticate user
        if (passwordManager.authenticateUser(username, password)) {
            System.out.println("Authentication successful!");

            // Provide options to change username or password
            System.out.println("Enter 1 to change username, 2 to change password:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                System.out.println("Enter new username:");
                String newUsername = scanner.nextLine();
                passwordManager.changeUsername(username, newUsername, password);
            } else if (choice == 2) {
                System.out.println("Enter current password:");
                String currentPassword = scanner.nextLine();
                System.out.println("Enter new password:");
                String newPassword = scanner.nextLine();
                passwordManager.changePassword(username, currentPassword, newPassword);
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }

        scanner.close();
    }
}