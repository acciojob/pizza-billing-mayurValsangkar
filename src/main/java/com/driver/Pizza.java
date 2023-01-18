package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    String extraToppings;
    String extraCheese;
    String takeAway;
    int extraToppingsPrice = 0;
    int extraCheesePrice = 0;
    int takeawayPrice = 0;
    private int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getPrice(){
        if(getVeg()){
            setPrice(300);
        }else {
            setPrice(400);
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.extraCheese = "Extra Cheese Added: 80";
        this.extraCheesePrice = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(getVeg()){
            this.extraToppings = "Extra Toppings Added: 70";
            this.extraToppingsPrice = 70;
        }else{
            this.extraToppings = "Extra Toppings Added: 120";
            this.extraToppingsPrice = 120;
        }

    }

    public void addTakeaway(){
        // your code goes here
        this.takeAway = "Paperbag Added: 20";
        this.takeawayPrice = 20;
    }

    public String getBill()
    {
        // your code goes here
        setTotalPrice(getPrice()+extraCheesePrice+extraToppingsPrice+takeawayPrice);
        String cusBill = "Base Price Of The Pizza: "+getPrice()+"\n"+extraCheese+"\n"+extraToppings+"\n"+takeAway+"\n"+"Total Price: "+getTotalPrice()+"\n";
        setBill(cusBill);
        return this.bill;
    }

    public Boolean getVeg() {
        return isVeg;
    }
}
