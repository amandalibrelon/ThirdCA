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
public class Courses { // class to represent courses

    private String courseName;
    private String program;
    private String roomAssignment;
    private List<Students> enrolledStudents;
    private Lecturers lecturer;

    // constructor
    public Courses(String courseName, String program, String roomAssignment1, Lecturers lecturer1) {
        this.courseName = courseName;
        this.program = program;
        this.roomAssignment = roomAssignment;
        this.lecturer = lecturer;
        this.enrolledStudents = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Program: " + program + ", Room Assignment: " + roomAssignment;
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

    public List<Students> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Students> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Lecturers getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturers lecturer) {
        this.lecturer = lecturer;
    }
}
