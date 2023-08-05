package src;

import src.dto.Pizza;
import src.dto.RegularPizza;
import src.dto.SpecialPizza;

public class TestPizza {
    public static void main(String[] args) {
        Pizza p1=new Pizza("Small",new String[]{"Chicken","BBQ"});
        p1.printHeading();
        p1.displayInfo();

        spacePrint();

        RegularPizza rp1=new RegularPizza("Small",new String[]{"Chicken","BBQ"});
        rp1.displayInfo();

        spacePrint();

        SpecialPizza sp1=new SpecialPizza("Small",new String[]{"Chicken","BBQ"},"Chilli souse");
        sp1.displayInfo();
    }

    public static void spacePrint(){
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
}
