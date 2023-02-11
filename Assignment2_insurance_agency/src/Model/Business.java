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
    InsurancePlanCatalog insurancePlanDirectory;
    
    public Business(){
        this.applicantDirectory = new ApplicantDirectory();
        this.insurancePlanDirectory = new InsurancePlanCatalog();
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public InsurancePlanCatalog getInsurancePlanDirectory() {
        return insurancePlanDirectory;
    }
    
    
}
