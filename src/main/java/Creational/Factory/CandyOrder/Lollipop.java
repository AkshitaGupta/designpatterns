package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class Lollipop extends Candy {

    @Override
    public ArrayList makeCandyPackage(int quantity){

        ArrayList lollipops = new ArrayList();
        for(int i = 1; i <= quantity; i++){
            lollipops.add(new Lollipop());
        }
        System.out.println("One package of " + quantity + " hard candy has been made!");
        return lollipops;
    }
}
