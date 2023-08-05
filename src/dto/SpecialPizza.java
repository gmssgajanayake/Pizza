package src.dto;

public class SpecialPizza extends Pizza {
    private String specialSauce;

    public SpecialPizza(String size,String[] toppings,String specialSauce){
        super(size,toppings);
        this.setSpecialSauce(specialSauce);
        calCost();
    }


    public String getSpecialSauce() {
        return specialSauce;
    }

    public void setSpecialSauce(String specialSauce) {
        this.specialSauce = specialSauce;
    }

    @Override
    public void displayInfo() {
        printHeading();
        System.out.println("|     Special Pizza      |");
        System.out.println("+------------------------+");
        System.out.println("| *** Special sauce ***  |");
        System.out.print("| --> "+specialSauce+"   ");
        for (int i = 0; i < 16-specialSauce.length(); i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        super.displayInfo();
    }

    @Override
    public void calCost() {
        super.calCost();
        setPrice(getPrice()+getPrice()* 0.2);
    }
}
