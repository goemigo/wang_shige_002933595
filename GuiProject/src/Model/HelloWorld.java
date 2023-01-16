package Model;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emi
 */
public class HelloWorld {
                 
    public static void main(String[] args){
        int myint = 5;
        double a = 5.5;
        float b = 1.2f;
        String c = "emily";
        boolean d = false;
        char e = 'e';
        int[] myarr = new int[3]; //init an integer array of size n, here n=3
        
        System.out.println(myint);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //display the array
        System.out.println(Arrays.toString(myarr));
       
    }
    
}
