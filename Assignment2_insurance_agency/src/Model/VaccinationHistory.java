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
public class VaccinationHistory {
    ArrayList<Vaccination> vaccinationhistory;
    
    public VaccinationHistory(){
        this.vaccinationhistory = new ArrayList<Vaccination>();
    }

    public ArrayList<Vaccination> getVaccinationhistory() {
        return vaccinationhistory;
    }
    
    public Vaccination addVaccine(String name,Boolean completed){
        Vaccination vac = new Vaccination(name,completed);
        vaccinationhistory.add(vac);
        return vac;
    }
    
}
