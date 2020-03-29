package com.Sorts;

import com.Sorts.InsertionSort;

public class SortTest {
    public static void main(String args[]){
        int[] testList = {1,9,4,6,5,-4};
        for (int x:testList){
            System.out.print(x);
        }
        InsertionSort.insertionSort(testList);
        for (int x:testList){
            System.out.print(x);
        }
    }
}
