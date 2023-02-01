/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class Verify {
    private boolean verifiedNoNull;
    private boolean verifiedFormat;
    
    public void checkNullValue(Object... args){
        
        ArrayList<Object> fieldList = new ArrayList();
        for (Object arg: args){
            if (arg == null){   // .euqals("") or isEmpty() do not work for the image object, thus use ==null
                verifiedNoNull = false;
                break;
            }
            else{
                fieldList.add(arg);
                if(args.length != fieldList.size()){
                    verifiedNoNull = true;
                }
            }
        }
        showIfNull();
    }
    
    public void checkFormat(String fn, String ln, String un, String email, String phone
                                ,String serving, String isGlutenFree,String difLevel, String ingredients){

        Pattern onlyBlankAndLetters = Pattern.compile("[A-Za-z]*");
        Pattern onlyInt = Pattern.compile("[0-9]*");
//        Pattern oneToFiveFloat = Pattern.compile("[1-5][.][0-9]"); 
        Pattern emailFormat = Pattern.compile( "^(.+)@(.+)$"); //. matches any single character, + means one or more, ^ is the beginning of a line, $ is the boundary matcher for the end of a line
        
        Matcher matcherfirstName = onlyBlankAndLetters.matcher(fn);
        Matcher matcherLastName = onlyBlankAndLetters.matcher(ln);
        Matcher matcherUserName = onlyBlankAndLetters.matcher(un);
        Matcher matcherEmail = emailFormat.matcher(email);
        Matcher matcherPhone = onlyInt.matcher(phone);

        
        boolean matchfirstName = matcherfirstName.matches();
        boolean matchLastName = matcherLastName.matches();
        boolean matchUserName = matcherUserName.matches();
        boolean matchEmail = matcherEmail.matches();
        boolean matchPhone = matcherPhone.matches();

        
        if(
                matchfirstName 
                && matchLastName && matchUserName
                && matchEmail && matchPhone && phone.length() == 10
                && Integer.valueOf(serving) > 0
                && (isGlutenFree.equalsIgnoreCase("yes") || isGlutenFree.equalsIgnoreCase("no"))
                && Float.valueOf(difLevel) >1 && Float.valueOf(difLevel) < 5
                && Integer.valueOf(ingredients) > 0
                ){
            verifiedFormat = true;
        }else{
            verifiedFormat =false;
        }

        showIfFormatCorrect();
        
    }
    
    public void showIfNull(){
        if (!verifiedNoNull){
            JOptionPane.showMessageDialog(null,"Please fill all fields!");
        } 
    }
    
    public void showIfFormatCorrect(){
        if (!verifiedFormat){
            JOptionPane.showMessageDialog(null,"Please Check Input Format!");
        } 
    }
    
    public void showIfSaved(){
        if (verifiedNoNull && verifiedFormat){
            JOptionPane.showMessageDialog(null,"Saved Successfully!");
        }
    }
}

