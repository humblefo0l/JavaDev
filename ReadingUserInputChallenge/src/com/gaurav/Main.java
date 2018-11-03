package com.gaurav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while (true){
            System.out.println("Enter the number " + counter + ':');
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int val = scanner.nextInt();
                System.out.println(val);
                sum += val;
                counter ++;

                if(counter == 10)break;

            }else{
                System.out.println("Invalid Input");
            }

            scanner.nextLine();

        }
        System.out.println("Sum of number is: " + sum);
        scanner.close();
    }
}
