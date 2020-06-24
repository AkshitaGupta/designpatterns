package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class CandyCane extends Candy {

    @Override
    public ArrayList makeCandyPackage(int quantity){
        ArrayList hardCandyPackage = new ArrayList();

        for(int i = 1; i <= quantity; i++) {
            CandyCane candyCane = new CandyCane();
            hardCandyPackage.add(candyCane);
        }

        System.out.println(quantity / 10 + " packages of 10 candy canes have been made!");
        return hardCandyPackage;
    }
}
