/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

  // Method to retrieve courses from the database
    public List<Courses> retrieveCoursesFromDatabase() {
        List<Courses> coursesList = new ArrayList<>();

        try (Connection connection = DBConnector.getConnection()) {
            String query = "SELECT * FROM courses"; // Assuming your table name is "courses"
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    // Retrieve data for each course from the result set
                    String courseName = resultSet.getString("course_name");
                    String program = resultSet.getString("programme");
                    String roomAssignment = resultSet.getString("room_assignment");
                    String lecturerName = resultSet.getString("instructor"); // Assuming lecturer name is stored in the database
                    // Retrieve enrolled students for the course (if needed)

                    // Create a Lecturer object for the course
                    Lecturers lecturer = new Lecturers(lecturerName); // Assuming Lecturers class has a constructor that accepts lecturer name

                    // Create a Courses object and add it to the list
                    Courses course = new Courses(courseName, program, roomAssignment, lecturer);
                    coursesList.add(course);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return coursesList;
    }
    public List<Students> retrieveStudentsFromDatabase() {
        List<Students> studentsList = new ArrayList<>();
        try (Connection connection = DBConnector.getConnection()) {
            String query = "SELECT * FROM students";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String studentId = resultSet.getString("student_id");
                    String studentName = resultSet.getString("student_name");
                    String currentModules = resultSet.getString("current_modules");
                    String repeatModules = resultSet.getString("modules_to_repeat");
                    String completedModules = resultSet.getString("completed_modules");
                    String programme = resultSet.getString("programme");
                    Students student = new Students(studentId, studentName, currentModules, repeatModules, completedModules, programme);
                    studentsList.add(student);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentsList;
    }
    
     public List<Lecturers> retrieveLecturersFromDatabase() {
        List<Lecturers> lecturersList = new ArrayList<>();
        try (Connection connection = DBConnector.getConnection()) {
            String query = "SELECT * FROM lecturers";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String lecturerName = resultSet.getString("lecturer_name");
                    // Assuming you have other fields in the lecturers table
                    // Retrieve those fields and create Lecturers object
                    Lecturers lecturer = new Lecturers(lecturerName /*, other fields */);
                    lecturersList.add(lecturer);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lecturersList;
    }
}
