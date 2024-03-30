/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportGenerator {

    private static final Logger LOGGER = Logger.getLogger(ReportGenerator.class.getName());

    public void generateCoursesReport(List<Courses> courses, ReportFormat format) {
        if (courses == null || courses.isEmpty()) {
            LOGGER.log(Level.WARNING, "No courses provided for report generation.");
            return;
        }

        switch (format) {
            case TXT:
                writeToFile("course_report.txt", formatCourseReport(courses));
                break;
            case CSV:
                writeToFile("course_report.csv", formatCourseReport(courses));
                break;
            case CONSOLE:
                System.out.println(formatCourseReport(courses));
                break;
            default:
                LOGGER.log(Level.WARNING, "Invalid report format: {0}", format);
        }
    }

    public void generateStudentsReport(List<Students> students, ReportFormat format) {
        switch (format) {
            case TXT:
                writeToFile("student_report.txt", formatStudentReport(students));
                break;
            case CSV:
                writeToFile("student_report.csv", formatStudentReport(students));
                break;
            case CONSOLE:
                System.out.println(formatStudentReport(students));
                break;
            default:
                LOGGER.log(Level.WARNING, "Invalid report format");
        }
    }

    public void generateLecturersReport(List<Lecturers> lecturers, ReportFormat format) {
        switch (format) {
            case TXT:
                writeToFile("lecturer_report.txt", formatLecturerReport(lecturers));
                break;
            case CSV:
                writeToFile("lecturer_report.csv", formatLecturerReport(lecturers));
                break;
            case CONSOLE:
                System.out.println(formatLecturerReport(lecturers));
                break;
            default:
                LOGGER.log(Level.WARNING, "Invalid report format");
        }
    }


    private String formatCourseReport(List<Courses> courses) {
        StringBuilder report = new StringBuilder();
        // Format the course report data
        for (Courses course : courses) {
            report.append(course.toString()).append("\n");
        }
        return report.toString();
    }

    private String formatStudentReport(List<Students> students) {
        StringBuilder report = new StringBuilder();
        // Format the student report data
        for (Students student : students) {
            report.append(student.toString()).append("\n");
        }
        return report.toString();
    }

    private String formatLecturerReport(List<Lecturers> lecturers) {
        StringBuilder report = new StringBuilder();
        // Format the lecturer report data
        for (Lecturers lecturer : lecturers) {
            report.append(lecturer.toString()).append("\n");
        }
        return report.toString();
    }

    private void writeToFile(String fileName, String data) {
        // Write the report data to a file
        // Implementation details omitted
    }

    public enum ReportFormat {
        TXT,
        CSV,
        CONSOLE
    }
}
