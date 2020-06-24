package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class ChocolateMilk extends Candy {

    @Override
    public ArrayList makeCandyPackage(int quantity){
        ArrayList milkChocolate = new ArrayList();

        for(int i = 1; i <= quantity; i++){
            ChocolateMilk milk = new ChocolateMilk();
            milkChocolate.add(milk);
        }
        System.out.print("1 package of " + quantity + "milk chocolates have been made.");

        return milkChocolate;
    }
}
