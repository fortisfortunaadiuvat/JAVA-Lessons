package ooplab5;

import java.util.Scanner;

public class OOPLab5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your string: ");
        String str = input.nextLine();
        String str2=str;
        int count=0;
        int[] arr = new int[str.length()];
        
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            arr[i] = count;
            System.out.println(str.charAt(i)+" : "+arr[i]);
            count=0;
        }
        int max=arr[0];
        int min=arr[0];
        int max_index=0;
        int min_index=0;
        
        for(int i=0;i<str.length();i++){
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }else if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
        }
        System.out.println(str.charAt(max_index)+" is passed " + max + " time(s)");
        System.out.println(str.charAt(min_index)+" is passed: " + min + " time(s)");
        //System.out.println("ascii result is:" +(str.charAt(max_index)-str.charAt(min_index)));
        System.out.println(max-min);
    }
}
