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
public class Robot_Gama implements Alfa,Beta{
    
    int height = 200;
    static int structure = 0; 
    static int tree = 0;
    int count = 0;
    int flag ;
    
    public void work(){
        flag = 0;
    }
    
    public void change_duty(){
        count ++;
    }
    
    @Override
    public void build_structure() {
        structure ++; 
    }
    
    @Override
    public void plant_tree() {
        tree ++; 
    }
    
}
