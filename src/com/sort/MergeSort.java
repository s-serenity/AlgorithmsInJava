package com.sort;

public class MergeSort {
    public static void mergeSort(int[] list) {
        int mid = list.length / 2;
        if (list.length > 1) {
            int[] firstHalf = new int[mid];
            System.arraycopy(list, 0, firstHalf, 0, mid);
            mergeSort(firstHalf);
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, mid, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);
        }
    }

        public static void merge(int[] list1,int[] list2,int[] temp){
            int current1 = 0;
            int current2 = 0;
            int current3 = 0;
            while(current1 < list1.length && current2 < list2.length){
                if (list1[current1]<list2[current2])
                {temp[current3++] = list1[current1++];}
                else
                {temp[current3++] = list2[current2++];}
            }
            while(current1<list1.length)
            {temp[current3++] = list1[current1++];}
            while(current2<list2.length)
            {temp[current3++] = list2[current2++];}
    }
}
