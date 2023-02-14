/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author emi
 */
public class Applicant {
   private int applicantId;
   private String firstName;
   private String lastName;
   private Date applicationDate;
   
   private Pet pet;
   
   public Applicant(int id, String fn, String ln, Date date){
       this.applicantId = id;
       this.firstName = fn;
       this.lastName = ln;
       this.applicationDate = date;
   }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Pet getPet() {
        return pet;
    }
   
    public Pet addPet(String name, int age, String gender, String type, String breed){
        this.pet = new Pet(name, age, gender, type, breed);
        return this.pet;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.applicantId);
    }
   
}
