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
public class Robot_Alfa implements Alfa {

    int height = 360;
    static int structure = 0;
    
    @Override
    public void build_structure() {
        structure ++;
    }
    
}
