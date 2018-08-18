/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	String a = reader.nextLine();
        String[] aArray = a.split(" ");
        int n = aArray.length;
        int check = n %2; //check the number of total words is odd or even
        if(check == 0){ //The number of total words is even, therefore is odd "not"
            if(aArray[aArray.length -1].equalsIgnoreCase("True")){
                System.out.print("False");
            }
            else if (aArray[aArray.length -1].equalsIgnoreCase("False")){
                System.out.print("True");
            }
        }else{ //therefore other is even number of "not"
            if(aArray[aArray.length -1].equalsIgnoreCase("True")){
                System.out.print("True");
            }
            else if (aArray[aArray.length -1].equalsIgnoreCase("False")){
                System.out.print("False");
            }
        }
        
    }
    
}
