package Behavioral.Iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;
    int position;

    public DinnerMenuIterator(MenuItem[] list){
        this.list = list;
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext(){
        if(position >= list.length || list[position] == null){
           return false;
        }
        else{
            return true;
        }
    }

    public void remove(){
        if(position <= 0){
            throw new IllegalStateException("");
        }

        if(list[position - 1] != null){
            for(int i = position - 1; i < list.length - 1; i++){
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }


}
