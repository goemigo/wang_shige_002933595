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
//                JOptionPane.showMessageDialog(null,"Please fill all fields!");
                verifiedNoNull = false;
                break;
            }
            else{
                fieldList.add(arg);
                if(args.length != fieldList.size()){
                    verifiedNoNull = true;
                }
//                    try{
//                        //if no null value, then check input format
//                        checkFormat(fieldList.get(6));//add all fields
//                        JOptionPane.showMessageDialog(null,"Saved Successfully!");
//                    }catch(Exception e){
//                        JOptionPane.showMessageDialog(null,"Pleasee Check Input Format! ");
//                    }
                }
//            }   
        }
        showIfNull();
    }
    
    public void checkFormat(String fn, String ln, String un, String email, String phone
                                ,String serving, String isGlutenFree,String difLevel, String ingredients){
//        boolean verifiedFormat;

//        try{
//            Integer.valueOf((String) arg);
//            JOptionPane.showMessageDialog(null,"format correct!");
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null,"wrong format!");
//        }
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
//            System.out.println("format correct");
//            System.out.println("---");
//            System.out.println(verifiedFormat);
//            
            verifiedFormat = true;
        
        }else{
            verifiedFormat =false;
        }
//        System.out.println(serving);
        showIfFormatCorrect();
        
    }
    
    public void showIfNull(){
        if (!verifiedNoNull){
            JOptionPane.showMessageDialog(null,"Please fill all fields!");
        } 
    }
    
    public void showIfFormatCorrect(){
//        System.out.println(verifiedFormat);
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

