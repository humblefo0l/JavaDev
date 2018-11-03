package com.gaurav;

public class Printer {

    private int tonerLevel=100;
    private int pagePrinted=0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagePrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagePrinted = pagePrinted;
        this.isDuplex = isDuplex;
    }

    public void printPage(int numberOfPages){

        if (isDuplex){
            numberOfPages = (numberOfPages/2) + (numberOfPages%2);
        }
        System.out.println("Pages printed currently: " + numberOfPages);
        this.pagePrinted += numberOfPages;
        System.out.println("total pages printed: " + this.pagePrinted);
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner(int filling){
        if (this.tonerLevel == 100){
            System.out.println("Cant fill. Already full");

        }
        if ((this.tonerLevel + filling) > 100){
            int extraFilling = (this.tonerLevel+ filling) - 100;
            System.out.println("extra filling is: " + extraFilling);
            int tofill = filling = extraFilling;
            System.out.println("need to fill only: "+ tofill);
            this.tonerLevel += tofill;
        }else{
            this.tonerLevel += filling;

        }

        System.out.println("Toner level: "+ this.tonerLevel);
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
