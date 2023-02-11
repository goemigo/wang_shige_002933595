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
public class InsurancePlanDirectory {
    ArrayList<InsurancePlan> insurancePlans;
    
    public InsurancePlanDirectory(){
        this.insurancePlans = new ArrayList<InsurancePlan>();
    }

    public ArrayList<InsurancePlan> getInsurancePlans() {
        return insurancePlans;
    }
    
    public InsurancePlan createInsurancePlan(int id, String name, float costPerMonth, float costPerAnnum){
        InsurancePlan plan = new InsurancePlan(id,name,costPerMonth,costPerAnnum);  
        this.insurancePlans.add(plan);
        return plan;
    }
}
