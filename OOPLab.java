package oop.lab;

import java.util.*;

public class OOPLab {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter number :");
        int number=input.nextInt();
        
        System.out.println("Please enter a number which is operator: ");
        int snumber=input.nextInt();
        switch (snumber) {
            case 1:
                int sum=0;
                for(int i=1;i<number;i++){
                    sum+=i; 
                }
                System.out.println("Sum 1 to number: "+sum);
                break;
            case 2:
                int total=1;
                for(int i=1;i<number;i++){
                    total*=i;
                }
                System.out.println("Cross 1 to number: "+total);
                break;
            case 3:
                for(int i=1;i<number;i++){
                    if(i%3==0){
                        System.out.println("Divided by 3 between 1 to "+number+": "+i); 
                    }
                }
                break;
            default:
                break;
        }
        
        System.out.println("Please enter number2:");
        int number2=input.nextInt();
        int prime=2;
        ArrayList<Integer> primenumbers=new ArrayList<>();
        
        while(number2>1){
            if(number2%prime==0){
                number2/=prime;
                primenumbers.add(prime);
            }
            else if(number2>0){
                prime++;
            }
        }
        for(int k=0;k<primenumbers.size();k++){
            for(int j=1;j<primenumbers.size();j++){             
                if(Objects.equals(primenumbers.get(j), primenumbers.get(k))){
                    //primenumbers.remove(k);
                }
            }
        }
        System.out.println(primenumbers); 
    }
}