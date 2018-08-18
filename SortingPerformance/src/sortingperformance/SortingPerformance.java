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
public class SortingPerformance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortAlgorithm algorithm = new ArraySortAlgorithm();
        algorithm.checkPerformance();
        algorithm = new CollectionsSortAlgoritnm();
        algorithm.checkPerformance();
        algorithm = new MySortAlgorithm();
        algorithm.checkPerformance();
        algorithm = new BubbleSortAlgorithm();
        algorithm.checkPerformance();
    }
    
}
