/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.vichet.keng;

/**
 *
 * @author user
 */
public class Assignment1VichetKeng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayPattern(15);}
     public static void displayPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int k=1; k <= 4 *(n-i); k++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.printf("%4d",j);
            }
                System.out.println();
            
    }//end of if;i
    
}//end of main;
}//end of class;

    
    

