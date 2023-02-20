/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import java.util.Date;

/**
 *
 * @author emi
 */
public class Material {
    private static int count = 0;
    private String serialNo;
    String name;
    Date registerDate;
    Boolean isAvailable = true;
    
    public Material(){
        this.serialNo = "ACC" + count++; 
    }
    
    public Material(String name, Date date, boolean isAvail){
        this.serialNo = "Serial" + count++;
        this.name = name;
        this.registerDate = date;
        this.isAvailable = isAvail;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.serialNo);
    }
}
