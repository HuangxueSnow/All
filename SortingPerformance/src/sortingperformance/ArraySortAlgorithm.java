/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingperformance;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class ArraySortAlgorithm extends SortAlgorithm {

    public ArraySortAlgorithm() {
        this.algorithmName = "ArraySort";
    }

    @Override
    void sort() {
        Arrays.sort(this.ar);
    }
    
}
