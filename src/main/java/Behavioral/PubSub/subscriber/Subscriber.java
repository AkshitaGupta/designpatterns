package Behavioral.PubSub.subscriber;

import Behavioral.PubSub.Message;
import Behavioral.PubSub.service.PubSubService;

import java.util.List;
import java.util.ArrayList;

public abstract class Subscriber {

    // store all messages recieved by the subscriber
    private List<Message> subscriberMessages = new ArrayList();

    public List<Message> getSubscriberMessages(){
        return subscriberMessages;
    }

    public void setSubscriberMessages(List<Message> subscriberMessages){
        this.subscriberMessages = subscriberMessages;
    }

    // Add subscriber with PubSub service for a topic
    public abstract void subscribe(String topic, PubSubService pubSubService);

    // Unsubscribe subscriber with PubSub service for a topic
    public abstract void unSubscribe(String topic, PubSubService pubSubService);

    // Request specifically for messages related to topic from PubSub service
    public abstract void getMessagesForSubscriberOfTopics(String topic, PubSubService pubSubService);

    // Print all messages received by the subscriber
    public void printMessages(){

        for(Message message : subscriberMessages){
            System.out.println("Message topic" + message.getTopic() + " : " + message.getPayload());
        }
    }

}
