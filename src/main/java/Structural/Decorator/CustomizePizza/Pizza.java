package Structural.Decorator.CustomizePizza;

public abstract class Pizza {
    String description;
    public void getDescription(String desciption){
        this.description = desciption;
    }

    public abstract int getCost();
}
