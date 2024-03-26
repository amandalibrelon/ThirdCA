/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amand
 */
public class Course { // class to represent courses
    
    private String courseName;
    private String program;
    private String roomAssignment;
    private List<Student> enrolledStudents;
    private Lecturer lecturer;
    
    
    // constructor
    public Course(String courseName, String program, String roomAssignment, Lecturer lecturer){
       this.courseName = courseName;
       this.program = program; 
       this.roomAssignment = roomAssignment; 
       this.lecturer = lecturer;
       this.enrolledStudents = new ArrayList<>();
       
    }
    // Getters and setters
 

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getRoomAssignment() {
        return roomAssignment;
    }

    public void setRoomAssignment(String roomAssignment) {
        this.roomAssignment = roomAssignment;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
    
