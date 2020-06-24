package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class Peppermint extends Candy {

    @Override
    public ArrayList makeCandyPackage(int quantity){
        ArrayList hardCandyPackage = new ArrayList();
        for(int i = 1; i <= quantity; i++) {
            Peppermint hardCandy_Peppermint = new Peppermint();
            hardCandyPackage.add(hardCandy_Peppermint);
        }

        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;
    }
}
