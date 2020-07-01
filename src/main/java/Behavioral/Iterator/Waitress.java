package Behavioral.Iterator;

import java.util.List;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for(MenuItem m : breakfastItems){
            printMenuItem(m);
        }

        MenuItem[] lunchItems = ((DinnerMenu) dinnerMenu).getMenuItems();
        for(MenuItem m : lunchItems){
            printMenuItem(m);
        }
    }

    public void printMenuItem(MenuItem m){

        System.out.println(m.getName());
        System.out.println(m.getDescription());
        System.out.println(m.getPrice());
    }
}
