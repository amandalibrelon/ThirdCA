/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {

    private Map<String, User> users;

    public UserAuthentication() {
        //initialize users 
        users = new HashMap<>();
        users.put("admin", new User("admin", "admin123", UserRole.ADMIN));
        users.put("office", new User("office", "office123", UserRole.OFFICE));
        users.put("lecturer", new User("lecturer", "lecturer123", UserRole.LECTURER));
    }

    //Method to authenticate users
    public boolean autheticate(String username, String password) {
        user user = users.get(username);
        return users != null && user.getPassword().equals(password);

    }
  

    //method to manage users (for Admin role)
    public void manageUser(String action, String username, String password, UserRole role) {
        if (action.equals("add")) {
            users.put(username, new User(username, password, role));
        } else if (action.equals("change")) {
            User user = users.get(username);
            if (user != null) {
                user.changePassword(password);
                user.role = role;
            }

        } else if (action.equals("delete")) {
            users.remove(username);
        }
    }

    enum UserRole {
        ADMIN,
        OFFICE,
        LECTURER
    }

    //class to repredent a user
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

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
    
    //method to change password for the user
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    }
}