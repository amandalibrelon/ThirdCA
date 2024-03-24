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
    }
    
    
    
    
    
    private final String username;
    private final String password;
    private final UserRole role;
   
    
    class User {
        private String username;
        private String password;
        private UserRole role;
        
    }
     public UserAuthentication(String username, String password, UserRole role) {
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
            
      enum UserRole {
        ADMIN,
        OFFICE,
        LECTURER
    }       
            
            
            
}
