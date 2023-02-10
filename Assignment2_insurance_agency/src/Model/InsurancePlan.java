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
    int planId;
    String planName;
    float costPerMonth;
    float costPerAnnum;
    
    public InsurancePlan(int id, String name, float costPerMonth, float costPerAnnum){
        this.planId = id;
        this.planName = name;
        this.costPerMonth = costPerMonth;
        this.costPerAnnum = costPerAnnum;
     
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
    
    public void setCostPerAnnum(float costPerAnnum){
        this.costPerAnnum = costPerAnnum;
    }
    
    public float getCostPerAnnum(){
        return costPerAnnum;
    }
}
