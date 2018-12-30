package com.gaurav;


public class InsertionSort {

    public static SelectionSort selectionSort = new SelectionSort();

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();

        int arr[] = {11,2,13,7,9};

        obj.insertionSort(arr);
        selectionSort.printResult(arr);
    }


    private void insertionSort(int[] arr){
        int len = arr.length;

        for (int i=1; i<len; ++i){
            int j = i-1;
            int key = arr[i];
            while (j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j =j- 1;
            }

            arr[j+1] = key;
        }
    }
}
