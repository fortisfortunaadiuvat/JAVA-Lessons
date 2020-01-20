package ooplab4;

import java.util.Scanner;
import java.util.Arrays;

public class OOPLab4 {
    
    static int k=0; 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> numofint = new ArrayList<>();
        int upper=0,lower=0,number=0;
        int total=0;
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<='Z' && str.charAt(i)>= 'A'){
                upper++;
            }else if (str.charAt(i)<='z' && str.charAt(i)>= 'a'){
                lower++;
            }else if (str.charAt(i)<='9' && str.charAt(i)>= '0'){
                number++;
            }
        }
        
        int[][] arr = new int [number][str.length()];
        
        for(int i=0;i<number;i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)<='9' && str.charAt(j)>='0'){
                    arr [i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                }
            }
        }
        
        /*for(int j=0;j<str.length();j++){
            if(str.charAt(j)<='9' && str.charAt(j)>='0'){
                arr [i][j]=Integer.parseInt(String.valueOf(str.charAt(j)));
            }
         }*/
        
        //System.out.println(numofint);
        
       
        System.out.println(Arrays.toString(arr[0]));

        for(int i=0;i<1;i++){
            for(int j=0;j<str.length();j++){
                if(arr[i][j]!=0){
                    total += arr[i][j]*Math.pow(10,k);
                    k++;
                }else
                    k=0;
            }
        }
        
        System.out.println(total);
        System.out.println("Upper case in String: " + upper);
        System.out.println("Lower case in String: " + lower);
        System.out.println("Digit in String: " + number);
    }
    
}
