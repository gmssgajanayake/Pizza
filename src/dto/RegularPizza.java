package src.dto;

public class RegularPizza extends Pizza{
    public RegularPizza(String size, String[] toppings) {
        super(size, toppings);
        calCost();
    }

    @Override
    public void calCost() {
        super.calCost();
        setPrice(getPrice()+getPrice()* 0.1);
    }

    @Override
    public void displayInfo() {
        printHeading();
        System.out.println("|     Regular Pizza      |");
        super.displayInfo();
    }
}
