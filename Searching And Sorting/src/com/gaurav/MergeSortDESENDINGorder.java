package com.gaurav;

public class MergeSortDESENDINGorder {


    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        MergeSortDESENDINGorder obj = new MergeSortDESENDINGorder();

        int arr[] = {3,4,6,7,1,3,5,66};

        obj.mergeSort(arr, 0, arr.length);
        selectionSort.printResult(arr);
    }


    private static void mergeSort(int arr[], int start, int end){
        if(start < end){
            int mid = (start+end)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            sort(arr, start, mid, end);

        }
    }



    private static void sort(int arr[], int start, int mid, int end){

        int n1 = mid-start+1;
        int n2 = end-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i=0; i<n1; i++)
            L[i] = arr[start+i];

        for (int j=0; j<n2; j++)
            R[j] = arr[mid+1+j];


        int i,j,k;
        i=j=0;
        k=start;


        while (i<n1 && j<n2){

            if (L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<n1){
            arr[k] = L[j];
            j++;
            k++;
        }

    }




}
