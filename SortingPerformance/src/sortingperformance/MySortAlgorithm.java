/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingperformance;

/**
 *
 * @author Administrator
 */
public class MySortAlgorithm extends SortAlgorithm {

    public MySortAlgorithm() {
        this.algorithmName = "MySort";
    }

    @Override
    void sort() {
        int minIndex = 0;
        double min;
        int i,j;
        for(i = 0; i<N; i++){
           minIndex = i;
           min =ar[minIndex];
            for(j = i+1; j< N; j++){
               if(ar[j]<min){
                   minIndex = j;
                   min = ar[j];
               }
           }
           double tmp = ar[i];
           ar[i] = ar[minIndex];
           ar[minIndex] = tmp;
        }
    }
    
}
