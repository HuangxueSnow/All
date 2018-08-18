/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantcookie;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GiantCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	int a = reader.nextInt();
        int b = reader.nextInt();
        int c = a/b;
        double d = a%b;
        if(d == 0)
            System.out.print("yes "+c);
        else{
            int e = 0;
            while(d != 0){
                b+=1;
                d = a%b;
                e+=1;
            }
            System.out.print("no "+e);
        }
        
    }
    
}
