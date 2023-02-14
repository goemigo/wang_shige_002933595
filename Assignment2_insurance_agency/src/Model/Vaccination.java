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
        this.vaccineName = "N/A"; //default value
        this.courseCompleted = false;
    }
    
    public Vaccination(String name, Boolean completed){
        this.vaccineName = name;
        this.courseCompleted = completed;
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
    
    public String getCourseCompletedString(){
        if (this.courseCompleted){
            return "Yes";
        }
        return "No";
    }
    
//    @Override
//    public String toString(){
//        return String.valueOf(this.vaccineName);
//    }
}
