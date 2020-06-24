package Behavioral.Observer;

import java.util.HashSet;

public abstract class Subject {

    private HashSet<Observer> observers = new HashSet();

    public void register(Observer observer){
        this.observers.add(observer);
    }

    public void unregister(Observer observer){
        if(this.observers.contains(observer)){
            this.observers.remove(observer);
        }
    }

    public void notifyAllObservers(){
        for(Observer o : this.observers){
            o.update();
        }
    }
}
