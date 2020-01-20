/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop10;

/**
 *
 * @author hakan
 */
public class OOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Robot_Alfa alfa = new Robot_Alfa();
        alfa.build_structure();
        System.out.println("number of structure of alfa is: " + Robot_Alfa.structure);
        System.out.println("height of alfa is:" + alfa.height);
        Robot_Beta beta = new Robot_Beta();
        beta.plant_tree();
        System.out.println("number of tree of beta is: " + Robot_Beta.tree);
        System.out.println("height of beta is:" + beta.height);
        Robot_Gama gama = new Robot_Gama();
        gama.work();
        
        if(gama.flag == 0){
            gama.plant_tree();
        }else
            gama.build_structure();
        
        System.out.println("number of structure of gama is: " + Robot_Gama.structure);
        System.out.println("number of tree of gama is: " + Robot_Gama.tree);
        System.out.println("height of gama is:" + gama.height);
        
        gama.change_duty();
        
        if(gama.count == 1){
           gama.build_structure();
        }
        
        System.out.println("number of structure of gama is: " + Robot_Gama.structure);
        System.out.println("number of tree of gama is: " + Robot_Gama.tree);
        System.out.println("height of gama is:" + gama.height);
        
        
    }
    
}
