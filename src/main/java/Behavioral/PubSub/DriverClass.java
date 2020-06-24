package Behavioral.PubSub;

import Behavioral.PubSub.publisher.Publisher;
import Behavioral.PubSub.publisher.PublisherImpl;
import Behavioral.PubSub.service.PubSubService;
import Behavioral.PubSub.subscriber.Subscriber;
import Behavioral.PubSub.subscriber.SubscriberImpl;

/*
a messaging pattern where senders of messages, called publishers, do not program the messages to be sent directly to
specific receivers, called subscribers, but instead categorize published messages into classes without knowledge of
which subscribers, if any, there may be. Similarly, subscribers express interest in one or more classes and only
receive messages that are of interest, without knowledge of which publishers, if any, there are.
In other word the publisher and the subscriber will never know about the existence of one another. So how they communicate?
There another component named message broker which is known by both publisher and subscriber. The publisher will send
the message to the message broker and the message broker will filtering and broadcasting the message to the right subscriber.


 */


public class DriverClass {

    public static void main(String[] args) {

        Publisher javaPublisher = new PublisherImpl();
        Publisher pythonPublisher = new PublisherImpl();

        Subscriber javaSubscriber = new SubscriberImpl();
        Subscriber pythonSubscriber = new SubscriberImpl();
        Subscriber allLanguageSubscriber = new SubscriberImpl();

        PubSubService service = new PubSubService();

        Message javaMsg1 = new Message("Java", "Core Java Concepts");
        Message javaMsg2 = new Message("Java", "Hibernate");
        Message javaMsg3 = new Message("Java", "Spring boot");

        javaPublisher.publish(javaMsg1, service);
        javaPublisher.publish(javaMsg2, service);
        javaPublisher.publish(javaMsg3, service);

        Message pythonMsg1 = new Message("Python", "Python Concepts");
        Message pythonMsg2 = new Message("Python", "Advanced Python");

        pythonPublisher.publish(pythonMsg1, service);
        pythonPublisher.publish(pythonMsg2, service);

        javaSubscriber.subscribe("Java", service);
        pythonSubscriber.subscribe("Python", service);
        allLanguageSubscriber.subscribe("Java", service);
        allLanguageSubscriber.subscribe("Python", service);

        service.broadcast();

        System.out.println("Messages of Java subscriber are:");
        javaSubscriber.printMessages();



    }


}
