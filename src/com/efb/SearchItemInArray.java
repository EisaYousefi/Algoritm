package com.efb;

public class SearchItemInArray {

    public int[] sort(int[] array){
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    swap = array[i];
                    array[i]=array[j];
                    array[j] = swap;
                }
            }
        }
        printSortArray(array);
        return array;
    }

    public int[] quickSort(int[] arr ){
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        quickSort.printArray(arr, arr.length);
        return arr;
    }

    private void printSortArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (j!= array.length-1)
            System.out.print(array[j]+ " ,");
            else
                System.out.println(array[j]);
        }
    }

    public int binSearch(int[] array , int low , int high , long num){
        int mid;
        if (low>high)
            return 0;
        mid = (low+high)/2;
        if (num==array[mid])
          return array[mid];
        else {
            if (num<array[mid]){
                return binSearch(array , low , mid-1,num);
            }
            else {
                return binSearch(array , mid+1 , high,num);
            }
        }

    }
}
