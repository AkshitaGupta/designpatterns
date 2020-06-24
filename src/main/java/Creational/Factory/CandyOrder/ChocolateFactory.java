package Creational.Factory.CandyOrder;

public class ChocolateFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {

        switch (section) {
            case "dark":
                return new ChocolateDark();
            case "white":
                return new ChocolateWhite();
            case "milk":
                return new ChocolateMilk();
            default:
                return new ChocolateMilk();
        }
    }
}
