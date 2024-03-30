/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdca;

import java.util.List;

/**
 *
 * @author amand
 */
public class Lecturers {
    private String lecturerName;
    private UserRole role;
    private List<String> modulesTaught;
    private List<String> classesTaught;
    private List<String> studentsInModules;
    
    // Constructor
    public Lecturers( String lecturerName, UserRole role, List<String> modulesTaught, List<String> classesTaught, List<String> studentsInModules) {
   
        this.lecturerName = lecturerName;
        this.role = role;
        this.modulesTaught = modulesTaught;
        this.classesTaught = classesTaught;
        this.studentsInModules = studentsInModules;
    }
    

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<String> getModulesTaught() {
        return modulesTaught;
    }

    public void setModulesTaught(List<String> modulesTaught) {
        this.modulesTaught = modulesTaught;
    }

    public List<String> getClassesTaught() {
        return classesTaught;
    }

    public void setClassesTaught(List<String> classesTaught) {
        this.classesTaught = classesTaught;
    }
    
    public List<String> getStudentsInModules() {
        return studentsInModules;
    }
      public void setStudentsInModules(List<String> studentsInModules) {
        this.studentsInModules = studentsInModules;
    }
   
}

