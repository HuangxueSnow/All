/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplusb;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class APlusB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	int s = reader.nextInt();
         for (int i = 0; i < s; i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            System.out.println(a + b);
        }
        
        
    }
    
}
