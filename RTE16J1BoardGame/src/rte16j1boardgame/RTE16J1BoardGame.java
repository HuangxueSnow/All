/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rte16j1boardgame;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RTE16J1BoardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	String s = reader.nextLine();
        int a;
        a = checkL(s);
        System.out.print(a + " ");
        int c = 0;
        String wArray[] = new String [s.length()];
        for(int j = 0; j < s.length(); j++){
            char w = s.charAt(j);
                if (Character.isAlphabetic(w)){
                    wArray[j] = w;
                }
                else{
                    
                }
        }
    }

    private static int checkL(String s) {
        int n = 0;
        String b = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L' || s.charAt(i) == 'l')
                n+=1;
        }
        return n;
    }
    
}
