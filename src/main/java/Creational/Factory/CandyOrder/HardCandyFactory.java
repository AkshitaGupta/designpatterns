package Creational.Factory.CandyOrder;

import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String type){
        switch (type){
            case "lollipop":
                return new Lollipop();

            case "candy cane":
                return new CandyCane();

            default:
                return new Peppermint();

        }

    }

    @Override
    public ArrayList getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);
        if(quantity % 10 != 0){
            System.out.println("Hard candy must be packaged in multiples of 10!");
            return null;
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
