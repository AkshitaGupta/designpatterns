package Behavioral.Observer;

/*

The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its
dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

In general, you want to use this pattern to reduce coupling. If you have an object that needs to share it's state with
others, without knowing who those objects are, the Observer is exactly what you need.

Problems: In his article he mentions that it can be difficult to see the path through the code, unless you are debugging.
As such, you should be careful not to have chains of observers (observers acting as subjects). Also, watch out for
memory leaks as the subject will hold a reference to the observer unless it has de-registered.

*/

public class Subscriber implements Observer {

    private String name;
    private Subject subject;

    public Subscriber(String name){
        this.name = name;
    }

    public void subscribeTo(Subject subject){
        subject.register(this);
        this.subject = subject;
    }

    public void unsubscribeFrom(Subject subject){
        subject.unregister(this);
        this.subject = null;
    }

    @Override
    public void update(){
        if(this.subject == null){
            System.out.println("Not subscribed");
            return;
        }
        Post post = null;
        System.out.println(this.name + " a new post got published:" + post);
    }

}
