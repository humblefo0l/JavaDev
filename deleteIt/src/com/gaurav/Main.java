package com.gaurav;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("0");
//        System.out.println("1");
//        int n =10;
//
//            fib(0, 1, n);
//
//    }
//
//    public static void fib(int a, int b, int n) {
//        int x = 0, m = 0;
//        x = a + b;
//        a = b;
//        b = x;
//        System.out.println(x);
//        if (n > 2)
//            fib(a, b, n--);
//    }

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            System.out.println(fib(i));
        }
    }

    public static int fib(int i){
        if (i==0 || i==1){
            return i;
        }
        return fib(i-1) + fib(i-2);
    }
}
