// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

package com.gaurav;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getInteger();
//        printArray(myArray);

        myArray = sortInteger(myArray);
        printArray(myArray);
    }

    public static int[] getInteger(){
        System.out.println("Enter the number of element you want to enter: ");
        int len = scanner.nextInt();
        int[] internalArray = new int[len];

        System.out.println("Enter the next " + len + " element.");
        for(int i=0; i < len; i++){
            internalArray[i] = scanner.nextInt();
        }

        return internalArray;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element at " + i + ", is :" + array[i]);
        }
    }

    public static int[] sortInteger(int[] array){
        int[] internalArray = new int[array.length];
        int temp;

        for(int i=0; i< array.length; i++){
            internalArray[i] = array[i];
        }

        for(int i=0; i<array.length; i++){
            for(int j=0; j< (array.length -1) ; j++){
                if (internalArray[j] < internalArray[j+1]){
                    temp = internalArray[j];
                    internalArray[j] = internalArray[j+1];
                    internalArray[j+1]= temp;
                }

            }
        }

        return internalArray;
    }
}
