package com.gaurav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int num = scanner.nextInt();
                printSquareStart(num);
            }
            else{
                break;
            }
        }
    }


    public static void printNumberinWord(int num){
        switch (num){
            case 0:case 1: case 2: case 3: case 4: case 5:
                case 6: case 7: case 8: case 9:
                System.out.println("Number is " + num);
                break;

            default:
                System.out.println("Other");

        }
    }


    public static void printSquareStart(int num){
        if (num > 4){

            for (int i=0; i<num; i++){
                for (int j = 0; j < num; j++) {
                    if (j == 0 || i==0) {
                        System.out.print('*');
                    }else if (j == i){
                        System.out.print('*');
                    }else if (j == (num-1)){
                            System.out.print('*');
                    }else if (i ==(num-1)){
                        System.out.print('*');
                    }else if ((i + j)== (num -1) ){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
