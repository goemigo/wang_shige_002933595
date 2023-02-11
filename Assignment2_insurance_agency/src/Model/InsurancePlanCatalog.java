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
public class InsurancePlanCatalog {
    private ArrayList<InsurancePlan> insurancePlans;
    
    public InsurancePlanCatalog(){
        this.insurancePlans = new ArrayList<InsurancePlan>();
    }

    public ArrayList<InsurancePlan> getInsurancePlans() {
        return insurancePlans;
    }
    
    public InsurancePlan createInsurancePlan(int id, String name, float costPerMonth){
        InsurancePlan plan = new InsurancePlan(id,name,costPerMonth);  
        this.insurancePlans.add(plan);
        return plan;
    }
    
    public Boolean checkInsuranceIdUnique(int id){
        for (InsurancePlan ip: insurancePlans){
            if(ip.getPlanId() == id){
                return false;
            }
        }
        return true;
    }
    
}
