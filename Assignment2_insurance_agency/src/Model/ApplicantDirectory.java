/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author emi
 */
public class ApplicantDirectory {
    ArrayList<Applicant> applicants;
    
    public ApplicantDirectory(){
        this.applicants = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicants() {
        return applicants;
    }
    
    public Applicant createApplicant(int id, String fn, String ln, Date date){
        Applicant applicant = new Applicant(id, fn, ln, date);
        return applicant;
    }
    
    public Boolean checkApplicantUnique(int id){
        for (Applicant a: applicants){
            if (a.getApplicantId() == id){
                return false;
            }
        }
        return true;
    }
}
