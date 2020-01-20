/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author hakan
 */
public class JavaApplication19 {
    
    public void cokcalis() throws Exception{
        try{
            throw new Exception("An exception ");
        }catch(Exception ex){
            System.out.println("An exception has been caught by cokcalis()" + ex);
            throw ex;
        }
    }
    
    public void calis() throws Exception{
        try{
            cokcalis();
        }catch(Exception ex){
            System.out.println("An exception has been caught by calis()" + ex);
            throw ex;
        }finally{
            System.out.println("Finally always executed");
        }
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void start() {
        try{
            calis();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication19 f = new JavaApplication19();
        f.start();
    }
    
}
