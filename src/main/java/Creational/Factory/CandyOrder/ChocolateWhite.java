package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class ChocolateWhite extends Candy {

    @Override
    public ArrayList makeCandyPackage(int quantity){
        ArrayList whiteChocolate = new ArrayList();

        for(int i = 1; i <= quantity; i++){
            ChocolateWhite white = new ChocolateWhite();
            whiteChocolate.add(white);
        }
        System.out.println("1 package of " + quantity + "white chocolates have been made.");

        return whiteChocolate;
    }
}
