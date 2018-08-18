/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingperformance;

import java.util.Random;



/**
 *
 * @author Administrator
 */
abstract class SortAlgorithm {

    static int N = 4096;
    static Random random = new Random();
    double[] ar = new double[N];
    String algorithmName;
    void checkPerformance() {
        long tm = 0;
        long tm1 = 0;
        
        for(int i= 0; i <1000; i++){
            createData();
            tm1 = System.currentTimeMillis();
            sort();
            tm+=System.currentTimeMillis()-tm1;
        }
        System.out.println("The execution of "+ algorithmName+" time is:"+tm);
    }

    protected void createData() {
        for(int i = 0; i<N; i++){
            ar[i]=random.nextDouble(); 
        }
    }

    abstract void sort();{
        
    }
    
}
