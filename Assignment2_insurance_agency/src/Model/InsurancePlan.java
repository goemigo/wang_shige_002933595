/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class InsurancePlan {
    private int planId;
    private String planName;
    private float costPerMonth;
    private float costPerAnnum;
    
    public InsurancePlan(int id, String name, float costPerMonth){
        this.planId = id;
        this.planName = name;
        this.costPerMonth = costPerMonth;
        
        this.calCostPerAnnum(costPerMonth);
     
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public float getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(float costPerMonth) {
        this.costPerMonth = costPerMonth;
    }
    
    public float getCostPerAnnum(){
        return costPerAnnum;
    }
    
    public void calCostPerAnnum(float costPerMonth){
        this.costPerAnnum = costPerMonth*12;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.planId);
    }
}
