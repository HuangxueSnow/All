/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setexample;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class SetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Integer>set1 = new HashSet();
        Set<Integer>set2 = new HashSet();
        
        for(int i=1;i <100;i++){
            if(i%7==0) set1.add(i);
            if(i%5==0) set2.add(i);
        }
        
        Set<Integer> set3 = new HashSet();
        set3.addAll(set1);
        set3.addAll(set2);
        
        Set<Integer> set4 = new HashSet();
        set4.addAll(set1);
        set4.retainAll(set2);
        
        Set<Integer> set5 = new HashSet();
        set5.addAll(set1);
        set5.removeAll(set2);
        
        printSet(set1);
        printSet(set2);
        printSet(set3);
        printSet(set4);
        printSet(set5);
    }

    private static void printSet(Set<Integer> set) {
        for(Integer ele:set){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    
}
