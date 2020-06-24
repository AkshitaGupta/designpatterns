package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class ChocolateDark extends Candy {

    @Override
    public ArrayList makeCandyPackage(int quantity){
        ArrayList chocolatePackage = new ArrayList();

        for(int i = 1; i <= quantity; i++){
            ChocolateDark dark = new ChocolateDark();
            chocolatePackage.add(dark);
        }
        System.out.println ("1 package of " + quantity + " dark chocolates have been made.");
        return chocolatePackage;
    }
}
