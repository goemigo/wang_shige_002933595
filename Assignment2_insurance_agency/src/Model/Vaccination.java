/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class Vaccination {
    String vaccineName;
    Boolean courseCompleted;
    
    public Vaccination(){
        this.vaccineName = "N/A";
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public Boolean getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompletes(Boolean courseCompletes) {
        this.courseCompleted = courseCompletes;
    }
    
    
}
