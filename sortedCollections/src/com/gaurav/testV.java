package com.gaurav;

public class testV {
    public static void main(String[] args) {
        fib(0,1,10);
    }

    public static void fib(int a, int b, int n){
        int x =0,m =0;
        x=a+b;
        a=b;
        b=x;
        System.out.println(x);
        while (m<n){
            m++;
            fib(a,b,n);
        }
    }
}
