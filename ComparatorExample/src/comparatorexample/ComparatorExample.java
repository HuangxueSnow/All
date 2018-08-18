/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorexample;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class ComparatorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyObject[] ar = {
            new MyObject(5,"AB",true),
            new MyObject(1,"CD",false),
            new MyObject(3,"BA",true),
            new MyObject(10,"DF",false),
            new MyObject(13,"EH",true),
            new MyObject(8,"AH",false),
            new MyObject(8,"AF",false),
            new MyObject(8,"AH",true),
        
        };
        Arrays.sort(ar,(o1,o2)->{
            if(o1.a != o2.a)return o1.a-o2.a;
            if(!o1.b.equals(o2.b))return o1.b.compareTo(o2.b);
            if(o1.c==o1.c)return 0;
            if(o1.c)return -1;
            return 1;
        });
        printArray(ar);
    }
    private static void printArray(MyObject[] ar){
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }
    
}
class MyObject{
    int a;
    String b;
    boolean c;
    
    public MyObject(int pa, String pb, boolean pc){
        this.a = pa;
        this.b = pb;
        this.c = pc;
    }
        @Override
    public String toString(){
        return"{"+this.a+",\""+this.b+"\","+this.c+"}";
    }
}