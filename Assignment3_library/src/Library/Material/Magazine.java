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
public class Magazine extends Material{
    private String company;
    private String issueType;
    
    public Magazine(String name, Date registerDate, String c, String i){
        super();
        this.name = name;
        this.registerDate = registerDate;
        this.company = c;
        this.issueType = i;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    
            
}
