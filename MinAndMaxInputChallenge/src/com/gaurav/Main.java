package com.gaurav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0, temp = 0 ;
//        int cout = 0;
        boolean flag = true;
        while (true) {
            System.out.println("Enter the number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                temp = scanner.nextInt();
                if (flag) {
                    flag = false;
                    min = temp;
                    max = temp;
                }

                if (temp > max){
                    max = temp;
                }
                if (temp < min){
                    min = temp;
                }

            }else{
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Max: "+ max + " & Min: " + min);
        scanner.close();
    }
}
