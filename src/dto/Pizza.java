package src.dto;

import java.util.Arrays;

public class Pizza {
    private String size;
    private String[] toppings;
    private double price;

    public Pizza(String size, String[] toppings) {
        if(isValidPizza(size,toppings)){
            this.size = size;
            this.toppings = toppings;
        }else {
            this.size = "Small";
            this.toppings = new String[0];
        }
        calCost();
    }



    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        calCost();
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
        calCost();
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo(){
        System.out.println("+------------------------+");
        System.out.println("| Size - "+size+"           |"+(size.equals("Medium") ? "\b\b|" :""));
        System.out.println("| Toppings -             |");
        for (int i = 0; i < toppings.length; i++) {
            System.out.print("|\t0"+(i+1)+") "+toppings[i]);
            for (int j = 0; j < 17-toppings[i].length(); j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("+------------------------+");
        System.out.println("| Total Price - $ "+price+"0  |");
        System.out.println("+------------------------+");
    }

    private boolean isValidSize(String size){
        return  size.equals("Small") || size.equals("Medium") || size.equals("Large");
    }

    private boolean isValidToppings(String[] toppings){
        return toppings.length<5;
    }

    private boolean isValidPizza(String size,String[] toppings){
        return isValidSize(size) && isValidToppings(toppings);
    }

    public void calCost() {
        price=(size.equals("Small") ? 10 : size.equals("Medium") ? 14 : 16)+(toppings.length*2);
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void printHeading(){
        System.out.println("+------------------------+");
        System.out.println("|   Pizza Hut - Jaffna   |");

    }

}
