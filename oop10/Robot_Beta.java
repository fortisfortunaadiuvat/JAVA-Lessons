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
public class Robot_Beta implements Beta{

    int height = 140;
    static int tree = 0;
    
    @Override
    public void plant_tree() {
        tree ++;
    }
    
}
