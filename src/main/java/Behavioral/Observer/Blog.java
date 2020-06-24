package Behavioral.Observer;

public class Blog extends Subject {

    private String title;
    private String author;

    public Blog(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void publish(Post post){

        // publish post
        // do something

        // notify
        notifyAllObservers();
    }

    public Post getRecentPost(){
        Post post = new Post("Hello");
        return post;
    }
}
