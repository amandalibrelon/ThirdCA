/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.List;

public class ReportGenerator {

    public void generateCourseReport(List<Course> courses, ReportFormat format) {
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
                System.out.println("Invalid report format");
        }
    }

    // Other methods for generating different types of reports

    private String formatCourseReport(List<Course> courses) {
        StringBuilder report = new StringBuilder();
        // Format the course report data
        return report.toString();
    }

    private void writeToFile(String fileName, String data) {
        // Write the report data to a file
    }

    public enum ReportFormat {
        TXT,
        CSV,
        CONSOLE
    }
}





    

