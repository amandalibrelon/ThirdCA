/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author amand
 */
public class DBConnector {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Trindade-91";
    
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
            //this logs exception or display a user-friendly error message
        } catch (SQLException e) {
            System.out.println("Failed to connect with database");
            e.printStackTrace();
        }
        
        return connection;
    }
    
    
}
