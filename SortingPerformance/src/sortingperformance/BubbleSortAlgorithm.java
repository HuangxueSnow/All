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
public class BubbleSortAlgorithm extends SortAlgorithm {

    public BubbleSortAlgorithm() {
        this.algorithmName = "BubbleSort";
    }

    @Override
    void sort() {
        int i,j;
        double store;
        for (i = 0; i < ar.length; i++){
            for (j = 1; j < (ar.length - i); j++) {
                if (ar[j - 1] > ar[j]) {
                    store = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = store;
                }
            }
        }
    }
    
}
