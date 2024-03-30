/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author amand
 */

    
    // Enum for user roles
enum UserRole {
    ADMIN,
    OFFICE,
    LECTURER
}

// Class to represent a user
public class User {
    private String username;
    private String password;
    private UserRole role;

    public User(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }

    // Method to change password
    public void changePassword(String newPassword) {
        // Implement password change logic here
        this.password = newPassword;
    }
    
    class UserAuthentication {
    private Map<String, User> users;

    public UserAuthentication() {
        // Initialize users (this can be loaded from a database)
        users = new HashMap<>();
        users.put("admin", new User("admin", "admin123", UserRole.ADMIN));
        users.put("office", new User("office", "office123", UserRole.OFFICE));
        users.put("lecturer", new User("lecturer", "lecturer123", UserRole.LECTURER));
    }

    // Method to authenticate users
    public User authenticate(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null; // Authentication failed
    }

    // Method to change password
    public void changePassword(String username, String newPassword) {
        User user = users.get(username);
        if (user != null) {
            user.changePassword(newPassword);
        }
    }

    // Method to manage users (for Admin role)
    public void manageUser(String action, String username, String password, UserRole role) {
        if (action.equals("add")) {
            users.put(username, new User(username, password, role));
        } else if (action.equals("modify")) {
            User user = users.get(username);
            if (user != null) {
                user.changePassword(password);
                user.role = role;
            }
        } else if (action.equals("delete")) {
            users.remove(username);
        }
    }
}
}
