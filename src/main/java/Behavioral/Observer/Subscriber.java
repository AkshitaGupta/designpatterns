package Behavioral.Observer;

/*

The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its
dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
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
