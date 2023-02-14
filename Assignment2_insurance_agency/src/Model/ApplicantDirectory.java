/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

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
        applicants.add(applicant);
        
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
    
    public void delApp(Applicant app){
        this.applicants.remove(app);
    }
    
    public ArrayList<Applicant> searchByNameOrId(String firstName, String id){
        ArrayList<Applicant> applicantsFound = new ArrayList<Applicant>();
        
        if (id.isEmpty() && firstName.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please input a search criteria");
        }else if(id.isEmpty()){
            for (Applicant a: applicants){
                if (a.getFirstName().equals(firstName)){
                    applicantsFound.add(a);
                }
            }
        }else{
            for (Applicant a: applicants){
                if (a.getApplicantId() == Integer.valueOf(id)){
                    applicantsFound.add(a);
                }
            }
        }
            
        if(applicantsFound.size() == 0){
            JOptionPane.showMessageDialog(null,"No applicant found");
        }
            return applicantsFound;
    }
    
    public ArrayList<Applicant> searchAppByName(String name){
        ArrayList<Applicant> applicantsFound = new ArrayList<Applicant>();

        for (Applicant a: this.applicants){
            if (a.getFirstName().equals(name)){
                applicantsFound.add(a);
            }
        }    

        return applicantsFound;
        
    }
    

    

}
