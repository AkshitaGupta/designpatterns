package Structural.Decorator.CustomizeCoffee;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", soy";
    }

    public double cost(){
        return beverage.cost() + .15;
    }
}

