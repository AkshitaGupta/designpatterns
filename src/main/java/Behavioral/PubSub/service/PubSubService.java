package Behavioral.PubSub.service;

import Behavioral.PubSub.Message;
import Behavioral.PubSub.subscriber.Subscriber;

import java.util.*;


public class PubSubService {

    Map<String, Set<Subscriber>> subscribersTopicMap = new HashMap<>();

    Queue<Message> messagesQueue = new LinkedList<>();

    public void addMessageToQueue(Message message){
        messagesQueue.add(message);
    }

    public void addSubscriber(String topic, Subscriber subscriber){

        if(!subscribersTopicMap.containsKey(topic)){
            subscribersTopicMap.put(topic, new HashSet<>());
        }
        subscribersTopicMap.get(topic).add(subscriber);
    }
    public void removeSubscriber(String topic, Subscriber subscriber){
        Set<Subscriber> subscribers = subscribersTopicMap.get(topic);
        if(subscribers != null){
            subscribers.remove(subscriber);
            subscribersTopicMap.put(topic, subscribers);
        }
    }

    //Broadcast new messages added in queue to All subscribers of the topic. messagesQueue will be empty after broadcasting.
    public void broadcast(){

        while(!messagesQueue.isEmpty()){
            Message m = messagesQueue.poll();

            Set<Subscriber> subscribers = subscribersTopicMap.get(m.getTopic());
            for(Subscriber subscriber : subscribers){

                subscriber.getSubscriberMessages().add(m);
            }
        }
    }

    // Request specifically for messages related to topic from PubSub service
    public void getMessagesForSubscriberOfTopic(String topic, Subscriber subscriber){

        while(!messagesQueue.isEmpty()){
            Message m = messagesQueue.poll();

            if(m.getTopic().equalsIgnoreCase(topic)) {
                Set<Subscriber> subscribers = subscribersTopicMap.get(m.getTopic());
                for (Subscriber _subscriber : subscribers) {

                    if(_subscriber.equals(subscriber)) {
                        subscriber.getSubscriberMessages().add(m);
                    }
                }
            }
        }


    }

}
