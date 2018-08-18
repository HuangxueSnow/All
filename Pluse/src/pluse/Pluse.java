/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pluse;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Pluse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner reader = new Scanner(System.in);
        String s1 = reader.nextLine();
        String[] a = s1.split(" ");
        int[] c = new int[a.length];
        for(int i=0; i< a.length ;i++){
            int b = Integer.parseInt(a[i]);
            c[i] = b;
        }
*/
        
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int t=sc.nextInt();
        int count=0;
        for (int i=0;i<n;i++) {
            int receivedTime=sc.nextInt()*2;
            if (receivedTime>=s && receivedTime<=t)
                count++;
        }
        System.out.println(count);
        
    }
    
}
