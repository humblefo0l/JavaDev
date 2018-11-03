package com.gaurav;

public class Hamburger {
    private String breadRollType;
    private boolean meat;
    private boolean  isLettuce;
    private boolean isTomoto;
    private boolean isCarrot;
    private int price;
    public Hamburger(String breadRollType, boolean meat, boolean isLettuce, boolean isTomoto, boolean isCarrot) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 50;
        this.isLettuce = isLettuce;
        if (isLettuce){
            this.price += 10;
        }
        this.isTomoto = isTomoto;
        if (isTomoto){
            this.price += 10;
        }
        this.isCarrot = isCarrot;
        if (isCarrot){
            this.price += 10;
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return isLettuce;
    }

    public boolean isTomoto() {
        return isTomoto;
    }

    public boolean isCarrot() {
        return isCarrot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price += price;
    }
}
