/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class Pet {
    private String petName;
    private int age;
    private String gender;
    private String petType;
    private String breed;
    
    private VaccinationHistory vaccines;
    private InsurancePlan isurancePlanOpted;
    
    public Pet(String name, int age, String gender, String type, String breed){
        this.petName = name;
        this.age = age;
        this.gender = gender;
        this.petType = type;
        this.breed = breed;
        
        this.vaccines = new VaccinationHistory();
    }

    public VaccinationHistory getVaccines() {
        
        return vaccines;
    }

    public InsurancePlan getIsurancePlanOpted() {
        return isurancePlanOpted;
    }
    
    public void assignInsurance(InsurancePlan insurancePlan){
        this.isurancePlanOpted = insurancePlan;
    }

    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPetType() {
        return petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsurancePlanOpted(InsurancePlan isurancePlanOpted) {
        this.isurancePlanOpted = isurancePlanOpted;
    }
    
    
    

}
