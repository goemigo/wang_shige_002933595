/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

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
    
    
}
