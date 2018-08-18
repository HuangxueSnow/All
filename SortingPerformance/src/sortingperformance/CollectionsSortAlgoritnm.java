/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingperformance;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class CollectionsSortAlgoritnm extends SortAlgorithm {
    ArrayList<Double> al = new ArrayList();
    public CollectionsSortAlgoritnm() {
        this.algorithmName = "CollectionsSort";
    }

    @Override
    void sort() {
        Collections.sort(al);
    }
    @Override
    protected void createData(){
        al.clear();
        for(int i = 0; i<N; i++){
            al.add(random.nextDouble());
        }
    }
}
