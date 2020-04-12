package com.sort;

public class SortTest {
    public static void main(String args[]){
        int[] testList = {1,9,4,6,5,-4};
        Integer[]  list = {-44,-5,-3,3,52,1,-4,0,1,2,3,4,5};
        for (int x:testList) {
            System.out.print(x+" ");
        }
        //InsertionSort.insertionSort(testList);
        //BubbleSort.bubbleSort(testList);
        //MergeSort.mergeSort(testList);
        //QuickSort.quickSort(testList);
        SelectionSort.selectionSort(testList);
        System.out.println();
        for (int x:testList){
            System.out.print(x+" ");
        }
        System.out.println();
        for (int x:list){
            System.out.print(x+" ");
        }
        HeapSort.heapSort(list);
        System.out.println();
        for (int x:list){
            System.out.print(x+" ");
        }
    }
}
