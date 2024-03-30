/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thirdca;
import thirdca.DBConnector;

/**
 * Main class for the ThirdCA application.
 */
public class ThirdCA {

   public static void main(String[] args) {
        DBConnector dbConnector = new DBConnector();
        MenuSystem menuSystem = new MenuSystem(dbConnector);
        menuSystem.handleUserInput();
    }
    }



