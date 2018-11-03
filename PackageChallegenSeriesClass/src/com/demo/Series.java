package com.demo;

public class Series {

    public int nSum(int n){
        int count=0;
        for(int i=0; i <= n; i++){
            count += i;
        }

        return count;
    }

    public int factorial(int n){
        int fact = 1;
        if (n == 0){
            return 0;
        }
        for(int i=n; i>0; i--){
            fact *= i;
        }

        return fact;
    }


    public int fibonacci(int n){
        if(n == 0){
            return n;
        }else if(n == 1){
            return n;
        }

//        int a = 0;
//        int b = 1;
//        int sum = 0;
//
//        for(int i=1; i < n; i++){
//            sum = a + b;
//            a = b;
//            b = sum;
//        }
//
//        return sum;

        return fibonacci(n-1) + fibonacci(n-2);


    }
}
