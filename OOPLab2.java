package oop.lab2;

import java.lang.Math;
import java.util.Scanner;

public class OOPLab2 {
    static int count=1;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int rand =(int) ((Math.random()*((9999-1000)+1))+1000);
        int i=1;
       
        System.out.println(rand);
       
        while(i != 0){
            int k=0;
            System.out.println("Please enter your prediction:");
            int predict = input.nextInt();
            String arrofstr = Integer.toString(predict);
            String arrofstr2 = Integer.toString(rand);
            
            if(predict > rand){
                System.out.println("Please enter smaller number.");
                for(i=0;i<arrofstr.length();i++){
                    if(arrofstr.charAt(i)==arrofstr2.charAt(i)){
                        k++;
                        System.out.println(i+".step is same"); 
                    }
                }
                System.out.println(k+" matches");
                count++;
            }else if(predict < rand){
                System.out.println("Please enter bigger number.");
                for(i=0;i<arrofstr.length();i++){
                    if(arrofstr.charAt(i)==arrofstr2.charAt(i)){
                        k++;
                        System.out.println(i+".step is same");
                    }
                }
                System.out.println(k+" matches");  
                count++;
            }else if(predict == rand){
                System.out.println("Congrulation! You found the number.");
                i=0; 
            }
        }
        System.out.println("You found in your " +count+ "th try");
    }
}
