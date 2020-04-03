package com.Sorts;

import com.Sorts.InsertionSort;
import com.Sorts.BubbleSort;

public class SortTest {
    public static void main(String args[]){
        int[] testList = {1,9,4,6,5,-4};
        for (int x:testList){
            System.out.print(x);
        }
        //InsertionSort.insertionSort(testList);
        //BubbleSort.bubbleSort(testList);
        //MergeSort.mergeSort(testList);
        QuickSort.quickSort(testList);
        for (int x:testList){
            System.out.print(x);
        }
    }
}
