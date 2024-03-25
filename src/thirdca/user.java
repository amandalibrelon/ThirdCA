/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

/**
 *
 * @author amand
 */
class user {
    
    // Enum for user roles
enum UserRole {
    ADMIN,
    OFFICE,
    LECTURER
}

// Class to represent a user
class User {
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
    
}
}