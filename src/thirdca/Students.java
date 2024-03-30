/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

/**
 *
 * @author amand
 */

// Class to represent students
public class Student {
    private String studentId;
    private String studentName;
    private String currentModules;
    private String repeatModules;
    private String completedModules;
    private String programme;

    // Constructor
    public Student(String studentId, String studentName, String currentModules, String repeatModules, String completedModules, String programme) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.currentModules = currentModules;
        this.repeatModules = repeatModules;
        this.completedModules = completedModules;
        this.programme = programme;
    }

   // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCurrentModules() {
        return currentModules;
    }

    public void setCurrentModules(String currentModules) {
        this.currentModules = currentModules;
    }

    public String getRepeatModules() {
        return repeatModules;
    }

    public void setRepeatModules(String repeatModules) {
        this.repeatModules = repeatModules;
    }

    public String getCompletedModules() {
        return completedModules;
    }

    public void setCompletedModules(String completedModules) {
        this.completedModules = completedModules;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    
    // toString method for easy debugging

    /**
     *
     * @return
     */
    @Override
     public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", currentModules='" + currentModules + '\'' +
                ", repeatModules='" + repeatModules + '\'' +
                ", completedModules='" + completedModules + '\'' +
                ", programme='" + programme + '\'' +
                '}';
    }

    // Example usage
    public static void main(String[] args) {
        // Create a new Student object using the constructor
        Student student = new Student("S001", "John Doe", "Maths, English", "Physics", "History", "Computer Science");

        // Print student information
        System.out.println(student);
    }
}
    
    
