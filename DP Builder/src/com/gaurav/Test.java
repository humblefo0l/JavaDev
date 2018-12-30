package com.gaurav;

//public class Test {
//
//    public static void main(String... args) {
//        Adder adder = new Adder();
//        adder.add(10);
//        adder.add(20); //We've to type "adder" everytime to call add
//        adder.add(20); //We've to type "adder" everytime to call add
//        int total = adder.getTotal();
//
//        System.out.println("Total is:"+total);
//    }
//}
//
//
//class Adder {
//
//    private int total;
//
//    public void add(int amt) {
//        this.total = this.total + amt;
//    }
//
//    public int getTotal() {
//        return this.total;
//    }
//}

class Adder {

    private int total;

    public Adder add(int amt) {
        this.total = this.total + amt;
        return this;
    }

    public int getTotal() {
        return this.total;
    }
}

public class Test {

    public static void main(String... args) {
        Adder adder1 = new Adder();
        Adder adder2 = adder1.add(10); //catch return value of add
        if(adder2 == adder1) //Note that we are using "== operator" & not equals method
        {
            System.out.println("adder1 returns itself!");
        }
        adder1.add(20)/* add returns adder1*/.add(30).add(10);

        int total = adder1.getTotal();

        System.out.println("Total is:"+total);
    }
}