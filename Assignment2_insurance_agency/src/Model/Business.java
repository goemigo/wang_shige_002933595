package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emi
 */
public class Business {
    ApplicantDirectory applicantDirectory;
    InsurancePlanDirectory insurancePlanDirectory;
    
    public Business(){
        this.applicantDirectory = new ApplicantDirectory();
        this.insurancePlanDirectory = new InsurancePlanDirectory();
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public InsurancePlanDirectory getInsurancePlanDirectory() {
        return insurancePlanDirectory;
    }
    
    
}
